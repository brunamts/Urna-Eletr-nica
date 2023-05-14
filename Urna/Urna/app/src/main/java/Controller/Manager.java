/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidato;
import Model.Eleitor;
import java.util.List;
import Controller.Auth;
import java.util.HashMap;
import java.util.Map;

/*
 * @author letic
 */
public class Manager implements IManager{

    private List<Candidato> candidatos;
    private List<Eleitor> eleitores;
    private Auth auth;
    private LoadList load;

    public Manager(
            List<Candidato> candidatos,
            List<Eleitor> eleitores,
            Auth auth,
            LoadList load
    ) {
        this.candidatos = candidatos;
        this.eleitores = eleitores;
        this.auth = auth;
        this.load = load;
    }

    public Manager(
            List<Candidato> candidatos,
            List<Eleitor> eleitores,
            Auth auth
    ) {
        this.candidatos = candidatos;
        this.eleitores = eleitores;
        this.auth = auth;
    }

    public boolean isValid(String nome, String user) {
        return this.auth.autenticar(nome, user);
    }

    public List<Candidato> getCandidato() {
        return this.candidatos;
    }

    public Candidato getVencedor() {

        // Itera sobre a lista de candidatos
        List<Eleitor> votos = this.load.carregarTxtVotos();

        Map<String, Integer> candidatos = new HashMap<>();

        for (Eleitor e : votos) {
            var candidato = e.getIdCandidato();
            if (candidato == 1) {
                candidatos.put("Kimetsu no Yaba", candidatos.getOrDefault("Kimetsu no Yaba", 0) + 1);
                continue;
            }
            if (candidato == 2) {
                candidatos.put("Shingeki no Kyojin", candidatos.getOrDefault("Shingeki no Kyojin", 0) + 1);
                continue;
            }
            if (candidato == 3) {
                candidatos.put("Dragon Ball Z", candidatos.getOrDefault("Dragon Ball Z", 0) + 1);
                continue;
            }
            if (candidato == 4) {
                candidatos.put("One Piece", candidatos.getOrDefault("One Piece", 0) + 1);
            }
        }
        int maiorVotos = Integer.MIN_VALUE;
        String candidatoMaisVotado = "Vencedor";

        for (Map.Entry<String, Integer> entry : candidatos.entrySet()) {
            String candidato = entry.getKey();
            int votosVencedor = entry.getValue();

            if (votosVencedor > maiorVotos) {
                candidatoMaisVotado = candidato;
                maiorVotos = votosVencedor;
            }
        }

        return new Candidato(0, candidatoMaisVotado, maiorVotos);
    }

    public Eleitor lastEleitor() {
        int i = this.eleitores.size() - 1;
        return this.eleitores.get(i);
    }
}
