/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlator;

import Model.conexions.Conexion;
import Model.rooms;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author mcortes19
 */
public class management_reserve extends Conexion {

    public void fill_combo_customer(JComboBox<String> combo) {

        String sql = "SELECT customer_id FROM customers";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

                combo.addItem((rs.getString("customer_id")));

            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }

    }

    public void fill_combo_rooms(JComboBox<String> combo) {

        String sql = "SELECT room_id FROM rooms WHERE reserved = false AND room_status = false";

        conectarBD();

        rs = seleccionar(sql);

        try {

            while (rs.next()) {

                combo.addItem((rs.getString("room_id")));

            }

            desconectarBD();

        } catch (SQLException ex) {

            desconectarBD();
        }

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

            String call = "{CALL ps_search_room(?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, room_id);

            rs = obj_Procedimiento.executeQuery();

            if (rs.next()) {

               
                room.setMaximun_adults(rs.getInt(1));
                room.setMaximun_kids(rs.getInt(2));
                room.setPrice_per_day_adults(rs.getDouble(3));
                room.setPrice_per_day_kids(rs.getDouble(4));
                room.setRoom_status(rs.getBoolean(6));
                room.setReserved(rs.getBoolean(7));
                room.setImage(rs.getString(8));

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
}
