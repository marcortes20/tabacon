/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlator;


import Model.conexions.Conexion;
import Model.rooms;
import View.ifrm_rooms;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;



public class management_rooms  extends Conexion{
    
    public management_rooms() {
    }
    
    public boolean room_register(rooms room){
    
        boolean registered = false;
        
          try {

            conectarBD();

            String call = "{CALL ps_room_register(?,?,?,?,?,?,?,?,?)}";
            
            

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, room.getRoom_id());

            obj_Procedimiento.setString(2, room.getDescription());

            obj_Procedimiento.setString(3, room.getImage());

            obj_Procedimiento.setInt(4, room.getMaximun_adults());

            obj_Procedimiento.setInt(5, room.getMaximun_kids());
            
            
            obj_Procedimiento.setDouble(6, room.getPrice_per_day_adults());
            
            obj_Procedimiento.setDouble(7, room.getPrice_per_day_kids());
            
            obj_Procedimiento.setBoolean(8, room.isRoom_status());

            obj_Procedimiento.setBoolean(9, room.isReserved());
            
            registered = obj_Procedimiento.executeUpdate() == 1;
            
              

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }
        
        return registered;
        
    }
    
    public void search_room(rooms room){
        
        try {
            conectarBD();

            String call = "{CALL ps_search_room(?)}";
            
            obj_Procedimiento = conexion.prepareCall(call);
            
             obj_Procedimiento.setInt(1, room.getRoom_id());
             
             rs = obj_Procedimiento.executeQuery();
             
             if (rs.next()) {
                
                room.setDescription(rs.getString(1));
                room.setMaximun_adults(rs.getInt(2));
                room.setMaximun_kids(rs.getInt(3));
                room.setPrice_per_day_adults(rs.getDouble(4));
                room.setPrice_per_day_kids(rs.getDouble(5));
                room.setRoom_status(rs.getBoolean(6));
                room.setReserved(rs.getBoolean(7));
                room.setImage(rs.getString(8));
                
                
            }
        
             desconectarBD();
             
        }  catch (SQLException ex) {
            desconectarBD();
            System.out.println(ex);
            
        } catch (Exception e) {
            desconectarBD();
            System.out.println(e);
        }
        
    
        
    }
    
     public ResultSet rooms_list(rooms room){
        
        try {
            String call = "{CALL ps_list_rooms}";
            
            obj_Procedimiento = conexion.prepareCall(call);
            
            rs = obj_Procedimiento.executeQuery();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.out.println(ex);
            
        } catch (Exception e) {
            desconectarBD();
            System.out.println(e);
        }
            return rs;
        
    }
      
    public boolean edit_room(rooms room){
        
        
         boolean registered = false;
        
          try {

            conectarBD();

            String call = "{CALL ps_edit_room(?,?,?,?,?,?,?,?,?)}";
            
            

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, room.getRoom_id());

            obj_Procedimiento.setString(2, room.getDescription());

            obj_Procedimiento.setString(3, room.getImage());

            obj_Procedimiento.setInt(4, room.getMaximun_adults());

            obj_Procedimiento.setInt(5, room.getMaximun_kids());
            
            
            obj_Procedimiento.setDouble(6, room.getPrice_per_day_adults());
            
            obj_Procedimiento.setDouble(7, room.getPrice_per_day_kids());
            
            obj_Procedimiento.setBoolean(8, room.isRoom_status());

            obj_Procedimiento.setBoolean(9, room.isReserved());
            
            registered = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }
        
        return registered;
        
    }
    
    public boolean delete_room(int room_id){
       
        boolean deleted = false;
        
          try {

            conectarBD();

            String call = "{CALL ps_delete_room(?)}";
            
            

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, room_id);

            
            deleted = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }
        
        
        return deleted;
    }
    
    public void generate_xml(){
        
        String file_name = "Rooms_list.xls";
        
        String sql = "SELECT room_id, description, maximum_adults, maximun_kids,price_per_day_adults,price_per_day_kids,room_status,reserved FROM rooms";
        
        generate_exel(sql, file_name);
    }
    
    public boolean validate_int_format(String text) {

        boolean is_number = true;

        try {

         int test = Integer.parseInt(text);

        } catch (NumberFormatException e) {

            is_number = false;

        }

        return is_number;

    }
    
    public boolean validate_double_format(String text) {

        boolean is_number = true;

        try {

         double test = Double.parseDouble(text);

        } catch (NumberFormatException e) {

        is_number = false;

        }

        return is_number;

    }
    
    public String search_room_img(int room_id){
        
        String img = null;
        
          try {
            conectarBD();

            String call = "{CALL ps_search_room_img(?)}";
            
            obj_Procedimiento = conexion.prepareCall(call);
            
             obj_Procedimiento.setInt(1, room_id);
             
             rs = obj_Procedimiento.executeQuery();
             
             if (rs.next()) {
                
             img = rs.getString(1);
                
            }
        
             desconectarBD();
             
        }  catch (SQLException ex) {
            desconectarBD();
            System.out.println(ex);
            
        } catch (Exception e) {
            desconectarBD();
            System.out.println(e);
        }
        
        return img;
        
    }
    
    public void report(){
//          
//            
//        
//        try {
//            //report = (JasperReport) JRLoader.loadObject(getClass().getResource("/reports/Rooms.jasper"));
//            File file = new File("/Users/mcortes19/NetBeansProjects/tabacon_Hotel /src/reports/Rooms.jasper");
// System.out.println(file.isFile());
// 
//            JasperReport report = (JasperReport) JRLoader.loadObject(file);
//             System.out.println(file.isFile());
//            
//           // JasperPrint jprint = JasperFillManager.fillReport(report, null, mana_rooms.getConexion());
//            JasperPrint jprint = JasperFillManager.fillReport(report, null, getConexion());
//
//            JasperViewer view = new JasperViewer(jprint, true);
//            
//            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            
//            view.setVisible(true);
//            
//        } catch (JRException ex) {
//            Logger.getLogger(ifrm_rooms.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
}
    
    

