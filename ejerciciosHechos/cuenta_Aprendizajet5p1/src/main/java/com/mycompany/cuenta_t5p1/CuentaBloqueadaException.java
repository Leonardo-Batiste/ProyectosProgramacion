/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta_t5p1;

/**
 *
 * @author Alumno
 */
public class CuentaBloqueadaException extends Exception {
    public CuentaBloqueadaException(){
        super("Error. La cuenta esta bloqueada.");
    }
}
