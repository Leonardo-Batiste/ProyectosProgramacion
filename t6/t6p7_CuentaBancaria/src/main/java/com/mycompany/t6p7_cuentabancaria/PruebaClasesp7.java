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
        
        int tamañoArray=2;
            
        nombres.add("afawfaw");
        
        nombres.add("apepepepepepe");
        
            /*Llenar el array de nombres
            for (int x=0;x<tamañoArray;x++){
                System.out.println("Introduce el nombre "+x);
                nombres.add(prompt.nextLine());
            }
            */
        
            //Llenar el array de cuentas
            for (int i=0;i<tamañoArray;i++){
                int numeroAl=rd.nextInt(2);

                if (numeroAl==0){
                    cuentas.add(new CuentaCorriente(i, nombres.get(i), 500, 1000));
                }
                else{
                    cuentas.add(new CuentaAhorro(i, nombres.get(i), 500, 2.5));
                }
            }

            for (int y=0;y<tamañoArray;y++){
                System.out.println(cuentas.get(y).consultarSaldo());
                 
            }
            
            //Listar
            for (int y=0;y<tamañoArray;y++){
                 System.out.println(cuentas.get(y));
            }

            cuentas.get(0).depositar(1000);
            
            cuentas.get(0).retirar(100);
            
            if (cuentas.get(0).transferir(500,cuentas.get(1))){
                System.out.println("Se ha completado con exito");
            }
            else{
                System.out.println("Ha habido un error.");
            }
            
            
    }
}
