/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

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
public class CandidatoTest {
    
    public CandidatoTest() {
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
     * Test of getId method, of class Candidato.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Candidato instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Candidato.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Candidato instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Candidato.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Candidato instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Candidato.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Candidato instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVotos method, of class Candidato.
     */
    @Test
    public void testGetVotos() {
        System.out.println("getVotos");
        Candidato instance = null;
        int expResult = 0;
        int result = instance.getVotos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotos method, of class Candidato.
     */
    @Test
    public void testSetVotos() {
        System.out.println("setVotos");
        int votos = 0;
        Candidato instance = null;
        instance.setVotos(votos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarVoto method, of class Candidato.
     */
    @Test
    public void testAdicionarVoto() {
        System.out.println("adicionarVoto");
        Candidato instance = null;
        instance.adicionarVoto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
