/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7ejer1;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        Collection<Animal> listaAnimales = new ArrayList<>();
        
        boolean condicionWhile = true;
        
        //Este while sirve para simplemente crear los animales
        while (condicionWhile){
            int animalACrear=Integer.parseInt(JOptionPane.showInputDialog("Que animal deseas crear?"+"\n"
                                                            + "0 - Ninguno"+"\n"
                                                            + "1 - Perro"+"\n"
                                                            + "2 - Gato"+"\n"
                                                            + "3 - Caballo"));

            switch (animalACrear){
                case 0:
                    condicionWhile=false;
                    break;

                case 1:
                    String nombrePerro=JOptionPane.showInputDialog("Introduce el nombre del perro:");
                    String razaPerro=JOptionPane.showInputDialog("Introduce la raza del perro:");
                    
                    Animal perro = new Perro(nombrePerro, razaPerro);
                    listaAnimales.add(perro);
                    JOptionPane.showMessageDialog(null, "Se ha creado el objeto perro correctamente.");
                    break;

                case 2:
                    String nombreGato=JOptionPane.showInputDialog("Introduce el nombre del Gato:");
                    String razaGato=JOptionPane.showInputDialog("Introduce la raza del Gato:");
                    
                    Animal gato = new Gato(nombreGato, razaGato);
                    JOptionPane.showMessageDialog(null, "Se ha creado el objeto Gato correctamente.");
                    listaAnimales.add(gato);
                    break;

                case 3:
                    String nombreCaballo=JOptionPane.showInputDialog("Introduce el nombre del Caballo:");
                    String razaCaballo=JOptionPane.showInputDialog("Introduce la raza del Caballo:");
                    
                    Animal caballo = new Caballo(nombreCaballo, razaCaballo);
                    listaAnimales.add(caballo);
                    JOptionPane.showMessageDialog(null, "Se ha creado el objeto Caballo correctamente.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Has introducido la creacion de un animal que no es correcto, vuelve a intentarlo.");
                    break;
                    
                //!!!Falta aqui creo? introducirlos en el ArrayList, o sacarlos fuera del while?
            }
        }
        
        //Mostramos los datos de todos los animales
        Animal.mostrarTodosDatos(listaAnimales);
        
    }
}
