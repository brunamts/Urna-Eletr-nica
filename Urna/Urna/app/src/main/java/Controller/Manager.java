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

    public List<Candidato> getCandidato(){
        return this.candidatos;
    }
    
    public Candidato getVencedor(){
        Candidato candidatoMaisVotado = new Candidato(0, "");
        int maiorQuantidadeVotos = 0;

        // Itera sobre a lista de candidatos
        for (Candidato candidato : candidatos) {
            int quantidadeVotos = candidato.getVotos();

            // Verifica se a quantidade de votos do candidato atual é maior que a maior quantidade de votos encontrada até agora
            if (quantidadeVotos > maiorQuantidadeVotos) {
                maiorQuantidadeVotos = quantidadeVotos;
                candidatoMaisVotado.setId(candidato.getId());
                candidatoMaisVotado.setNome(candidato.getNome());
                candidatoMaisVotado.setVotos(candidato.getVotos());
            }
        }
        return candidatoMaisVotado;
    }
    
    public Eleitor lastEleitor(){
        int i = this.eleitores.size()-1;
        return this.eleitores.get(i);
    }
}
