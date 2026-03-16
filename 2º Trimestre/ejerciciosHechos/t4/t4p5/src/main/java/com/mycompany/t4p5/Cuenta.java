package com.mycompany.t4p5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AluDAM
 */
public class Cuenta {
   private String numero, titular;
   
   protected double saldo;
   
   protected boolean bloqueada;
   
   //Constructor
    Cuenta(int numC, String titularC){
        
        String numCString=Integer.toString(numC);
        
        this.numero=numCString;
        this.titular=titularC;
        this.bloqueada=false;
        this.saldo=0.0;
    }
    
    //Se puede estando bloqueado
    double ConsultarSaldo(){
        return this.saldo;
    }
    
    void ingresarDinero(double cantidad){
        if (bloqueada==true){
            System.out.println("Cuenta bloqueada");
        }else {
            saldo += cantidad;
        }
        
    }
    
    void retirarDinero(double cantidad){
        if (bloqueada==true){
            System.out.println("Cuenta bloqueada");
        }
        else if (cantidad>this.saldo || cantidad<=0){
            System.out.println("Mensaje error");
        } else{
            saldo-=cantidad;
        }
    }
    
    void cambioTitular(String nuevoTitular){
        int longitud=nuevoTitular.length();
        if (bloqueada==true){
            System.out.println("Cuenta bloqueada");
        }
        else if (longitud<1){
            System.out.println("El nombre del nuevo titular no puede estar vacio");
        }else {
            this.titular=nuevoTitular;
        }
    }
    
    void bloquear(){
        if (bloqueada==true){
            System.out.println("Ya esta bloqueada");
        }else {
            this.bloqueada = true;
        }
        
    }
    
    //Se puede estando bloqueado
    void desbloquear(){
        this.bloqueada=false;
    }
    
    public String toString(){
        return "Numero de Cuenta: "+this.numero+"\n"
                + "Nombre Titular: "+this.titular+"\n"
                + "Cantidad Saldo: "+this.saldo+"\n"
                + "Esta bloqueada?: "+this.bloqueada;
    }
    
    //Se puede estando bloqueado
    void imprimirDatos(){
        System.out.println(toString());
    
    }
}
