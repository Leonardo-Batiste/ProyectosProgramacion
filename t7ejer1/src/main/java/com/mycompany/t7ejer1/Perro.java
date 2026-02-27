/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer1;

/**
 *
 * @author leona
 */
public class Perro extends Animal implements Parlanchin {
    public Perro(String nombre, String raza){
        super(nombre, raza);
    }
    
    @Override
    public String toString(){
        return "Nombre perro: " + this.nombre + "\n "
                + "Raza perro: " + this.raza; 
    }
    
    @Override
    public String cuidadoDiario(){
        return "Pasearlo 3 veces al dia";
    }
    
    @Override
    public String habla(){
        return "*ladra* Guau";
    }
}
