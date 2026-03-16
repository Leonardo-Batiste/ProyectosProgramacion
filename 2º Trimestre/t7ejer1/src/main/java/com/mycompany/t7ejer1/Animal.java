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

    public String getNombre() {
        return nombre;
    }
    
    
    
    public static void eliminarAnimal(Collection<Animal> coleccionAnimales, String nombreAnimal){
        boolean seHaEliminado=false;
        
        Iterator<Animal> it = coleccionAnimales.iterator();

        while (it.hasNext()) {        // 1. ¿Hay más elementos?
            Animal indiceAnimal = it.next(); // 2. AVANZA y COGE el actual
    
            if (indiceAnimal.getNombre().equals(nombreAnimal)) {
                it.remove();           // 3. Elimina el ÚLTIMO que cogió (el de línea 2)
                seHaEliminado=true;
            }
        }
        
        if (seHaEliminado){
            JOptionPane.showMessageDialog(null, "Se ha eliminado el animal llamado "+nombreAnimal);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha eliminado ningun animal, porque no se ha encontrado.");
        }
    }
    
    
}
