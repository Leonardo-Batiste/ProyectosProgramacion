/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.t5p10.model;

import java.util.regex.*;
/**
 *
 * @author AluDAM
 */
public class ValidarContrasena {
    
    private static final Pattern alm1Num = Pattern.compile("\\d");
    
    /**
     * Aunque se podria hacer con <w> en vez de <.>,
     * <.> es mas generico
     */
    private static final Pattern alm8Char = Pattern.compile(".{8,}");
    
    /**
     * Si fuese "$" solo, seria al final de la cadena
     */
    private static final Pattern almChar$ = Pattern.compile("\\$");
    
    /**
     * Aunque queramos comprobar que no haya espacios en blanco
     * La logica invertida va despues en el matcher
     */
    private static final Pattern noEspBlanc = Pattern.compile("\\s");
    
    /**
     * La contraseña debe:
     * <ul>
     * <li>incluir al menos un número</li>
     * <li>tener al menos 8 caracteres</li> 
     * <li>incluir el carácter ‘$’</li>
     * <li>No puede tener espacios en blanco</li>
     * <li>Si no se cumple, lanza una excepción personalizada ContrasenaInvalidaException</li>
     * </ul>
     * @param contraseña String
     */
    public boolean validarContrasena(String contraseña) throws ContrasenaInvalidaException{
        
        Matcher encaja_alm1Num = alm1Num.matcher(contraseña);
        
        Matcher encaja_alm8Car = alm8Char.matcher(contraseña);
        
        Matcher encaja_almCar$ = almChar$.matcher(contraseña);
        
        Matcher encaja_noEspBlanc = noEspBlanc.matcher(contraseña);
        
        //Si no encuentra digito, devuelve la excepcion
        if (!encaja_alm1Num.find()){
            throw new ContrasenaInvalidaException("tiene que tener al menos 1 numero");
        }
        
        if (!encaja_alm8Car.find()){
            throw new ContrasenaInvalidaException("debe tener al menos 8 caracteres");
        }
        
        if (!encaja_almCar$.find()){
            throw new ContrasenaInvalidaException("debe incluir el caracter <$>");
        }
        
        //Como la expresion regular encuentra espacios en blanco, no ponemos el <!>
        if (encaja_noEspBlanc.find()){
            throw new ContrasenaInvalidaException("no debe tener espacios en blanco.");
        }
     
        return true;
    }
    
}
