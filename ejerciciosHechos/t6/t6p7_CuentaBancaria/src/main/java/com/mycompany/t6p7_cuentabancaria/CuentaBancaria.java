/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t6p7_cuentabancaria;

/**
 *
 * @author AluDAM
 */
public abstract class CuentaBancaria implements Transaccion{
    
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
    
    @Override
    public abstract boolean transferir(double importe, CuentaBancaria codigoCuentaAEnviar);
    
    @Override 
    public String toString(){
        return "Codigo de la cuenta "+this.codigo+" "
                +"Titular de la cuenta "+this.titular+" "
                +"Saldo de la cuenta "+this.saldo;
    }
    
}
