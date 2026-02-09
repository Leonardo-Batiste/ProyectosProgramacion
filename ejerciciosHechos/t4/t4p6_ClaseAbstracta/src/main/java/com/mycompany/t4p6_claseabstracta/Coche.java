/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p6_claseabstracta;

public class Coche extends Vehiculo {

    //Constructor
    public Coche(String mat,
                double maxLitrosDeposito,
                double consumoMedio,
                double velocidadMax) {
        super(mat, maxLitrosDeposito, consumoMedio, velocidadMax);
    }

    @Override
    public void recorrerDistancia (double kilometros){
        //Este primer if, es para ver si el coche tiene velocidad y los kilometros son positivos
        if (this.velocidadActual==0){
            System.out.println("El coche con matricula " + this.matricula + " no ha recorrido ninguna distancia porque la velocidadActual es 0");
        }
        else if (kilometros<=0){
            System.out.println("El coche con matricula " + this.matricula + " Error, el coche no puede recorrer distancias negativas");
        }

        //Este segundo if es para calcular si se queda o no con combustible despues de recorrer esos km
        if (this.numLitrosActual-consumoInstantaneo()<=0) {
            System.out.println("El coche con matricula " + this.matricula + " no puede recorrer "+kilometros+"km, porque se quedaria sin combustible");
        }
        else if (litrosNecesarios(kilometros)<this.numLitrosActual){
            this.kilometraje+=kilometros;
            numLitrosActual-=litrosNecesarios(kilometros);
            System.out.println("El coche con matricula " + this.matricula + " ha recorrido "+kilometros+"km");
        }
    }
}