/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.Fraudado;
import Model.Arquivos;
import Model.Candidato;
import Model.Eleitor;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author letic
 */
public class ValidarHash implements ValidateHash {

    private LoadList load;

    public ValidarHash(LoadList load) {
        this.load = load;
    }

    @Override
    public boolean validarTxtEleitores() throws Fraudado {

        List<Eleitor> eleitores = this.load.carregarTxtEleitores();
        for (Eleitor e : eleitores) {

            String hash = null;
            String eleitor = e.getNome() + "," + e.getUser();
            try {
                hash = HashString.generateHash(eleitor);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (!hash.equals(e.getHash())) {
                throw new Fraudado("Eleitor: " + e.toString());
            }
        }

        return true;
    }

    @Override
    public boolean validarTxtCandidatos() throws Fraudado {

        List<Candidato> candidatos = this.load.carregarTxtCandidatos();
        for (Candidato c : candidatos) {

            String hash = null;
            String txt = c.getId() + "," + c.getNome();
            try {
                hash = HashString.generateHash(txt);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (!hash.equals(c.getHash())) {
                throw new Fraudado("Candidato: " + c.toString());
            }
        }

        return true;
    }

    @Override
    public boolean validarTxtVotos() throws Fraudado {
        List<Eleitor> eleitores = this.load.carregarTxtVotos();
        for (Eleitor e : eleitores) {

            String hash = null;
            String voto = e.getUser() + "," + e.getIdCandidato();
            try {
                hash = HashString.generateHash(voto);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (!hash.equals(e.getHash())) {
                throw new Fraudado("Eleitor: " + e.toString());
            }
        }

        return true;
    }

    @Override
    public boolean validarTxtArquivos() throws Fraudado, IOException {

        List<Arquivos> arquivos = this.load.carregarTxtArquivos();
        for (Arquivos a : arquivos) {

            String hash = null;
            File file = new File(a.getNome());
            try {
                hash = HashFile.generateHash(file);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SalvarListas.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (!hash.equals(a.getHash())) {
                throw new Fraudado("Arquivo: " + a.toString());
            }
        }

        return true;
    }
}
