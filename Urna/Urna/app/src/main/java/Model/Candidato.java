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

    private int id;
    private String nome;
    private int votos;
    private String hash;

    public Candidato(int id, String nome, int votos) {
        super(id, nome, votos);
        this.id = id;
        this.nome = nome;
        this.votos = votos;

    }

    public Candidato(int id, String nome, String hash) {
        super(id, nome);
        this.id = id;
        this.nome = nome;
        this.hash = hash;
    }

    public Candidato(int id, String nome) {
        super(id, nome);
        this.id = id;
        this.nome = nome;
        this.votos = 0;
    }

    public Candidato(int id, String nome, int votos, String hash) {
        super(id, nome);
        this.id = id;
        this.nome = nome;
        this.votos = 0;
        this.hash = hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public void adicionarVoto() {
        votos++;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id=" + id + ", nome=" + nome + ", votos=" + votos + '}';
    }

}
