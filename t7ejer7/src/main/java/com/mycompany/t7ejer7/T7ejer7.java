/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7ejer7;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class T7ejer7 {

    public static String pedirDNI(){
        return JOptionPane.showInputDialog("Introduce tu DNI a continuacion");
    }
    
    public static void mostrarSet(Set<String> set){
        for (String s : set){
            JOptionPane.showMessageDialog(null, s);
        }
    }
    
    public static boolean DNICorrecto(String dniIntroducido){
        String patron= "^\\d{8}[ABCDEFGHJKLMNPQRSTVWXYZ]$";
        
        return dniIntroducido.matches(patron);
    }
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        boolean condicionWhile=true;
        
        int conteo=0;
        
        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de personas totales"));
        
        do {
            String dni = pedirDNI();
            
            if (!DNICorrecto(dni)){
                JOptionPane.showMessageDialog(null, "DNI no es correcto.");
            }
            else{
                if (dni.equals("")){
                mostrarSet(set);
                }
                else if (set.add(dni)){
                    conteo++;
                }

                if (conteo==cantidadPersonas){
                    condicionWhile=false;
                
                        mostrarSet(set);
                }
            }

        } while (condicionWhile);
        
    }
}
