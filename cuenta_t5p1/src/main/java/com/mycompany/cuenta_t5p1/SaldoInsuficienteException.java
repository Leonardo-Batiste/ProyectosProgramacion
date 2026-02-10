package com.mycompany.cuenta_t5p1;
/**
 *
 * @author Alumno
 */
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super("No tienes suficiente saldo");
    } 
}
