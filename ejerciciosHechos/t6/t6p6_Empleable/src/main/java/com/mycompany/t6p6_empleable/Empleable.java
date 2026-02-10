/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.t6p6_empleable;

/**
 *
 * @author AluDAM
 */
public interface Empleable {
    /**
     * Los voluntarios van en clase turista y los Asalariados en 1ª
     * @return String
     */
    public abstract String enviarAPais();
    
    /**
     * Los voluntarios reciben 10€ y los Asalariados 100€
     * @return double
     */
    public abstract double despedir();
}
