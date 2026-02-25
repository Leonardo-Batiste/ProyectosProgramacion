/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7p203;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Main {

    public static void main(String[] args) {
        boolean condicionWhile=true;
        Collection<Libro> listaLibros=new LinkedList<>();
        
        do {
            int opcionMenu=Integer.parseInt(JOptionPane.showInputDialog(
                                                "Que desea hacer?: "+""
                                                + "\n0 - Salir del programa"+""
                                                + "\n1 - Insertar libro en lista"+""
                                                + "\n2 - Eliminar un libro, por ISBN, de la lista"+""
                                                + "\n3 - Consultar un libro, por ISBN, de la lista"+""
                                                + "\n4 - Consultar todos los libros de la lista"+""
                                                + "\n5 - Consultar todos los libros de la lista, en orden por precio descendente"+""
                                                + "\n6 - Consultar varios libros, por escritor, de la lista."
                                            ));
            
            switch (opcionMenu){
                case 0:
                    JOptionPane.showMessageDialog(null,"Ha seleccionado salir del programa.");
                    condicionWhile=false;
                    break;
                
                case 1:
                    String isbnLibroIntroducir=JOptionPane.showInputDialog("Introduce el ISBN:");
                    String tituloLibroIntroducir=JOptionPane.showInputDialog("Introduce el titulo:");
                    String escritorLibroIntroducir=JOptionPane.showInputDialog("introduce el autor:.");
                    String añoLibroIntroducir=JOptionPane.showInputDialog("Introduce el año de publicacion:");
                    String numUnidadesLibroIntroducir=JOptionPane.showInputDialog("Introduce el numero de unidades:");
                    String precioLibroIntroducir=JOptionPane.showInputDialog("Introduce el precio del libro:");
                    
                    try {
                        Libro nuevoLibro=new Libro(isbnLibroIntroducir, añoLibroIntroducir, añoLibroIntroducir, opcionMenu, opcionMenu, opcionMenu);
                        JOptionPane.showMessageDialog(null, "Se ha insertado el libro en la lista.");
                    }
                    catch (IsbnIncorrectoException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                
                case 2:
                    try {
                        String libroEliminar=JOptionPane.showInputDialog("Introduce el ISBN del libro a eliminar.");
                    
                        Libro.eliminarISBN(libroEliminar);
                    }
                    catch (noContieneIsbnException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    
                    break;
                
                case 3:
                    
                    try{
                        String libroConsultar=JOptionPane.showInputDialog("Introduce el ISBN del libro a consultar:");

                        Libro libroEncontrado=null;

                        for (Libro libro : listaLibros ){
                            if (libro.equals(libroConsultar)){
                                libroEncontrado=libro;
                                break;
                            }
                        }

                        if (libroEncontrado != null){
                           JOptionPane.showMessageDialog(null, libroEncontrado.mostrarDatosLibro());
                        }
                        else{
                            throw new noContieneIsbnException("No existe ningún libro con ese ISBN en la lista.");
                        } 
                    }
                    catch (noContieneIsbnException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    
                    break;

                    
                case 4:
                    break;
                
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                //Falta la opcion en caso de que no sea =0 <=6
            }
            
        } while(condicionWhile);
    }
}
