/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t4p7;

/**
 *
 * @author AluDAM
 */
public class T4p7 {

    public static void main(String[] args) {
        Persona jose=new Persona("Jose", "ApellidoDeJose", "12345678A");

        Persona alberto=new Persona("Alberto", "ApellidoDeAlberto", "98765432B");

        Coche vectra=new Coche("0001", 60, 7.5, 180);

        Camion volvo=new Camion("0032", 100, 10.0, 100, 1000);

        Radar rd=new Radar("Calle1", 60);

        jose.compraVehiculo(vectra);
        
        alberto.compraVehiculo(volvo);

        vectra.repostar(20);
        volvo.repostar(20);

        vectra.arrancarMotor();
        jose.eligeVehiculoEnUso(0);
        jose.usaVehiculo(100, 100);

        volvo.arrancarMotor();
        alberto.eligeVehiculoEnUso(0);
        alberto.usaVehiculo(60, 70);

        rd.pasaVehiculo(volvo);
        rd.pasaVehiculo(vectra);
    }
}
