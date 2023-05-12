/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letic
 */
public class CarregarListas implements LoadList {

    public CarregarListas() {  
    }
    
    @Override
    public List<Eleitor> carregarTxtEleitores(){
       List<Eleitor> eleitores = new ArrayList(); 
       try{
            FileReader arquivo = new FileReader("eleitores.txt");
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            
            String linha = lerArquivo.readLine();
            while (linha != null) {
                String [] objeto = linha.split(",");
                String nome = objeto[0];
                String user = objeto[1];
                int idCandidato = Integer.parseInt(objeto[2]);
                
                
                Eleitor eleitor = new Eleitor(nome, user, idCandidato);
                eleitores.add(eleitor); 
                
            }
            
        } catch (IOException e){
            System.out.println("Erro ao ler arquivo" + e.getMessage());   
        }
       return eleitores;
       
    }
    
        @Override
        public List<Candidato> carregarTxtCandidatos(){
        List<Candidato> candidatos = new ArrayList();
        try{
            FileReader arquivo = new FileReader("candidatos.txt");
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            
            String linha = lerArquivo.readLine();
            while (linha != null) {
                String [] objeto = linha.split(",");
                int id = Integer.parseInt(objeto[0]);
                String nome = objeto [1];
                int votos = Integer.parseInt(objeto[2]);
                
                
                
                Candidato candidato = new Candidato(id, nome, votos);
                candidatos.add(candidato);
 
            }
        } catch (IOException e){
            System.out.println("Erro ao ler arquivo" + e.getMessage());   
        }
        return candidatos;
    }
    
}
