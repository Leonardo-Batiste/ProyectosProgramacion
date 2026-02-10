/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6p7_cuentabancaria;

/**
 *
 * @author AluDAM
 */
public class CuentaCorriente extends CuentaBancaria implements Transaccion {
    protected double limiteRiesgo;
    
    public CuentaCorriente(int codigo, String titular, double saldo, double limiteRiesgo){
        super(codigo, titular, saldo);
        this.limiteRiesgo=limiteRiesgo;
    }
    
    /**
     * solo hay que comprobar que la cantidad sea positiva
     * @param cantidad
     * @return 
     */
    @Override
    public boolean depositar(double cantidad){
        if (cantidad>0){
            this.saldo+=cantidad;
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * solo podrá retirar una cantidad que no supere en negativo 
     * el límiteRiesgo.
     * @param cantidad
     * @return 
     */
    @Override
    public boolean retirar(double cantidad){
        if (this.saldo-cantidad>this.limiteRiesgo){
            this.saldo-=cantidad;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean transferir(double importe, CuentaBancaria codigoCuentaAEnviar){
        if (!retirar(importe)){
            return false;
        }
        
        return codigoCuentaAEnviar.depositar(importe);
    }
    
    @Override
    public String consultarSaldo(){
        return "Saldo de la cuenta es"+this.saldo;
    }
    
}
