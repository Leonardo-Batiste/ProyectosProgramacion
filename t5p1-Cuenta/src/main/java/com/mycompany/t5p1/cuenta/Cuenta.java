/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t5p1.cuenta;

/**
 *
 * @author AluDAM
 */
public class Cuenta {
    private String numero;
    
    private String titular;
    
    protected double saldo;
    
    protected boolean bloqueada;
    
    /**
     * Constructor
     */
    public Cuenta(String numC, String titularC){
        this.numero=numC;
        this.titular=titularC;
    }
    
    /**
     * Funciones
     */
    
    /**
     * 
     * @param cantidad 
     */
    public void ingresarDinero(double cantidad) throws CuentaBloqueadaException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException("La cuenta esta bloqueada no puedes ingresar dinero");
        }
        else{
            this.saldo+=cantidad;
        }
    }
    
    public void retirarDinero(double cantidad) throws SaldoInsuficienteException, CuentaBloqueadaException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException("La cuenta esta bloqueada, no puedes retirar dinero");
        }
        if (cantidad>this.saldo){
            throw new SaldoInsuficienteException("No tienes saldo suficiente, no puedes retirar dinero.");
        }
        this.saldo-=cantidad;
    }
    
    public void bloquear(){
        this.bloqueada=true;
    }
    
    public void desbloquear(){
        this.bloqueada=false;
    }
    
    public boolean estaBloqueada(){
        return this.bloqueada;
    }
    
    @Override
    public String toString(){
        return this.numero + this.titular + this.saldo + this.bloqueada;
    }
    
    public String imprimirSaldo(){
        return this.toString();
    }

    /**
     * Getters 
     */
    
    /**
     * 
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
