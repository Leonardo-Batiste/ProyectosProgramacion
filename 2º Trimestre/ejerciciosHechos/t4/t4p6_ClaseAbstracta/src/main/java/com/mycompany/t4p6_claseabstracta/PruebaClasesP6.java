/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t4p6_claseabstracta;

/**
 *
 * @author AluDAM
 */
public class PruebaClasesP6 {

    public static void main(String[] args) {
        Coche vectra=new Coche("4544-FNJ", 60, 5.9, 180);
        Camion camion=new Camion("8899-ZTR", 100, 9.4, 170, 100);
        
        vectra.repostar(20);
        camion.repostar(20);
        
        camion.carga(1000);
        
        vectra.arrancarMotor();
        camion.arrancarMotor();
        
        vectra.fijarVelocidad(100);
        camion.fijarVelocidad(100);
        
        vectra.recorrerDistancia(100);
        camion.recorrerDistancia(100);
        
        System.out.println(vectra.numLitrosActual);
        System.out.println(camion.numLitrosActual);
        
        //Vehiculo vehiculo=new Vehiculo("0001", 60, 7.5, 230);
    }
}
