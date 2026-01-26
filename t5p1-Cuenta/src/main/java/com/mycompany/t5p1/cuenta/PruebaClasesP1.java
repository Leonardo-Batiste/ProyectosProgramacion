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
        
        c.bloquear();
        
        try{
            c.ingresarDinero(2000);
        }
        catch(CuentaBloqueadaException e) {
            System.out.println(e.getMessage());
        }
        
        c.desbloquear();
        
        try{
            c.ingresarDinero(2000);
            c.retirarDinero(100);
            c.imprimirSaldo();
            c.retirarDinero(3000);
        }
        catch(CuentaBloqueadaException e){
            System.out.println(e.getMessage());
        }
        catch(SaldoInsuficienteException s){
            System.out.println(s.getMessage());
        }
    }
}
