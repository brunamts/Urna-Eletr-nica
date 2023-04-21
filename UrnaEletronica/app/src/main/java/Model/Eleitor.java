/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author letic
 */
public class Eleitor extends Participantes {
    private String senha;
    private boolean votos;

    public Eleitor(int idVotacao, String nome, String senha) {
        super(idVotacao, nome);
        this.senha = senha;
        this.votos = false;
    }

    public boolean isVotos() {
        return votos;
    }
    
    @Override
    public void adicionarVoto() {
        if (this.votos == false){
            this.votos = true;
        }
        else
            System.out.println("Ops você já votou");
            //vamos lançar a mensagem de excessão no swing
            }
       
}