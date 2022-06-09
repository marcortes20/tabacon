/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlator;

import Model.conexions.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author mcortes19
 */
public class management_Menu extends Conexion {

    public static void main(String[] args) {

    }

    public management_Menu() {
    }

    Conexion con = new Conexion();

    public void exel() {
        String sql = "SELECT * FROM  staff";

    }

    public void show_manual() {
        

        String dir = System.getProperty("user.dir") + "/user manual.pdf";

         try {
             
        File user_manual = new File(dir);
        
        Desktop.getDesktop().open(user_manual);
        
    } catch (IOException ex) {
        
       
    }

//        if (operative_sistem.contains("Windows")) {
//
//            try {
//                Runtime.getRuntime().exec("cmd /c start " + dir);
//            } catch (IOException ex) {
//                System.out.println(ex);
//            }
//
//        } else if (operative_sistem.contains("Mac")) {
//
//            try {
//                Runtime.getRuntime().exec("open " + dir);
//                
//            } catch (IOException ex) {
//                System.out.println(ex);
//            }
//
//        }

    }
}
