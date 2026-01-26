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
    public void ingresarDinero(double cantidad){
        try {
            this.saldo+=cantidad;
            System.out.println("Se ha ingresado $"+cantidad+" a tu cuenta "+numero);
        }
        catch(CuentaBloqueadaException e){
            System.out.println("La cuenta esta bloqueada no puedes ingresar dinero.");
        }
        
    }
    
    public void retirarDinero(double cantidad){
        try {
            this.saldo-=cantidad;
            System.out.println("Se ha retirado $"+cantidad+" a tu cuenta "+numero);
        }
        catch(CuentaBloqueadaException e) {
            System.out.println("La cuenta esta bloqueada no puedes retirar dinero");
        }
        if (cantidad>this.saldo){
            throw new SaldoInsuficienteException("nose");
        }
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
