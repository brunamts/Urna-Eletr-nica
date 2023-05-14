/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author letic
 */
public class Fraudado extends Exception {
    

    public Fraudado() {
        super();
    }

    public Fraudado(String message) {
        super("Fraude "+message);
    }

    public Fraudado(String message, Throwable cause) {
        super(message, cause);
    }
}
    
