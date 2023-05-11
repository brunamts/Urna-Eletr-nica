/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.util.List;
import Controller.Autenticacao;
import Controller.Auth;
 
 /*
 * @author letic
 */
public class Manager {
    private List<Candidato> candidatos;
    private List<Eleitor> eleitores;
    private Auth auth;
    
    public Manager(
            List<Candidato> candidatos,
            List<Eleitor> eleitores,
            Auth auth
    ) {
        this.candidatos = candidatos;
        this.eleitores = eleitores;
        this.auth = auth;
    }

    public boolean isValid(String nome, String user){
        return this.auth.autenticar(nome, user);
    }
}
