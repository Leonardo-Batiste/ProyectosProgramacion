/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7p203;

/**
 *
 * @author Alumno
 */
public class ListaVaciaException extends Exception{
    public ListaVaciaException(String mensajeError){
        super("Error de "+mensajeError);
    }
}
