/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author letic
 */
public class Eleitor {
    private String nome;
    private String user;
    private int idCandidato;
    private String hash;   

    public Eleitor(String nome, String user) {
        this.nome = nome;
        this.user = user;
    }

    public Eleitor(String user, int idCandidato, String hash) {
        this.user = user;
        this.idCandidato = idCandidato;
        this.hash = hash;
    }
    public Eleitor(String nome, String user , String hash) {
        this.nome = nome;
        this.user = user;
        this.hash = hash;
    }
    
    public int getIdCandidato() {
        return idCandidato;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }         
    
    
}