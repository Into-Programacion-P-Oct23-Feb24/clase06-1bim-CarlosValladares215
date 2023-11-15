/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        // El metodo de toUpperCase() hace que las variables tipo cadena
        // se pongan en mayuscula
        ciudad = ciudad.toUpperCase();
        // El meto toLowerCase() convierte una variable tipo string en minuscula
        System.out.printf("%s\n", ciudad.toLowerCase());
        System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        
        
    }
}
