/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Eleitor;
import java.util.List;

/**
 *
 * @author letic
 */
public class Autenticacao implements Auth{
    private List<Eleitor> eleitores; 

   public Autenticacao(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
   } 
   
    @Override
   public boolean autenticar(String nome, String user){
       if (this.validar(nome, user)){
           // Botar um alert pois esse eleitor ja votou
           return false;
       }
        Eleitor eleitor = new Eleitor(nome, user);
        this.eleitores.add(eleitor);
        //System.out.println(this.eleitores);
        return true;
   }
   
    @Override
   public boolean validar(String nome, String user){
       for (Eleitor e : eleitores) {
            if (e.getNome().equals(nome) && e.getUser().equals(user)) {
                return true;
            }
        }
        return false;
   }
   
    
}
