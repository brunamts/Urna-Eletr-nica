/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Exceptions.Fraudado;
import java.io.IOException;

/**
 *
 * @author letic
 */
public interface ValidateHash {
    public boolean validarTxtEleitores() throws Fraudado;
    public boolean validarTxtCandidatos() throws Fraudado;
    public boolean validarTxtVotos() throws Fraudado;
    public boolean validarTxtArquivos() throws Fraudado, IOException;
    
}
