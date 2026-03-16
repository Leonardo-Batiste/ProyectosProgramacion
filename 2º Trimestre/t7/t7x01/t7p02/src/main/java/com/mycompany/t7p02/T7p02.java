/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AluDAM
 */
public class T7p02 {

    public static void main(String[] args) {
        Scanner prompt=new Scanner(System.in);
        
        ArrayList<Character> array =new ArrayList<Character>();
       
        for (int i=0;i<10;i++){
            System.out.print("Introduce el "+i+" caracter: ");
            
            String letraStr=prompt.nextLine();
            char letraChar=letraStr.charAt(0);
            Character letraCharacter=Character.valueOf(letraChar);
            array.add(letraCharacter);
            
        }
        
        System.out.println("ArrayList 1:");
        System.out.println("Hay un total de "+array.size()+" nodos.");
        
        System.out.println(array);
        
        Collections.reverse(array);
        System.out.println("After Reverse Order, ArrayList Contains : " + array);
    }
}
