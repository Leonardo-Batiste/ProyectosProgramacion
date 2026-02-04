/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p7;

/**
 *
 * @author AluDAM
 */
public class Camion extends Vehiculo {
    
    /**
     * Propiedades clase
     */
    
    protected double kilosMaxCarga;
    
    protected double kilosCargaActual;
    
    /**
     * Constructor de la clase
     * @param mat
     * @param maxLitrosDeposito
     * @param consumoMedio
     * @param velocidadMax
     * @param maxCarga 
     */
    public Camion(String mat, 
                    double maxLitrosDeposito, 
                    double consumoMedio,
                    double velocidadMax, 
                    double maxCarga){
        super(mat, maxLitrosDeposito, consumoMedio, velocidadMax);
        
        this.kilosMaxCarga=maxCarga;
    }
    
    /**
     * 
     * @param kilometros double
     */
    @Override
    public void recorrerDistancia(double kilometros){
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
        } else if (litrosNecesarios(kilometros) < this.numLitrosActual) {
            this.kilometraje += kilometros;
            numLitrosActual -= litrosNecesarios(kilometros);
            System.out.println("el camion con matricula " + this.matricula + " "
                    + "ha recorrido " + kilometros + "km");
        }
    }
    
    /**
     * El consumo de los camiones, cuando recorren una distancia, depende de la
     * carga que lleven, pudiendo gastar hasta el doble de combustible si van a
     * plena carga.
     *
     * @return double
     */
    @Override
    protected double consumoInstantaneo() {
        double consumoInstantaneo = 0;
        consumoInstantaneo = (2-((kilosMaxCarga-kilosCargaActual)/kilosMaxCarga))
                                *this.consumoMedio100km 
                                * (1 + (this.velocidadActual - 100) / 100);
        return consumoInstantaneo;
    }
    
    /**
     * Suma numero de kg a la carga actual
     * No debe exceder a la carga maxima
     * Solo se puede realizar si la velocidad es cero.
     * @param kg double
     */
    public void carga(double kg){
        if((this.kilosCargaActual+kg)>this.kilosMaxCarga){
            System.out.println("Error carga. Los kgCargaActual superan el maximo.");
        }
        else if(this.velocidadActual!=0){
            System.out.println("Error carga. No puedes cargar ya que la velocidad actual no es 0.");
        }
        else{
            this.kilosCargaActual+=kg;
            System.out.println("Se han cargado "+kg+"kg.");
        }
        
    }
    
    /**
     * Resta numero de kg a la carga actual
     * La carga no puede ser negativa
     * Solo se puede realziar si la velocidad es cero
     * @param kg 
     */
    public void descarga(double kg){
        if((this.kilosCargaActual-kg)<0){
            System.out.println("Error descarga. Sale carga negativa.");
        }
        else if(this.velocidadActual!=0){
            System.out.println("Error descarga. Estas en movimiento y no puedes descargar.");
        }
        else{
            this.kilosCargaActual-=kg;
            System.out.println("Se han descargado "+kg+"kg.");
        }
    }
    
    public double getKilosCarga(){
        return this.kilosCargaActual;
    }
}
