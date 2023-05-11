/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controller;

import Model.Eleitor;
import java.util.ArrayList;
import java.util.List;
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
        List<Eleitor> eleitores;
        eleitores = new ArrayList<>();
        Autenticacao autenticacao = new Autenticacao(eleitores);

        String nome = "Anderson";
        String user = "anderson123";
        boolean resultado = autenticacao.autenticar(nome, user);

        assertEquals(true, resultado);
        assertEquals(true, autenticacao.validar(nome, user));
    }

    /**
     * Test of validar method, of class Autenticacao.
     */
    @Test
    public void testValidar() {
        List<Eleitor> eleitores;
        eleitores = new ArrayList<>();
        eleitores.add(new Eleitor("Eric", "eric123"));
        eleitores.add(new Eleitor("Stella", "stella456"));
        eleitores.add(new Eleitor("Fernanda", "fernanda789"));

        Autenticacao autenticacao = new Autenticacao(eleitores);

        assertEquals(true, autenticacao.validar("Stella", "stella456"));
 
        assertEquals(false, autenticacao.validar("Matheus", "matheus000"));
    }
    
}