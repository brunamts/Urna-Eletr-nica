/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.util.List;

/**
 *
 * @author bruna
 */
public interface IManager {
    
    public boolean isValid(String nome, String user);
    public List<Candidato> getCandidato();
    public Candidato getVencedor();
    public Eleitor lastEleitor(); 
    
}
