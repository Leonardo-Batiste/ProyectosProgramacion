/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7ejer4;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        
        List<GregorianCalendar> lista = new ArrayList<>();
        
        int cantidadFechas = Integer.parseInt(JOptionPane.showInputDialog("Selecciona cuantas fechas quieres generar"));
        
        for (int i=0;i<cantidadFechas;i++){
            
            int año = rand.nextInt(1900, 2019+1);
            int mes = rand.nextInt(0, 12+1);
            int dia = rand.nextInt(1, 31+1);
            
            GregorianCalendar fecha = new GregorianCalendar(año, mes, dia); // no se si justo cae febrero, existe la % de que ponga mas de 28 dias? o si tiene en cuenta bisiestos
            lista.add(fecha);
        }
        
        /*
        System.out.println("-----Antes de ordenar-----");
        for (GregorianCalendar cal : lista){
            System.out.println(cal.getTime());
        }
        */
        
        Collections.sort(lista);
        
        System.out.println("-----Despues de ordenar-----");
        for (GregorianCalendar cal : lista){
            System.out.println(cal.getTime());
        }
        
    }
}
