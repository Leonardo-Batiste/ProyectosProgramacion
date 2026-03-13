/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer8;

/**
 *
 * @author Alumno
 */
public class Contacto {
    protected String nombre;
    
    protected Integer numero;
    
    protected String email;
    
    public Contacto(String nombre){
        this.nombre=nombre;
    }
    
    public Contacto(String nombre, Integer numero){
        this.nombre=nombre;
        this.numero=numero;
    }
    
    public Contacto (String nombre, String email){
        this.nombre=nombre;
        this.email=email;
    }
    
    public Contacto(String nombre, Integer numero, String email){
        this.nombre=nombre;
        this.numero=numero;
        this.email=email;
    }
    
    @Override
    public String toString(){
        return  "\n---Datos del contacto---"
                +"Nombre: "+this.nombre+"\n"
                + "Numero: "+this.numero+"\n"
                + "Email: "+this.email+"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
}
