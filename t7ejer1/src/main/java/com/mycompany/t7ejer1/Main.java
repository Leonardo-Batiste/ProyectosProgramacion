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
        
        int cantidadAnimalesACrear=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos animales quieres crear:"));
        
        int animalACrear=Integer.parseInt(JOptionPane.showInputDialog("Que animal deseas crear?"+"\n"
                                                        + "0 - Ninguno"+"\n"
                                                        + "1 - Perro"+"\n"
                                                        + "2 - Gato"+"\n"
                                                        + "3 - Caballo"));
        
        switch (animalACrear){
            case 0:
                break;
                
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            //La opcion esa de si no es ninguna de las anteriores
        }
    }
}
