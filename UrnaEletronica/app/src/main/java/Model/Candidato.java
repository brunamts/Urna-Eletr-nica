/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author letic
 */
public class Candidato extends Participantes {
    private String genero;
    private int votos;

    public Candidato(int idVotacao, String nome, String genero){
        super(idVotacao, nome);
        this.genero = genero;
        this.votos = 0;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getVotos() {
        return votos;
    }
    
    
    @Override
    public void adicionarVoto() {
        votos++;
    }
       
    
    
}
