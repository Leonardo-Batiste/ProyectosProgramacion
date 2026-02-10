/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t6p7_cuentabancaria;

/**
 *
 * @author AluDAM
 */
public abstract class CuentaBancaria {
    
    protected int codigo;
    
    protected String titular;
    
    protected double saldo;
    
    public CuentaBancaria(int codigo, String titular, double saldo){
        this.codigo=codigo;
        this.titular=titular;
        this.saldo=saldo;
    }
    
    
    /**
     * Devuelve un boolean de si se ha podido realizar la operacion o no
     * @return boolean
     */
    public abstract boolean depositar(double cantidad);
    
    public abstract boolean retirar(double cantidad);
}
