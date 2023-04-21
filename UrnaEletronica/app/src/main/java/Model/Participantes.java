/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author letic
 */
public abstract class  Participantes implements Participante {
    private int idVotacao;
    private String nome;
    private int votos = 0;

    public Participantes(int idVotacao, String nome) {
        this.idVotacao = idVotacao;
        this.nome = nome;
    }
    
    @Override
    public int getIdVotacao() {
        return idVotacao;
    }
    
    @Override
    public int getVotos() {
        return votos;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    public abstract void adicionarVoto();
    // implementação do método adicionarVoto() para participantes
    // registrar um único voto para o usuário e os votos dos candidatos
    
    
}
