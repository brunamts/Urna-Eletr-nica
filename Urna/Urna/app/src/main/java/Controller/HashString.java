/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author bruna
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashString {

    public static String generateHash(String text) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(text.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public static void main(String[] args) {
        try {
            String hash = generateHash("minha string para hash");
            System.out.println("Hash SHA256 da string: " + hash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Erro ao gerar hash: " + e.getMessage());
        }
    }
}
