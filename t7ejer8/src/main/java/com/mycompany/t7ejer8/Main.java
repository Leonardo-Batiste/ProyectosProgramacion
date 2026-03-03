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
            //inicializar las variables
            String nombreContacto = JOptionPane.showInputDialog("Añade el nombre del contacto");
            Integer numeroContacto = 0;
            String emailContacto = "";
            
            //Numero del contacto
            String añadirNumero = JOptionPane.showInputDialog("Quieres añadir numero al contacto? (Introduce el numero, o n para saltarlo)");
            String patronNumero = "\\d+"; //Aqui es muy general pero porque no es importante que sea correcto el numero de tlfn, con que sea digito 0-9 me sirve
            
            if (añadirNumero.matches(patronNumero)){
                numeroContacto = Integer.parseInt(añadirNumero);
            }
            else if (añadirNumero.equals("n")){
                numeroContacto=null;
            }
            //!!!A lo mejor faltaria un else tambien, pero no es importante
            
            //Email contacto
            String añadirEmail = JOptionPane.showInputDialog("Quieres añadir email al contacto? (Introduce el email o n para saltarlo)");
            //!!!Faltaria a lo mejor un pattern y matcher pero no importa
            if (añadirEmail.equals("n")){
                emailContacto=null;
            }
            else{
                emailContacto=añadirEmail;
            }

            //Constructor con solo nombre
            if (numeroContacto==null && emailContacto==null){
                Contacto contacto = new Contacto(nombreContacto, null, null);
                agendaContactos.add(contacto);
            }
            
            //Constructor con numero
            else if (numeroContacto!=null){
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
        
        JOptionPane.showMessageDialog(null, "A continuacion, se imprimira por consola los datos de los contactos");
        
        for (Contacto c : agendaContactos){
            System.out.println(c);
        }
        
        String opcionBorrado = JOptionPane.showInputDialog("Elige la opcion que desea"+"\n"
                                + "1-Borrar todos los contactos que no tienen teléfono y mostrar de nuevo la lista."+"\n"
                                + "2-Borrar todos los contactos que no tienen email y mostrar de nuevo la lista."+"\n"
                                + "3-Finalizar el programa.");
        
        Iterator<Contacto> it = agendaContactos.iterator();
        
        switch (opcionBorrado){    
            case "1":
                while (it.hasNext()) {
                    Contacto c = it.next();
                    
                    if (c.getNumero()==null){
                        it.remove();
                        JOptionPane.showMessageDialog(null, "Se ha borrado al contacto"+c.getNombre());
                    }    
                }
                
                for (Contacto contactoInformacion : agendaContactos){
                        System.out.println(contactoInformacion);
                }
                
            case "2":
                while (it.hasNext()){
                    Contacto c = it.next();
                    
                    if (c.getEmail()==null){
                        it.remove();
                        JOptionPane.showMessageDialog(null, "Se ha borrado al contacto"+c.getNombre());
                    }
                }
                
                System.out.println("-----Contactos restantes-----");
                for (Contacto contactoInformacion : agendaContactos){
                        System.out.println(contactoInformacion);
                }
                
            case "3":
                JOptionPane.showMessageDialog(null, "Se va a salir del programa");
                break;
        }
        
    }
}
