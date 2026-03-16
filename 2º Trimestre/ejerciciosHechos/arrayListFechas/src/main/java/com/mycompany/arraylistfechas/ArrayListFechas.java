/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistfechas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author AluDAM
 */
public class ArrayListFechas {

    public static void main(String[] args) {
        ArrayList<GregorianCalendar> fechas = new ArrayList();
        
        //metodos por ser una clase collection
        
        //No se si esto es una forma
        fechas.add(new GregorianCalendar(2023, 0, 1)); //1 enero
        fechas.add(new GregorianCalendar(2023, 0, 29));
        fechas.add(new GregorianCalendar(2023, 2, 5));
        fechas.add(new GregorianCalendar(2023, 3, 23));
        fechas.add(new GregorianCalendar(2023, 4, 1));
        
       //1º forma
        for (int i=0;i<fechas.size();i++){
            System.out.println(fechas.get(i).get(Calendar.DAY_OF_MONTH)+"/"
                    + fechas.get(i).get((Calendar.MONTH)+1)+"/"
                    + fechas.get(i).get((Calendar.YEAR)
            );
        }
        
        //2º forma
        for (Gregoriancalendar c : fechas){
            System.out.println(
                    c.get(Calendar.DAY_OF_MONTH)+"/"
                    + (c.get(Calendar.MONTH)+1)+"/"
                    + (c.get(Calendar.YEAR)
            );
        }
        
        //3º formaNo se que lamda, aunque es como el de arriba, y se usa mas este
        fechas.forEach((c) -> {
            System.out.println(
                    c.get(Calendar.DAY_OF_MONTH)+"/"
                    + (c.get(Calendar.MONTH)+1)+"/"
                    + (c.get(Calendar.YEAR)
            ) //Despues del parentesis creo que hace falta un ;
        });
        
        /*Faltan las opciones de utilizar iterator y ListIterator
        Si cambiamos de previous a next hay que ponerlo 2 veces o algo asi, 
        y lo mismo del reves.
        
        Para quitar cosas dentro de un bucle para eliminar cosas 
        que hay que usar el remove del iterador,
        */
        
    }
}
