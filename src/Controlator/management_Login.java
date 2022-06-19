package Controlator;

import Model.conexions.Conexion;
import Model.staff;
import View.login.frm_SignUp;
import View.login.frm_SignIn;
import java.sql.*;
import java.lang.Exception;
import java.util.ArrayList;
import Model.roles_per_user;



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
    
    
       public int search_role(int user_id) {

        int role = 0;

        try {

            conectarBD();

            String call_name = "ps_search_role(?)";

            
            items_Call.add(user_id);

            rs = selectProcedure(call_name, items_Call);
            
            items_Call.clear();

            if (rs.next()) {
                
                user_id = rs.getInt(1);
                
                desconectarBD();
            }

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

        return user_id;
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

            String sql = "SELECT staff_id FROM staff WHERE username = ?";
            
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
              
              User.setId(rs.getInt(1));
                
              User.setName(rs.getString(2));
              
              User.setLast_name(rs.getString(3));
              
              User.setEmail(rs.getString(4));
              
              User.setAddress(rs.getString(5));
              
              User.setCompany(rs.getString(6));
              
              User.setPhone_number(rs.getInt(7));
              
                
            }

            desconectarBD();

        } catch (Exception e) {

            desconectarBD();

            System.out.println(e);
        }

            
            
        }
 
   

   
    
}
