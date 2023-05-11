/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author letic
 */
public class AutenticacaoTest {
    
    public AutenticacaoTest() {
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
     * Test of autenticar method, of class Autenticacao.
     */
    @Test
    public void testAutenticar() {
        System.out.println("autenticar");
        String nome = "";
        String user = "";
        Autenticacao instance = null;
        boolean expResult = false;
        boolean result = instance.autenticar(nome, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar method, of class Autenticacao.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        String nome = "";
        String user = "";
        Autenticacao instance = null;
        boolean expResult = false;
        boolean result = instance.validar(nome, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
