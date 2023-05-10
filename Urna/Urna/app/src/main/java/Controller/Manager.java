/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.util.List;

/**
 *
 * @author letic
 */
public class Manager {
    private List<Candidato> candidatos;
    private List<Eleitor> eleitores;

    public Manager(List<Candidato> candidatos, List<Eleitor> eleitores) {
        this.candidatos = candidatos;
        this.eleitores = eleitores;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Eleitor> getEleitores() {
        return eleitores;
    }

    public void setEleitores(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }
    
    
    
}
