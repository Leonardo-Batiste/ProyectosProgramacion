/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.t5p10.model;

/**
 *
 * @author AluDAM
 */
public class ContrasenaInvalidaException extends Exception{
    
    /**
     * No se si hacerlo asi, o añadir una Contraseña exception arriba y que esta herede de esa
     * @param motivoError 
     */
    public ContrasenaInvalidaException(String motivoError){
        super("Error. La contraseña"+motivoError);
    }
}
