/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer1;

/**
 *
 * @author leona
 */
public class Gato extends Animal implements Parlanchin{
    public Gato(String nombre, String raza){
        super(nombre, raza);
    }
    
    @Override
    public String toString(){
        return "Nombre gato: " + this.nombre + "\n "
                + "Raza de gato: " + this.raza+"\n"
                + "Cuidado diario: "+cuidadoDiario()+"\n"
                + this.nombre + " quiere decir algo: "+habla();
    }
    
    @Override
    public String cuidadoDiario(){
        return "Cambiarle la caja de arena";
    }
    
    @Override
    public String habla(){
        return "*Maulla* Miau";
    }
}
