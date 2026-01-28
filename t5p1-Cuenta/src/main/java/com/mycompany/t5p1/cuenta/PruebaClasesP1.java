/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t5p1.cuenta;

/**
 *
 * @author AluDAM
 */
public class PruebaClasesP1 {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("001", "Alberto");
        
        try{
            c.ingresarDinero(2000);
            c.retirarDinero(100);
            System.out.println(c.imprimirSaldo());
        }
        catch(CuentaBloqueadaException e){
            System.out.println(e.getMessage());
        }
        catch(SaldoInsuficienteException s){
            System.out.println(s.getMessage());
        }
    }
}
