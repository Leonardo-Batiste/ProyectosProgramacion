/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6p6_empleable;

/**
 *
 * @author AluDAM
 */
public class Voluntario extends Cooperante implements Empleable {
    private String ong;
    
    /**
     * Los voluntarios van en clase turista
     * @return String
     */
    @Override
    public String enviarAPais(){
       return "Vas en clase turista.";
    }
    
    /**
     * Los voluntarios reciben 10€
     * @return double
     */
    @Override
    public double despedir(){
        return 10;
    }
}