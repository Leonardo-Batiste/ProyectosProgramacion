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
    
    public Libro(String isbn, String titulo, String escritor, int año, int numUnidades, double precio){
        this.titulo=titulo;
        this.escritor=escritor;
        this.añoPublicacion=año;
        this.numeroUnidadesStock=numUnidades;
        this.precio=precio;
        
        if (listaISBN.add(isbn)){
            this.isbn=isbn;
        }
        else {
            //Excepcion??
        }
    }
    
}
