package Controlator;

import Model.conexions.Conexion;
import Model.staff;
import View.login.frm_SignUp;
import View.login.frm_SignIn;
import java.sql.*;
import java.lang.Exception;
import java.util.ArrayList;
import Model.roles_per_user;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class management_Login extends Conexion {

   private frm_SignIn signIn;
   private frm_SignUp signUp;
   private ArrayList<Object> items_Call = new ArrayList<Object>();
   private ArrayList<Object> items_statement = new ArrayList<Object>();
   


    public management_Login() {
    }

    public boolean register_staff(staff User) {
        
        boolean registered = false;
        
        try {

            conectarBD();

            String call = "{CALL ps_staff_register(?,?,?,?,?,?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, User.getId());

            obj_Procedimiento.setString(2, User.getName());

            obj_Procedimiento.setString(3, User.getLast_name());

            obj_Procedimiento.setString(4, User.getUserName());

            obj_Procedimiento.setString(5, User.getPassword());
            
            obj_Procedimiento.setString(6, User.getWorkstation());

            registered = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

        return registered;
    }
    
      public boolean register_roles_per_staff(roles_per_user roles_per_user) {
        
        boolean registered = false;
        
        try {

            conectarBD();

            String call = "{CALL ps_roles_per_staff(?,?)}";

            obj_Procedimiento = conexion.prepareCall(call);

            obj_Procedimiento.setInt(1, roles_per_user.getUser_id());

            obj_Procedimiento.setInt(2, roles_per_user.getUser_role_id());

            registered = obj_Procedimiento.executeUpdate() == 1;

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

        return registered;
        
      }
    
//     public boolean resgister_role_user(staff User){              =================================== // METODO PARA RTEGISTRAR ROLES DE USUARIO/ NO SE NECESITA PORQUE SOLO EXITE CLIENTE Y ADMIN POR DEFECTO=========================================
//     =====
//    boolean rpta = false;
//    
//     conectarBD();
//     
//     String call = "{CALL ps_user_role_register(?,?)}";
//     
//        try {
//            
//            obj_Procedimiento = conexion.prepareCall(call);
//            
//            obj_Procedimiento.setInt(1, User.getId());
//             
//             obj_Procedimiento.setString(2, User.getUser_type());
//            
//             rpta = obj_Procedimiento.executeUpdate() == 1;
//        
//             desconectarBD();
//             
//        }  catch (SQLException ex) {
//            
//            desconectarBD();
//            
//            System.out.println(ex);
//            
//        } catch (Exception e) {
//            
//            desconectarBD();
//            
//            System.out.println(e);
//        }
//        return rpta;
//        
// }
    
    

    public boolean validate_accound(staff User) {

        boolean registered = false;

        try {

            conectarBD();

            String call_name = "ps_staff_validate(?,?)";

            
            items_Call.add(User.getUserName());

            items_Call.add(User.getPassword());

            
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
   
//    public boolean validate_Password(staff User, char[] passArray) { //USAR PARA VALIDAR SI LAS CONTRASE˜NAS NO CONTIENEN CARACTERES ESPECIALES __________NO TOMADO EN CUENTA______
//
//        boolean number_Letter = true;
//
//        for (int i = 0; i < passArray.length; i++) {
//
//            char c = passArray[i];
//
//            if (!Character.isLetterOrDigit(c)) {
//
//                number_Letter = false;
//
//                break;
//
//            }
//            
//            if (number_Letter) {
//                
//             String password = new String(passArray);
//             
//             User.setPassword(password);
//             
//            }else{
//                
//                JOptionPane.showMessageDialog(signIn, "The password must only have letters and numbers.", "Try again", JOptionPane.ERROR_MESSAGE);
//            }
//
//        }
//        
//        return number_Letter;
//
//    }

    public void setPassword_logIN(staff User, char[] passArray){
        
         String password = new String(passArray);
             
             User.setPassword(password);
        
    }
    

    
        public boolean verificate_username(String username){
        
        boolean exist = false;
        
         try {

            conectarBD();

            String sql = "SELECT user_id FROM users WHERE username = ?";
            
            items_statement.add(username);
            
            rs = select(sql ,items_statement);
            
            items_statement.clear();

            if (rs.next()) {
                
              exist = true;
                
              desconectarBD();
            }

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

        
        return exist;
    }
        
        public void getUser(staff User){
            
         try {

            conectarBD();

            String call_name = "ps_search_staff(?)";

            
            items_Call.add(User.getUserName());

            rs = selectProcedure(call_name, items_Call);
            
            items_Call.clear();

            if (rs.next()) {
                
              User.setName(rs.getString(1));
              
              User.setLast_name(rs.getString(2));
              
              User.setEmail(rs.getString(3));
              
              User.setAddress(rs.getString(4));
              
              User.setCompany(rs.getString(5));
              
              User.setPhone_number(rs.getInt(6));
                
            }

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

            
            
        }
 
   

   
    
}
