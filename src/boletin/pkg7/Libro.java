/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Libro {
    //ATTRS
    private String titulo, autor;
    private int ejemplares, prestados;
    //Constructores
    public Libro(){};
    
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo=titulo; this.autor=autor; this.ejemplares=ejemplares;
        this.prestados=prestados;
    }
    //Metodos
    //Setter-getters
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public void setPrestados(int prestados){
        this.prestados=prestados;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getEjemplares(){
        return this.ejemplares;
    }
    public int getPrestados(){
        return this.prestados;
    }
    //prestamo
    public boolean Prestamo(){
        if (this.ejemplares>this.prestados){
            this.prestados++;
            return true;
            }
        else{
            return false;
        }
    }
    //devolucion
    public boolean Devolucion(){
        if (this.prestados>0){
        this.prestados--;
        return true;}
        else{
            return false;}
        }
    //Metodo to string
    public void ToString(){
        JOptionPane.showMessageDialog(null, "Titulo: "+titulo+"\nAutor: "+autor+
                "\nNº de ejemplares: "+ejemplares+"\nEjemplares "
                + "disponibles "+(ejemplares-prestados));
    }
    
}
