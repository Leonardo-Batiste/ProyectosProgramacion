/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t4p3_herenciacuenta;

/**
 *
 * @author AluDAM
 */
public class T4p3_herenciaCuenta {

    public static void main(String[] args) {
        /*
        Crear un objeto de la clase CuentaAhorro con número de
        cuenta “323232”, a nombre de “Pedro Sanchez Llamas” y
        con un interés inicial del 2.5%.
• A continuación ingresamos 1000 euros.
• Después generamos los intereses de la cuenta e imprimimos
sus datos.
• A continuación intentamos retirar 2000 euros. Nos debe
mostrar un error.
• Ahora le cambiamos el titular a “Ana Perez Resa” e
imprimimos los datos de la cuenta
        */
        
        CuentaAhorro ca = new CuentaAhorro("323232", "Pedro Sanchez Llamas", 2.5);
        
        ca.ingresarDinero(1000);
        
        ca.aplicaInteres();
        
        ca.imprimirDatos();
        
        ca.retirarDinero(2000);
        
        ca.cambioTitular("Ana perez Resa");
        
        ca.imprimirDatos();
    }
}
