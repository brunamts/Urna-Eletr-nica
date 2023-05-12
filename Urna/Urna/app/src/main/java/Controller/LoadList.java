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
 * @author letic
 */
public interface LoadList {
    public List<Eleitor> carregarTxtEleitores();
    public List<Candidato> carregarTxtCandidatos();
   
}
