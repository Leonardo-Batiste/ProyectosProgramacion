/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazcomparable;

import java.util.Arrays;

/**
 *
 * @author AluDAM
 */
public class InterfazComparable {

    public static void main(String[] args) {
        int[] enteros={5,4,8,2,9,6};
        
        Arrays.sort(enteros);
    
        for (int i=0;i<enteros.length;i++){
            System.out.print(enteros[i]+" ");
        }
        
        @Override
        public int compareTo(Object o){
            
            
        }
        
    }
}
