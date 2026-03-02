/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7ejer8;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Main {

    public static void main(String[] args) {
        List<Contacto> lista = new LinkedList<>();
        
        //Este for crea X contactos
        int cantidadContactos = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de contactos"));
        
        for (int i=0;i<cantidadContactos;i++){
            String nombreContacto = JOptionPane.showInputDialog("Añade el nombre del contacto");
            int numeroContacto = 0;
            String emailContacto = "";
            
            //Numero del contacto
            String añadirNumero = JOptionPane.showInputDialog("Quieres añadir numero al contacto? (s/n)");
            switch (añadirNumero){
                case "s":
                    numeroContacto = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del contacto"));
                    break;
                    
                default:
                    break;
            }
            
            //Email contacto
            String añadirEmail = JOptionPane.showInputDialog("Quieres añadir email al contacto? (s/n)");
            switch (añadirEmail) {
                case "s":
                    emailContacto = JOptionPane.showInputDialog("Introduce el email del contacto");
                    break;
                    
                default:
                    break;
            }

            //Constructor con solo nombre
            if (numeroContacto == 0 && emailContacto.equals("")){
                Contacto contacto = new Contacto(nombreContacto, null, null);
                lista.add(contacto);
                break;
            }
            
            //Constructor con numero
            else if (numeroContacto!=0){
                Contacto contacto = new Contacto(nombreContacto, numeroContacto, null);
                lista.add(contacto);
                break;
            }
            
            //Constructor con email
            else if (!emailContacto.equals("")){
                Contacto contacto = new Contacto(nombreContacto, null, emailContacto);
                lista.add(contacto);
                break;
            }
            
            //Constructor con numero y email de contacto
            else {
                Contacto contacto = new Contacto(nombreContacto, numeroContacto, emailContacto);
                lista.add(contacto);
            }
        }
        
        
        
    }
}
