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
public class Ejemplo02 {
    
    public static void main(String[] args) {
        String pais;
        
        pais = "Ecuador";
        // El metodo .charAt sirve para seleccionar caracteres 
        // segun el numero que escribamos (0,1,2,3,4,5...)
        char letra = pais.charAt(0);
        System.out.printf("%s\n", letra);
        
    }
}
