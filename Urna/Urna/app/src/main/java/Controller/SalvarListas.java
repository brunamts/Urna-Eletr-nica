/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.HashFile.generateHash;
import Model.Candidato;
import Model.Eleitor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author letic
 */
public class SalvarListas implements SaveList {
    private List<Eleitor> eleitores;
    private List<Candidato> candidatos;
    
    public SalvarListas(List<Eleitor> eleitores, List<Candidato> candidatos){
        this.eleitores = eleitores;
        this.candidatos = candidatos;        
    }
    @Override
    public void subirTxtEleitores(){
        
        try{
            FileWriter arquivo = new FileWriter("eleitores.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            for (Eleitor e : eleitores){
                String hash = null;
                String eleitor = e.getNome()+","+e.getUser();
                try {
                    hash = HashString.generateHash(eleitor);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);
                }
                gravarArquivo.println(eleitor+","+hash);
            }
            gravarArquivo.close();
        } catch (IOException e) {
          System.out.println("Erro ao gravar lista no arquivo" + e.getMessage());  
        }
        

    }
    @Override
    public void subirTxtCandidatos(){
        
        try{
            FileWriter arquivo = new FileWriter("candidatos.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
           
            for (Candidato c : this.candidatos){
                String hash = null;
                String txt = c.getId()+","+c.getNome();
                try {
                    hash = HashString.generateHash(txt);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);
                }
                gravarArquivo.println(txt+","+hash);       
            }
            gravarArquivo.close();
            
        } catch (IOException e) {
          System.out.println("Erro ao gravar lista no arquivo" + e.getMessage());  
        }
    }
    @Override
    public void subirTxtVotos(){
        
        try{
            FileWriter arquivo = new FileWriter("votos.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            for (Eleitor e : eleitores){
                String hash = null;
                String voto = e.getUser()+","+e.getIdCandidato();
                try {
                    hash = HashString.generateHash(voto);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);
                }
                gravarArquivo.println(voto+","+hash);
            }
            gravarArquivo.close();
        } catch (IOException e) {
          System.out.println("Erro ao gravar lista no arquivo" + e.getMessage());  
        }
        

    }
    @Override
    public void subirTxtArquivos(){   
        List<String> dir = new ArrayList();
        dir.add("eleitores.txt");
        dir.add("candidatos.txt");
        dir.add("votos.txt");
        
        try {
            FileWriter arquivo = new FileWriter("arquivos.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            for (String d : dir){
                File file = new File(d);
                try {
                    String hash = HashFile.generateHash(file);
                    gravarArquivo.println(d+","+hash);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            gravarArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    
    
    

