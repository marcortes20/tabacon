/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo.conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mcortes19
 */
public class ConexionTest {
    
    public ConexionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setServidor method, of class Conexion.
     */
    @Test
    public void testSetServidor() {
        System.out.println("setServidor");
        int servidor = 0;
        Conexion.setServidor(servidor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectarBD method, of class Conexion.
     */
    @Test
    public void testConectarBD() {
        System.out.println("conectarBD");
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.conectarBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarArchivoExcel method, of class Conexion.
     */
    @Test
    public void testGenerarArchivoExcel() {
        System.out.println("generarArchivoExcel");
        String sql = "";
        Conexion instance = new Conexion();
        instance.generarArchivoExcel(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectarBD method, of class Conexion.
     */
    @Test
    public void testDesconectarBD() {
        System.out.println("desconectarBD");
        Conexion instance = new Conexion();
        instance.desconectarBD();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionar method, of class Conexion.
     */
    @Test
    public void testSeleccionar() {
        System.out.println("seleccionar");
        String sql = "";
        Conexion instance = new Conexion();
        ResultSet expResult = null;
        ResultSet result = instance.seleccionar(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Conexion.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        String sql = "";
        ArrayList items_statement = null;
        Conexion instance = new Conexion();
        ResultSet expResult = null;
        ResultSet result = instance.select(sql, items_statement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectProcedure method, of class Conexion.
     */
    @Test
    public void testSelectProcedure() throws Exception {
        System.out.println("selectProcedure");
        String nombre = "";
        ArrayList items_call = null;
        Conexion instance = new Conexion();
        ResultSet expResult = null;
        ResultSet result = instance.selectProcedure(nombre, items_call);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutar method, of class Conexion.
     */
    @Test
    public void testEjecutar() throws Exception {
        System.out.println("ejecutar");
        String sql = "";
        Conexion instance = new Conexion();
        instance.ejecutar(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConexion method, of class Conexion.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarEnTabla method, of class Conexion.
     */
    @Test
    public void testCargarEnTabla() {
        System.out.println("cargarEnTabla");
        ResultSet rs = null;
        Conexion instance = new Conexion();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.cargarEnTabla(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarBitacora method, of class Conexion.
     */
    @Test
    public void testRegistrarBitacora() {
        System.out.println("registrarBitacora");
        String usuario = "";
        String proceso = "";
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.registrarBitacora(usuario, proceso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarIdXusuario method, of class Conexion.
     */
    @Test
    public void testBuscarIdXusuario() {
        System.out.println("buscarIdXusuario");
        String usuario = "";
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.buscarIdXusuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
