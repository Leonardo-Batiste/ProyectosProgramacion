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
            int mes = rand.nextInt(0, 11+1);
            //Hasta aqui bien, pero el dia depende del mes
            
            //Para ello vamos a crear un calendario temporal para saber los dias de ese mes
            GregorianCalendar CalendarioTemporal = new GregorianCalendar(año, mes, 1);
            int maxDia=CalendarioTemporal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int dia = rand.nextInt(1, maxDia+1);
            
            GregorianCalendar fecha = new GregorianCalendar(año, mes, dia);
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
