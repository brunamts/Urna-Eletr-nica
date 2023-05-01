/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author letic
 */
import java.util.List;
import java.util.Scanner;
import Model.Eleitor;

public class AutenticaUsuario {
    
    private List<Eleitor> usuarios;
    Scanner scanner = new Scanner(System.in)
   
    public class AutenticaUsuario(List<Eleitor> usuarios){
        this.usuarios = usuarios;
}
            
    public boolean Autenticacao(String nome, String user){
        if (this.autenticar(nome, user)){
            // BOTAR AQUI UM ALERT
            return false;
        }
        eleitor = new Eleitor(nome, user);
        this.usuarios.add(Eleitor);
        return true;
    }
   
    public boolean autenticar(String nome, String user)
        // Verifica se o usuário é válido comparando com a lista
        for (Eleitor u : usuarios) {
            if (u.getNome().equals(nome) && u.getUser() == user) {
                return true;
            }
        }
        return false;
    }

    
}
