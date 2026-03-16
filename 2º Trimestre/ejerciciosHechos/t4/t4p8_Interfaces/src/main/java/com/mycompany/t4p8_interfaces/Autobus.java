/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p8_interfaces;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class Autobus extends Vehiculo implements TransportaPasajeros{
    /**
     * Numero de plazas maxima del bus
     */
	private int numPlazas;
    
    private int numPasajerosActual;
    
    /**
     * El arrayList se usa tambien para saber el numero de pasajeros actual, mediante asientos.size()
     */
    ArrayList<Persona> asientos = new ArrayList<Persona>();
    
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
        consumoInstantaneo = (2-((this.numPlazas-asientos.size())/this.numPlazas))
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
    	if (estaEnMovimiento(p)) {
    		System.out.println("Error subirPasajero(). El vehiculo esta en movimeinto.");
    		return false;
    	}
    	if (this.getNumPlazasLibres()==0) {
    		System.out.println("Error subirPasajero(). El vehiculo no tiene plazas libres");
    		return false;
    	}
    	
    	asientos.add(p);
    	return true;
    }
    
    /**
     * 
     * @param p Clase persona
     * @return True si esta en movimiento, o false si esta quieto
     */
    public boolean estaEnMovimiento(Persona p) {
    	return this.getVelocidadActua() > 0;
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
    public int getNumMaximoPasajeros() {
    	return this.numPlazas;
    }
    
    //Prueba lazygit
    
    @Override
    public int getNumPlazasLibres() {
    	int plazasLibres=this.numPlazas-asientos.size();
    	return plazasLibres;
    }
}
