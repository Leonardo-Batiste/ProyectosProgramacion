/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer1;

/**
 *
 * @author leona
 */
public class Caballo extends Animal {
    public Caballo(String nombre, String raza){
        super(nombre, raza);
    }
    
    @Override
    public String toString(){
        return "Nombre caballo: " + this.nombre + "\n "
                + "Raza de caballo: " + this.raza+"\n"
                + "Cuidado diario: " + cuidadoDiario(); 
    }
    
    @Override
    public String cuidadoDiario(){
        return "Cepillarle todos los dias";
    }
    
}
