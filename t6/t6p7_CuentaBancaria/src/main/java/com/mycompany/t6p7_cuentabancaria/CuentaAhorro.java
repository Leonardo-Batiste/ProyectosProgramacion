/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6p7_cuentabancaria;

/**
 *
 * @author AluDAM
 */
public class CuentaAhorro extends CuentaBancaria implements Transaccion {
    protected double tasaInteres;
    
    protected int numMeses;
    
    public CuentaAhorro(int codigo, String titular, double saldo, double tasaInteres){
        super(codigo, titular, saldo);
        this.tasaInteres=tasaInteres;
        this.numMeses=12;
    }
    
    /**
     * comprobará que el numMeses sea cero y en ese caso añadirá la cantidad a
     * la cuenta y pondrá el número de meses a 12
     * @param cantidad
     * @return 
     */
    public boolean depositar(double cantidad){
        if (this.numMeses==0){
            this.saldo+=cantidad;
            this.numMeses=12;
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Solo podra retirar la cantidad si el numMeses es igual a cero
     * Y solo puede retirar la cantidad que tenga
     * @param cantidad
     * @return 
     */
    public boolean retirar(double cantidad){
        if (numMeses!=0){
            return false;
        }
        
        if (cantidad>this.saldo){
            return false;
        }
        
        this.saldo-=cantidad;
        return true;
    }
    
    /*
    sólo se pueden hacer transferencias a otras cuentas de ahorro.  
    No importa el número de meses, se pueden hacer siempre que el 
    saldo sea suficiente
    */
    @Override
    public boolean transferir(double importe, CuentaBancaria CodigoCuentaAEnviar){
        int guardar=this.numMeses;
        this.numMeses=0;
        
        if (!(CodigoCuentaAEnviar instanceof CuentaAhorro)){
            return false;
        }
        
        if (!retirar(importe)){
            return false;
        }
        
        if (!CodigoCuentaAEnviar.depositar(importe)){
            return false;
        }
        
        this.numMeses=guardar;
        return true;
    }
    
    @Override
    public String consultarSaldo(){
        return "Saldo de la cuenta es"+this.saldo;
    }
    
}
