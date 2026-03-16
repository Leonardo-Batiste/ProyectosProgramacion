/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuenta_t5p1;

/**
 *
 * @author Alumno
 */
public class Cuenta {

    private String numero;
    
    private String titular;
    
    protected double saldo;
    
    protected boolean bloqueada;
    
    public Cuenta(String numC, String titularC){
    
    }
    
    public void ingresarDinero(double cantidad) throws CuentaBloqueadaException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException();
        }
    }
    
    /**
     * Si el método retirarDinero desea extraer de la cuenta una cantidad
     * superior al saldo existente se lanzará una SaldoInsuficienteException.
     * @param cantidad
     * @throws CuentaBloqueadaException
     * @throws SaldoInsuficienteException 
     */
    public void retirarDinero(double cantidad) throws CuentaBloqueadaException, SaldoInsuficienteException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException();
        }
        
        if (cantidad>this.saldo){
            throw new SaldoInsuficienteException();
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
    
    public String getNumeroCuenta(){
        return this.numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
