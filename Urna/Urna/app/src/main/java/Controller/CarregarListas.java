/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Arquivos;
import Model.Candidato;
import Model.Eleitor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letic
 */
public class CarregarListas implements LoadList {

    public CarregarListas() {
    }

    @Override
    public List<Eleitor> carregarTxtEleitores() {
        List<Eleitor> votos = this.carregarTxtVotos();
        List<Eleitor> eleitores = new ArrayList();

        try {
            Path path = Paths.get("eleitores.txt");
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {
                String[] objeto = linha.split(",");
                String nome = objeto[0];
                String user = objeto[1];
                String hash = objeto[2];

                Eleitor eleitor = new Eleitor(nome, user, hash);
                eleitores.add(eleitor);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
        if (votos.isEmpty() || eleitores.isEmpty()){
           return eleitores;
        }
        for (int i = 0; i < votos.size(); i++) {
            int IdCandidato = votos.get(i).getIdCandidato();
            eleitores.get(i)
                    .setIdCandidato(IdCandidato);     
        }
        return eleitores;

    }

    @Override
    public List<Candidato> carregarTxtCandidatos() {
        List<Candidato> candidatos = new ArrayList();
        try {

            Path path = Paths.get("candidatos.txt");
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {
                String[] objeto = linha.split(",");
                int id = Integer.parseInt(objeto[0]);
                String nome = objeto[1];
                String hash = objeto[2];

                Candidato candidato = new Candidato(id, nome, hash);
                candidatos.add(candidato);

            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
        return candidatos;
    }

    @Override
    public List<Eleitor> carregarTxtVotos() {
        List<Eleitor> eleitores = new ArrayList();
        try {
            Path path = Paths.get("votos.txt");
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {
                String[] objeto = linha.split(",");
                String user = objeto[0];
                int voto = Integer.parseInt(objeto[1]);
                String hash = objeto[2];

                Eleitor eleitor = new Eleitor(user, voto, hash);
                eleitores.add(eleitor);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
        return eleitores;

    }

    @Override
    public List<Arquivos> carregarTxtArquivos() {
        List<Arquivos> arquivos = new ArrayList();
        try {
            Path path = Paths.get("arquivos.txt");
            List<String> linhasArquivo = Files.readAllLines(path);

            for (String linha : linhasArquivo) {
                String[] objeto = linha.split(",");
                String nome = objeto[0];
                String hash = objeto[1];

                Arquivos arquivo = new Arquivos(nome, hash);
                arquivos.add(arquivo);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
        return arquivos;

    }
}
