/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t701;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author AluDAM
 */
public class T701 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand=new Random();
        int sumaElementos=0;
        
        
        for (int i=0;i<15;i++){
            array.add(rand.nextInt(100,201));
        }
        
        System.out.println(array);
        
        for (int i=0;i<15;i++){
            sumaElementos+=array.get(i);
        }
        
        System.out.println("Se ha consultado: "+array.size()+" nodos");
        
        System.out.println("Suma elementos es "+sumaElementos);
        
        System.out.println("Media aritmetica es "+sumaElementos/array.size());
        
    }
}
