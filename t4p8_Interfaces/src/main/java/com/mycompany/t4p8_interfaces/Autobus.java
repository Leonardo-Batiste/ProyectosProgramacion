/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p8_interfaces;

/**
 *
 * @author Alumno
 */
public class Autobus extends Vehiculo implements TransportaPasajeros{
    private int numPlazas;
    
    private int numPasajerosActual;
    
    private Persona[] asientos;
    
    /**
     * Constructor clase
     * Comprueba que numPlazas sea mayor a cero, sino por defecto es 10
     * Debe instanciar el objeto de tipo array asientos con numero de elmentos que indique la propiedad numPlazas
     * @param mat String
     * @param maxLitrosDeposito double
     * @param consumoMedio double
     * @param velocidadMax double
     * @param numPlazas int
     */
    public Autobus(String mat, 
                    double maxLitrosDeposito, 
                    double consumoMedio, 
                    double velocidadMax, 
                    int numPlazas){
        
        super(mat, maxLitrosDeposito, consumoMedio, velocidadMax);
        if(numPlazas>0) {
        	this.numPlazas=numPlazas;
        	
        }
        else {
        	this.numPlazas=10;
        }
        
        Persona p; //Revisar si dejar esto como array o pas
        
    }
    
    @Override
    public void recorrerDistancia(double kilometros) {
    	//Este primer if,es para ver si el camion tiene velocidad y los kilometros son positivos
        if (this.velocidadActual == 0) {
            System.out.println("el camion con matricula " + this.matricula + " "
                    + "no ha recorrido ninguna distancia porque la velocidadActual es 0");
        } 
        else if (kilometros <= 0) {
            System.out.println("el camion con matricula " + this.matricula + " "
                    + "Error, el camion no puede recorrer distancias negativas");
        }

        //Este if es para calcular si se queda o no con combustible despues de recorrer esos km
        if (this.numLitrosActual - consumoInstantaneo() <= 0) {
            System.out.println("el camion con matricula " + this.matricula + " "
                    + "no puede recorrer " + kilometros + ""
                            + "km, porque se quedaria sin combustible");
        } 
        else if (litrosNecesarios(kilometros) < this.numLitrosActual) {
            this.kilometraje += kilometros;
            numLitrosActual -= litrosNecesarios(kilometros);
            System.out.println("el camion con matricula " + this.matricula + " "
                    + "ha recorrido " + kilometros + "km");
        }
    }
    }
    
    
}
