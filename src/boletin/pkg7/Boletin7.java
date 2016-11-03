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
        Libro libro_001=new Libro("El Quijote", "Miguel de Cervantes", 12 , 12);
        Libro libro_002=new Libro();
        libro_002.setTitulo("El Señor de los anillos");
        libro_002.setAutor("J.R.R. Tolkien");
        libro_002.setEjemplares(1);
        libro_002.ToString();
        libro_001.Prestamo();
        libro_001.ToString();
        libro_001.Devolucion();
        libro_001.ToString();
        Libro libro_003= new Libro("a","b",1,1);
    }
    
}
