/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.t4p8_interfaces;

/**
 *
 * @author Alumno
 */
public interface TransportaPasajeros {
    public boolean subirPasajero(Persona p);
    
    public boolean bajarPasajero(Persona p);
    
    public Persona[] getEstadoOcupacion();
    
    // Como he usado un arrayList esto ya no se usa - public int getNumActualPasajeros();
    
    public int getNumMaximoPasajeros();
    
    public int getNumPlazasLibres();
}
