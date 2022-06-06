/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlator;

import Model.conexions.Conexion;
import Model.invoice_detail;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 *
 * @author mcortes19
 */
import Model.invoices;
public class management_invoice extends Conexion {

    private ArrayList<Object> items_Call = new ArrayList<Object>();


    public void load_table(JTable table, int reserve_id) {

        items_Call.clear();

        conectarBD();

        try {

            String call_name = "ps_invoice_list(?)";

            items_Call.add(reserve_id);

            rs = selectProcedure(call_name, items_Call);

            if (rs != null) {

                table.setModel(cargarEnTabla(rs));

            }
        } catch (SQLException ex) {

            Logger.getLogger(management_customers.class.getName()).log(Level.SEVERE, null, ex);
            desconectarBD();
        }

        desconectarBD();
    }

    public int load_invoice_number() {

        int invoice_number = 0;

        String sql = "SELECT count(*)+1 FROM invoices";

        conectarBD();

        rs = seleccionar(sql);

        try {

            if (rs.next()) {

                invoice_number = rs.getInt(1);
            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }

        return invoice_number;
    }
    
    public boolean invoice_register(invoices invoice){
        
        boolean registered = false;
        
            conectarBD();

        try {
            
            obj_Procedimiento = getConexion().prepareCall("{CALL ps_invoice_register (?)}");
            
            
            obj_Procedimiento.setInt(1, invoice.getReservation_id());

            
            registered = obj_Procedimiento.executeUpdate() == 1;
            
       
            
        } catch (SQLException ex) {
            Logger.getLogger(management_reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return registered;
    }
    
    
        public boolean invoice_detail_register(invoice_detail detail){
        
        boolean registered = false;
        
            conectarBD();

        try {
            
            obj_Procedimiento = getConexion().prepareCall("{CALL invoices_details_register (?,?,?,?)}");
            
            
            obj_Procedimiento.setInt(1, detail.getInvoice_id());
            obj_Procedimiento.setInt(2, detail.getDiscount());
            obj_Procedimiento.setDouble(3, detail.getSubtotal());
            obj_Procedimiento.setDouble(4, detail.getTotal());

            
            registered = obj_Procedimiento.executeUpdate() == 1;
            
       
            
        } catch (SQLException ex) {
            Logger.getLogger(management_reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return registered;
    }

        
         public boolean register_invoice_and_invoice_detail(invoices invoice, invoice_detail detail) {
        
        boolean done = false;
        boolean invoice_saved = false, invoice_detail_saved = false;

        try {
            //Obtenemos la conexion
            conectarBD();
            //Decimos que vamos a crear una transaccion
            getConexion().setAutoCommit(false);

            invoice_saved = invoice_register(invoice);
            
            invoice_detail_saved = invoice_detail_register(detail);
           

            if (invoice_saved && invoice_detail_saved) {
                
                //Confirmamos la transaccion
                getConexion().commit();
                done = true;
            } else {
                //Negamos la transaccion
                getConexion().rollback();
            }
            desconectarBD();
            
        } catch (SQLException e) {
            
            System.out.println(e);
            
            try {
                
                getConexion().rollback();
                
            } catch (SQLException ex) {
                
                System.out.println(ex);
            }
            
            desconectarBD();
        }

        return done;

    }
    
}
