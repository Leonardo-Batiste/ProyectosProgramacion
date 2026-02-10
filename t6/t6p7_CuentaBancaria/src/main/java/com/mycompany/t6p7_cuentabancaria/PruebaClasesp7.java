/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6p7_cuentabancaria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AluDAM
 */
public class PruebaClasesp7 {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas =new ArrayList<>();
        
        ArrayList<String> nombres = new ArrayList<>();
        
        Random rd = new Random();
        
        Scanner prompt = new Scanner(System.in);
    
        int condicionDoWhile=0;
        
        do {
            
            
            
            for (int x=0;x<10;x++){
                System.out.println("Introduce el nombre "+x);
                nombres.add(prompt.nextLine());
            }
        
            for (int i=0;i<10;i++){
                int numeroAl=rd.nextInt(2);
                prompt.nextLine();

                if (numeroAl==0){
                    cuentas.add(new CuentaCorriente(i, nombres.get(i), 500, 1000));
                }
                else{
                    cuentas.add(new CuentaAhorro(i, nombres.get(i), 500, 2.5));
                }
            }
            
            System.out.println("Quieres continuar?: (0/1)");
            condicionDoWhile=prompt.nextInt();
            prompt.nextLine();
            
        } while (condicionDoWhile==0);

    }
}
