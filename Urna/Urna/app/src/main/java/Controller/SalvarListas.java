/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
                //nome user
                gravarArquivo.println(e.getNome()+" "+e.getUser());
            }
        } catch (IOException e) {
          System.out.println("Erro ao gravar lista no arquivo" + e.getMessage());  
        }
        

    }
    @Override
    public void subirTxtCandidatos(){
        
        try{
            FileWriter arquivo = new FileWriter("candidatos.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            for (Candidato c : candidatos){
                //id nome votos
                gravarArquivo.println(c.getId()+" "+c.getNome()+" "+c.getVotos());
            }
        } catch (IOException e) {
          System.out.println("Erro ao gravar lista no arquivo" + e.getMessage());  
        }
    }
       
}
    
    
    

