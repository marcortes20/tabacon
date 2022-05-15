/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Modelo.conexiones.Conexion;

/**
 *
 * @author mcortes19
 */
public class management_Menu  extends Conexion {

   
    public static void main(String[] args) {
        
    }

    public management_Menu() {
    }
    
    Conexion con = new Conexion();
    
    
    public void exel(){
        String sql = "SELECT * FROM  staff";
   
       
    }
    
}
