/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.t6p7_cuentabancaria;

/**
 *
 * @author AluDAM
 */
public interface Transaccion {
    /**
     * → se indicará el importe a transferir y la cuenta de destino.  
     * @param importe double
     * @param codigoCuenta int
     * @return boolean si se ha podido realizar la transferencia
     */
    public abstract boolean transferir(double importe, CuentaBancaria codigoCuentaAEnviar);
    
    public abstract String consultarSaldo();
}
