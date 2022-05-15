package Modelo.conexiones;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Conexion {

    static PoolConexionMySql poolConexion;
    protected static int servidor;
    static protected Connection conexion;//Para hacer la conexión
    protected CallableStatement obj_Procedimiento;//Utilizar los procedure
    protected PreparedStatement ps;
    protected Statement stmt;//Hacer sentencias SQL
    protected ResultSet rs;//Guardar los resultados de las sentencias SQL
    //MÉTODOS PÚBLICOS DE LA CLASE CONEXCIONBD
    //Constructor default

    public Conexion() {
        // conexion = null;
        obj_Procedimiento = null;
        if (poolConexion == null) {
            poolConexion = new PoolConexionMySql();
        }
    }//=========================================================================
    //Establece conexion a Oracle con el usuario y clave establecidos

    public static void setServidor(int servidor) {
        Conexion.servidor = servidor;
    }

    public synchronized boolean conectarBD() {
        conexion = poolConexion.getConexion();
        if (conexion != null) {

            return true;
        } else {
//            conexion = poolConexion.getConexion();
            return false;
        }
    }//=========================================================================
    //Desconecta la conexion con Oracle y el usuario establecidos anteriormente

    public void generate_exel(String sql) {
        try {
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("hoja1");
            HSSFRow row = sheet.createRow(0);

            rs = seleccionar(sql);
            conectarBD();

            ResultSetMetaData Datos = rs.getMetaData();
            row = sheet.createRow(0);
            for (int i = 0; i < Datos.getColumnCount(); i++) {
                row.createCell(i).setCellValue(Datos.getColumnName(i + 1).toUpperCase());
            }

            int fil = 1;
            while (rs.next()) {
                row = sheet.createRow(fil++);
                for (int col = 0; col < Datos.getColumnCount(); col++) {
                    try {
                        row.createCell(col).setCellValue(rs.getObject(col + 1).toString());
                    } catch (Exception e) {
                        row.createCell(col).setCellValue("");

                    }
                }
            }
            JFileChooser fc = new JFileChooser();

            fc.setSelectedFile(new File("Lista.xls"));
            int returnVal = fc.showSaveDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try ( FileOutputStream fileOut = new FileOutputStream(file.getPath())) {
                    wb.write(fileOut);
                }

                String operative_sistem = System.getProperty("os.name");
                
                System.out.println(operative_sistem);

                String dir = file.getPath();
                
               

                try {

                    
                    //VALIDAR EL SISTEMA OPERATIVO PARA PODER ABIRIR EXEL DESDE CONSOLA
                    
                    if (operative_sistem.contains("Windows")) {

                        Runtime.getRuntime().exec("cmd /c start " + dir);

                    } else if (operative_sistem.contains("Mac")) {
                        
//                        Runtime.getRuntime().exec("cd " + dir);
//                        
//                        Runtime.getRuntime().exec("chmod 775 Lista.xls");

                        System.out.println("estamos qui");
                        
                        Runtime.getRuntime().exec("open " + dir);

                    }

                } catch (IOException e) {

                    System.out.println("EXCEPTION: " + e.getMessage());

                }

                JOptionPane.showMessageDialog(null, "Archivo " + fc.getSelectedFile().getName() + " guarado exitosamente");

            }
        } catch (SQLException | HeadlessException | IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al exportar la consulta: " + e);
            desconectarBD();
        }
        desconectarBD();
    }

    public synchronized void desconectarBD() {

        if (obj_Procedimiento != null) {
            try {
                obj_Procedimiento.close();
            } catch (SQLException e) {
            } // nothing we can do
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            } // nothing we can do
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
            } // nothing we can do
        }
        if (conexion != null) {
            try {
                conexion.close();

            } catch (SQLException e) {
            } // nothing we can do
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
            } // nothing we can do
        }

    }
    //=========================================================================
    //MÉTODO ESPECIAL QUE PERMITE IMPRIMIR LOS RESULTADOS ESTABLECIDOS EN LAS 

    public synchronized ResultSet seleccionar(String sql) {

        try {
            conectarBD();

            stmt = conexion.createStatement();

            rs = stmt.executeQuery(sql);

        } catch (SQLException ex) {

            desconectarBD();

            System.out.println(ex + "aqui");
        }

        return rs;
    }//=========================================================================
    //Método que ejecuta cualquier sentencia de actualización(update, delete, 
    //insert) pasada por parametro.

    //=====================================================================
    // metodo creado para hacer una consulta sin conocer cual va a ser la clausula del dato a
    public synchronized ResultSet select(String sql, ArrayList items_statement) {

        try {

            ps = conexion.prepareStatement(sql);

            for (int i = 0; i < items_statement.size(); i++) {

                ps.setString(i + 1, items_statement.get(i).toString());

            }

            rs = ps.executeQuery();

        } catch (SQLException ex) {

            System.out.println(ex);
        }
        return rs;
    }

    public ResultSet selectProcedure(String nombre, ArrayList items_call) throws SQLException { // implementar metodos

        String call = "{CALL " + nombre + "}";

        obj_Procedimiento = getConexion().prepareCall(call);

        for (int i = 0; i < items_call.size(); i++) {

            obj_Procedimiento.setString(i + 1, items_call.get(i).toString());

        }

        rs = obj_Procedimiento.executeQuery();

        return rs;

    }

    public synchronized void ejecutar(String sql) throws SQLException {
        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }//=========================================================================

    public Connection getConexion() {
        return conexion;
    }

    //MÉTODO ESPECIAL QUE PERMITE IMPRIMIR LOS RESULTADOS ESTABLECIDOS EN LAS 
    //CONSULTAS SQL EN LOS JTABLES DE LOS FORMULARIOS, EN FORMA GENERAL PARA 
    //CUALQUIER JTABLE Y CUALQUIER CONSULTA
    public synchronized DefaultTableModel cargarEnTabla(ResultSet rs) {
        DefaultTableModel modelo = null;
        ResultSetMetaData metaDatos;
        Object[] etiquetas;

        final int numeroColumnas;
        try {
            metaDatos = rs.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();
            etiquetas = new Object[numeroColumnas];
            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 0; i < numeroColumnas; i++) {
                // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                etiquetas[i] = metaDatos.getColumnLabel(i + 1).toUpperCase();
            }

            modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    etiquetas) {

                boolean[] canEdit = new boolean[numeroColumnas];

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

            while (rs.next()) {
                // Se crea un array que será una de las filas de la tabla.
                Object[] fila = new Object[numeroColumnas]; // Hay tres columnas en la tabla

                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                for (int i = 0; i < numeroColumnas; i++) {

                    fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                }
                // Se añade al modelo la fila completa.
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
        }
        return modelo;
    }//=========================================================================

    public boolean registrarBitacora(String usuario, String proceso) {
        boolean rpta = false;
        try {
            //Nos conectamos 
            conectarBD();
            //Busca los datos del profesor
            usuario = buscarIdXusuario(usuario);
            String call = "{CALL proc_guardarBitacora(?,?)}";
            //Preparamos la sentecia
            obj_Procedimiento = conexion.prepareCall(call);
            //Identificacion
            obj_Procedimiento.setString(1, usuario);
            obj_Procedimiento.setString(2, proceso);

            rpta = obj_Procedimiento.executeUpdate() == 1 ? true : false;

        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);

        } catch (Exception ex) {
            desconectarBD();
        }

        desconectarBD();
        return rpta;
    }

    public String buscarIdXusuario(String usuario) {
        String identificacion = "";
        try {
            //Nos conectamos 

            //Busca los datos del profesor
            String call = "{CALL proc_buscarIDxUsuario(?)}";
            //Preparamos la sentecia
            obj_Procedimiento = conexion.prepareCall(call);
            //Identificacion
            obj_Procedimiento.setString(1, usuario);
            ResultSet rs1 = obj_Procedimiento.executeQuery();
            if (rs1.next()) {
                identificacion = rs1.getString(1);
            }

        } catch (SQLException ex) {
            desconectarBD();
        }
        return identificacion;
    }

}
