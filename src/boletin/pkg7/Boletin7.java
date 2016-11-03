/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7;

/**
 *
 * @author otorradomiguez
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro_001=new Libro("El Quijote", "Miguel de Cervantes", 12 , 0);
        libro_001.ToString();
        libro_001.Devolucion();
        libro_001.ToString();
    }
    
}
