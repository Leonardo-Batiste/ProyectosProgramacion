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
        List<Contacto> agendaContactos = new LinkedList<>();
        
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
                    
                default:
            }
            
            //Email contacto
            String añadirEmail = JOptionPane.showInputDialog("Quieres añadir email al contacto? (s/n)");
            switch (añadirEmail) {
                case "s":
                    emailContacto = JOptionPane.showInputDialog("Introduce el email del contacto");
                    
                default:
            }

            //Constructor con solo nombre
            if (numeroContacto == 0 && emailContacto.equals("")){
                Contacto contacto = new Contacto(nombreContacto, null, null);
                agendaContactos.add(contacto);
            }
            
            //Constructor con numero
            else if (numeroContacto!=0){
                Contacto contacto = new Contacto(nombreContacto, numeroContacto, null);
                agendaContactos.add(contacto);
            }
            
            //Constructor con email
            else if (!emailContacto.equals("")){
                Contacto contacto = new Contacto(nombreContacto, null, emailContacto);
                agendaContactos.add(contacto);
            }
            
            //Constructor con numero y email de contacto
            else {
                Contacto contacto = new Contacto(nombreContacto, numeroContacto, emailContacto);
                agendaContactos.add(contacto);
            }
        }
        
        Collections.sort(agendaContactos, new ComparadorNombre());
        
        for (Contacto c : agendaContactos){
            System.out.println(c);
        }
        
    }
}
