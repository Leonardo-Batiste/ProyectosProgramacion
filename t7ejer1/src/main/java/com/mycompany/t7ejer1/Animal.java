/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer1;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public abstract class Animal {
    protected String nombre;
    
    protected String raza;
    
    public Animal(String nombre, String raza){
        this.nombre=nombre;
        this.raza=raza;
    }
    
    public abstract String cuidadoDiario();
    
    public abstract String toString();
    
    public static void mostrarTodosDatos(Collection<Animal> array){
        int posicionAnimal=0;
        for (Animal animal: array){
            JOptionPane.showMessageDialog(null, "Posicion animal: "+posicionAnimal +"\n "+ animal);
            posicionAnimal++;
        }
    }
    
    
}
