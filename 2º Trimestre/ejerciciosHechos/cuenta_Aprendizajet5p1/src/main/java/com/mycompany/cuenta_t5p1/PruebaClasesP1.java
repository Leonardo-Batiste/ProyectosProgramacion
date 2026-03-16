/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta_t5p1;

/**
 *
 * @author Alumno
 */
public class PruebaClasesP1 {
    public static void main(String[] args) {
        try{
            Cuenta c = new Cuenta("001", "Titular1");
            c.bloquear();
            c.ingresarDinero(2000);
        }
        catch(CuentaBloqueadaException e){
        
        }
    }
    
}
