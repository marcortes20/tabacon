
package Controlator;

import Model.conexions.Conexion;
import Model.customers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;

public class management_customers extends Conexion {
    
   private ArrayList<Object> items_Call = new ArrayList<Object>();
   private ArrayList<Object> items_statement = new ArrayList<Object>();

    public management_customers() {
    }


    public void load_table(JTable table, JLabel lb_total){
        
        items_Call.clear();
        
      conectarBD();
        
      try {
            

           String call_name = "ps_customers_list()";
           
             rs = selectProcedure(call_name, items_Call);
            
             if (rs != null) {

            table.setModel(cargarEnTabla(rs));

            lb_total.setText("Total: " + table.getRowCount());


            }   
    } catch (SQLException ex) {
        
        Logger.getLogger(management_customers.class.getName()).log(Level.SEVERE, null, ex);
        desconectarBD();
    }
        
        desconectarBD();
    }
    
    public boolean registerCustomer(customers customer) {
         boolean rpta = false;
        try {
            conectarBD();
            String call = "{CALL ps_customer_register(?,?,?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, customer.getCustomer_id());
            obj_Procedimiento.setString(2, customer.getName());
            obj_Procedimiento.setString(3, customer.getLast_name());
            obj_Procedimiento.setString(4, customer.getAddress());
            obj_Procedimiento.setString(5, customer.getCompany());
            obj_Procedimiento.setString(6, customer.getEmail());
            obj_Procedimiento.setInt(7, customer.getPhone_number());

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

    public boolean editCustomer(customers customer) {
        boolean rpta = false;
        try {
            conectarBD();
            String call = "{CALL ps_customer_edit(?,?,?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, customer.getCustomer_id());
            obj_Procedimiento.setString(2, customer.getName());
            obj_Procedimiento.setString(3, customer.getLast_name());
            obj_Procedimiento.setString(4, customer.getAddress());
            obj_Procedimiento.setString(5, customer.getCompany());
            obj_Procedimiento.setString(6, customer.getEmail());
            obj_Procedimiento.setInt(7, customer.getPhone_number());

            rpta = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.out.println(ex);
        }
        return rpta;
    }

    public boolean deleteCustomer(int customer_id) {
        boolean rpta = false;
        try {
            conectarBD();

            String call = "{CALL ps_customer_delete(?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, customer_id);

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
    
    public boolean validate_customer_id(int customer_id){
        
       boolean registered = false;

        try {

            conectarBD();

            String call_name = "ps_customer_validate(?)";
            
            items_Call.add(customer_id);

            rs = selectProcedure(call_name, items_Call);
            
            items_Call.clear();

            if (rs.next()) {
                
                registered = true;
                
                desconectarBD();
            }

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

        return registered;
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

    public customers searchCustomer(customers customer) {

        

        try {
            conectarBD();

            String call = "{CALL ps_customer_search (?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, customer.getCustomer_id());

            rs = obj_Procedimiento.executeQuery();

            if (rs.next()) {

                customer.setCustomer_id(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setLast_name(rs.getString(3));
                customer.setAddress(rs.getString(4));
                customer.setCompany(rs.getString(5));
                customer.setEmail(rs.getString(6));
                customer.setPhone_number(rs.getInt(7));
            }
            desconectarBD();
        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);

        }
        return customer;
    }
    
    public void generate_xml(){
        
        String file_name = "Customers_list.xls";
        
        String sql = "SELECT * FROM customers";
        
        generate_exel(sql, file_name);
    }

}
