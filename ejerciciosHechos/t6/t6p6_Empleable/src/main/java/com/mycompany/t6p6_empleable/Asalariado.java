/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6p6_empleable;

/**
 *
 * @author AluDAM
 */
public class Asalariado extends Cooperante implements Empleable {
    private double sueldo;
    
    /**
     * Los asalariados van en 1º clase
     * @return String
     */
    @Override
    public String enviarAPais(){
        return "Vas en primera clase.";
    }
    
    /**
     * Recibes 100 euros
     * @return double
     */
    @Override
    public double despedir(){
        return 100;
    }
}
