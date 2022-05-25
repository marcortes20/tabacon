package Controlator;

import Model.conexions.Conexion;
import Model.rooms;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author mcortes19
 */
public class management_reserve extends Conexion {

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

        String sql = "SELECT discount FROM discounts";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

             combo_model.addElement(rs.getString("discount") + "%");
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

        String sql = "SELECT room_id FROM rooms WHERE reserved = false AND room_status = true";

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

    public void resize_image_room(String room_path, JLabel lb_image_room) throws IOException {

        BufferedImage bufferedImage = ImageIO.read(new File(room_path));

        Image image = bufferedImage.getScaledInstance(lb_image_room.getWidth(), lb_image_room.getHeight(), Image.SCALE_DEFAULT);

        ImageIcon icon = new ImageIcon(image);

        lb_image_room.setIcon(icon);

    }
}
