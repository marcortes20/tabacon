package Controlator;

import Model.conexions.Conexion;
import Model.reservation;
import Model.rooms;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author mcortes19
 */
public class management_reserve extends Conexion {
    
     private ArrayList<Object> items_Call = new ArrayList<Object>();

    public void fill_combo_customer(JComboBox<String> combo) {
    
 @SuppressWarnings("unchecked")
        DefaultComboBoxModel<String> combo_model = new DefaultComboBoxModel();
              

        String sql = "SELECT customer_id FROM customers";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

                combo_model.addElement(rs.getString("customer_id"));
            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }

        combo.setModel(combo_model);

    }

    public void fill_combo_discount(JComboBox<String> combo) {
       
 @SuppressWarnings("unchecked")
        DefaultComboBoxModel<String> combo_model = new DefaultComboBoxModel();

        String sql = "SELECT discount_id FROM discounts";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

                combo_model.addElement(rs.getString("discount_id") + "%");
            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }

        combo.setModel(combo_model);

    }

    public void fill_combo_rooms(JComboBox<String> combo) {

        @SuppressWarnings("unchecked")
        DefaultComboBoxModel<String> combo_model = new DefaultComboBoxModel();

        //String sql = "SELECT room_id FROM rooms WHERE reserved = false AND room_status = true";
        
        String sql = "SELECT room_id FROM rooms";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

                combo_model.addElement(rs.getString("room_id"));

            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }
        combo.setModel(combo_model);
    }

    public String search_customer_name(String customer_id) {

        String sql = "SELECT name,last_name FROM customers WHERE customer_id = " + customer_id;
        String name = null;
        conectarBD();

        rs = seleccionar(sql);

        try {

            if (rs.next()) {

                name = rs.getString("name");
                name += " " + rs.getString("last_name");

            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }
        return name;
    }

    public rooms search_room(int room_id) {

        rooms room = new rooms();

        try {
            conectarBD();

            String call = "{CALL ps_reserve_room(?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, room_id);

            rs = obj_Procedimiento.executeQuery();

            if (rs.next()) {

                room.setImage(rs.getString(1));
                room.setMaximun_adults(rs.getInt(2));
                room.setMaximun_kids(rs.getInt(3));
                room.setPrice_per_day_adults(rs.getDouble(4));
                room.setPrice_per_day_kids(rs.getDouble(5));
                room.setReserved(rs.getBoolean(6));
            }

            desconectarBD();

        } catch (SQLException ex) {
            desconectarBD();
            System.out.println(ex);

        } catch (Exception e) {
            desconectarBD();
            System.out.println(e);
        }
        return room;

    }

    public void resize_image_room(String image_room_path, JLabel lb_image_room) throws IOException {

        BufferedImage bufferedImage = ImageIO.read(new File(image_room_path));

        Image image = bufferedImage.getScaledInstance(lb_image_room.getWidth(), lb_image_room.getHeight(), Image.SCALE_DEFAULT);
        
//        Image image = bufferedImage.getScaledInstance(290, 310, Image.SCALE_DEFAULT);

        ImageIcon icon = new ImageIcon(image);

        lb_image_room.setIcon(icon);

    }

    public boolean update_room(int room_id) {

        boolean updated = false;

        String sql = "UPDATE rooms as R set R.reserved = true WHERE room_id = " + room_id;

        try {

            updated = ejecutar(sql);

        } catch (SQLException ex) {

            Logger.getLogger(management_reserve.class.getName()).log(Level.SEVERE, null, ex);
        }

        return updated;
    }
    
    public boolean reserve_register(reservation reserve){
            boolean saved = false;
            
        try {
            
            obj_Procedimiento = getConexion().prepareCall("{CALL ps_reserve_register(?,?,?,?,?,?,?,?,?,?)}");
            
            obj_Procedimiento.setInt(1, reserve.getRoom_id());
            
            obj_Procedimiento.setInt(2, reserve.getDiscount_id());
            
            obj_Procedimiento.setInt(3, reserve.getStaff_id());
            
            obj_Procedimiento.setInt(4, reserve.getCustomer_id());
            
            obj_Procedimiento.setString(5, reserve.getWay_to_pay());
            
            obj_Procedimiento.setInt(6, reserve.getAdults_number());
            
            obj_Procedimiento.setInt(7, reserve.getKids_number());
            
            obj_Procedimiento.setString(8,reserve.getEntry_date());
            
            obj_Procedimiento.setString(9, reserve.getDeparture_date());
            
            obj_Procedimiento.setInt(10, reserve.getReserved_days());
            
            saved = obj_Procedimiento.executeUpdate() == 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(management_reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saved;
    }

    public boolean register_reserve_room(reservation reserve) {
        
        boolean done = false;
        boolean reserve_saved = false, room_updated = false;

        try {
            //Obtenemos la conexion
            conectarBD();
            //Decimos que vamos a crear una transaccion
            getConexion().setAutoCommit(false);

            
            
            reserve_saved = reserve_register(reserve);

            room_updated = update_room(reserve.getRoom_id());

            if (reserve_saved && room_updated) {
                
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
    
     public void load_table(JTable table, JLabel lb_total){
        
        items_Call.clear();
        
      conectarBD();
        
      try {
            

           String call_name = "ps_reserve_list()";
           
             rs = selectProcedure(call_name, items_Call);
            
             if (rs != null) {

            table.setModel(cargarEnTabla(rs));

            lb_total.setText("Total: " + table.getRowCount());


            }   
    } catch (SQLException ex) {
        
        Logger.getLogger(management_reserve.class.getName()).log(Level.SEVERE, null, ex);
        desconectarBD();
    }
        
        desconectarBD();
    }
     
     public void search_reservation(reservation reserve){
         
          try {
            conectarBD();

            String call = "{CALL ps_search_reserve (?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, reserve.getReservation_id());

            rs = obj_Procedimiento.executeQuery();

            if (rs.next()) {

            
            reserve.setRoom_id(rs.getInt(1));
            reserve.setDiscount_id(rs.getInt(2));
            reserve.setStaff_id(rs.getInt(3));
            reserve.setCustomer_id(rs.getInt(4));
            reserve.setWay_to_pay(rs.getString(5));
            reserve.setAdults_number(rs.getInt(6));
            reserve.setKids_number(rs.getInt(7));
            reserve.setCurrent_date(rs.getString(8));
            reserve.setEntry_date(rs.getString(9));
            reserve.setDeparture_date(rs.getString(10));
            reserve.setReserved_days(rs.getInt(11));
               
             
            }
            desconectarBD();
        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);

        }
     }
     
     public boolean edit_reservation(reservation reserve){
            boolean edited = false;
        try {
            conectarBD();
            
            String call = "{CALL ps_reserve_edit(?,?,?,?,?,?,?,?,?,?)}";
            
            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, reserve.getReservation_id());
            obj_Procedimiento.setInt(2, reserve.getRoom_id());
            obj_Procedimiento.setInt(3, reserve.getDiscount_id());
            obj_Procedimiento.setInt(4, reserve.getCustomer_id());
            obj_Procedimiento.setString(5, reserve.getWay_to_pay());
            obj_Procedimiento.setInt(6, reserve.getAdults_number());
            obj_Procedimiento.setInt(7, reserve.getKids_number());
            obj_Procedimiento.setString(8, reserve.getEntry_date());
            obj_Procedimiento.setString(9, reserve.getDeparture_date());
            obj_Procedimiento.setInt(10, reserve.getReserved_days());

            edited = obj_Procedimiento.executeUpdate() == 1;
            
          

            desconectarBD();

        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.out.println(ex);
        }
        return edited;
     }

       public boolean delete_reservation(int reservation_id) {
        boolean rpta = false;
        try {
            conectarBD();

            String call = "{CALL ps_reserve_delete(?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, reservation_id);

            rpta = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
}
