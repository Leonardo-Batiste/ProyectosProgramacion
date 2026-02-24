/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7p203;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class Libro {   
    
    protected String isbn;
    
    private static Collection<String> listaISBN=new HashSet<>();
    
    protected String titulo;
    
    protected String escritor;
    
    protected int añoPublicacion;
    
    protected int numeroUnidadesStock;
    
    /**
     * Precio en euros 
     */
    protected double precio;
    
    public Libro(String isbn, String titulo, String escritor, int año, int numUnidades, double precio) throws IsbnIncorrectoException{
        this.titulo=titulo;
        this.escritor=escritor;
        this.añoPublicacion=año;
        this.numeroUnidadesStock=numUnidades;
        this.precio=precio;
        
        if (listaISBN.add(isbn)){
            this.isbn=isbn;
        }
        else {
            throw new IsbnIncorrectoException("ya existe otro libro con ese ISBN en la lista.");
        }
    }
    
    /**
     * !!!Falta indicar el precio con 2
     * @return 
     */
    @Override
    public String toString(){
        return "ISBN: "+this.isbn+"\n "
                + "Titulo: "+this.titulo+"\n "
                + "Escritor: "+this.escritor+"\n "
                + "Año: "+this.añoPublicacion+"\n "
                + "Numero de Unidades: "+numeroUnidadesStock+"\n "
                + "Precio: "+this.precio;
    }
    
    public String mostrarDatosLibro(){
        return toString();
    }
    
    public static boolean eliminarISBN(String isbn){
        return listaISBN.remove(isbn);
    }
    
}
