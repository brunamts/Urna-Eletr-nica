/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

/**
 *
 * @author letic
 */
public interface Auth {
    public boolean autenticar(String nome, String user);
    public boolean validar(String nome, String user);
}
