/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p5;

/**
 *
 * @author AluDAM
 */
public class Prueba_t4p5 {
    public static void main(String[] args) {
        CuentaCredito cc = new CuentaCredito("001", "Alberto", -3000);
        
        cc.ingresarDinero(1000);
        
        cc.imprimirDatos();
        
        cc.retirarDinero(2000);
        
        cc.cambioTitular("Ana perez Resa");
        
        cc.imprimirDatos();
}
    }
    
