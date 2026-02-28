/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7ejer3;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        
        Random rand = new Random();
        
        int numerosParaRellenar = Integer.parseInt(JOptionPane.showInputDialog("Elige cuantos numeros se añadiran al array."));
        
        //Rellenar array
        for (int i=0;i<=numerosParaRellenar;i++){
            array.add(Integer.valueOf(rand.nextInt(-10000, 1000+1))); //El +1 es porque es exclusivo y asi queda mas bonito
        }
        
        Collections.sort(array);
        
        //Mostrarlo
        for (Integer a : array){
            System.out.println(a);
        }
    }
}
