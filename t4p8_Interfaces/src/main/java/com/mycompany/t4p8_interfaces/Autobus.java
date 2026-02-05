/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p8_interfaces;

import java.util.ArrayList;

import com.mycompany.ejemploarraylist.Persona;

/**
 *
 * @author Alumno
 */
public class Autobus extends Vehiculo implements TransportaPasajeros{
    private int numPlazas;
    
    private int numPasajerosActual;
    
    ArrayList<Persona> asientos = new ArrayList<Persona>;
    
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
        
        //Como uso un arraylist en teoria no haria falta iniciarlizarlo aqui con numPlazas?
        
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
    
    /**
     * Depende del número de pasajeros que lleva el autobús
     */
    @Override
    protected double consumoInstantaneo() {
        double consumoInstantaneo = 0;
        consumoInstantaneo = (2-((this.numPlazas-this.numPasajerosActual)/this.numPlazas))
                                *this.consumoMedio100km 
                                * (1 + (this.velocidadActual - 100) / 100);
        return consumoInstantaneo;
    }
    
    /**
     * Permite que se suba un pasajero sólo si la velocidad del vehículo es cero y hay algún asiento libre. 
     * En caso contrario se emite un mensaje describiendo la situación y se devuelve falso.
     */
    @Override
    public boolean subirPasajero(Persona p) {
    	if((p.getVehiculos()[p.getVehiculoEnUso()].getVelocidadActua())==0) {
    		/* el arrayList asientos, va aumentando conforme se añade objetos persona, osea que mientras su size(cuantas personas hay)
    		* sea menor que las plazas, significa que habra plazas disponibles
    		*/
    		if (asientos.size()<=this.numPlazas) {
    			//!Revisar que esta funcion no tiene que añadir al array creo, tiene que devolver un boolean	
    			asientos.add(p);
    		}
    		else {
    			System.out.println("Error. No se puede subir mas pasajeros, todas las plazas estan ocupadas.");
    		}
    	}
    	else {
    		//mirar como se puede imprimir un mensaje y que devuelva falso?
    		System.out.println("Error subirPasajero(). El coche esta en movimiento.");
    		return false;
    	}
    }
    
    @Override
    public boolean bajarPasajero(Persona p) {
    	return false;
    }
    
    @Override
    public Persona[] getEstadoOcupacion() {
    	return null;
    }
    
    @Override
    public int getNumActualPasajeros() {
    	return 0;
    }
    
    @Override
    public int getNumMaximoPasajeros() {
    	return 0;
    }
    
    @Override
    public int getNumPlazasLibres() {
    	return 0;
    }
}
