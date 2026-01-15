/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coche;

/**
 * Representa las funciones basicas de un coche
 * <ul>
 * <li>La velocidad debe ser mayor o igual a cero y se mide en km/h</li>
 * <li>La propiedad consumoMedio100km() se entiende como el numero de litros que
 * consume el coche a una velocidad de 100km/h en un recorrido de 100km</li>
 * <li>El combustible se mide en litros</li>
 * <li>Si un método debe escribir algún mensaje en la pantalla, éste
    comenzará con el encabezado() </li>
 * </ul>
 * @author Alumno
 */
public class Coche {
    //Propiedades independientes del estado
    private String matricula;
    
    private double maxLitrosDeposito;
    
    private double maxLitrosReserva;
    
    private double velocidadMaxima;
    
    private double consumomedio100km;
    
    //Propiedades que definen el estado del coche
    private boolean motorArrancado;
    
    private boolean estaEnReserva;
    
    private double numLitrosActual;
    
    private double velocidadActual;
    
    private double kilometraje;
    
    
    /**
     * Constructor de la clase
     */
    
    /**
     * Comprueba que:
     * <ul>
     * <li>maxLitrosDeposito</li>
     * <li>consumoMedio</li>
     * <li>velocidadMaxima</li>
     * </ul>
     * sean numeros mayores que cero. Sino se le asignaran los 
     * valores: 
     * <ul>
     * <li>capacidad(50)</li>
     * <li>consumo medio(7.5)</li>
     * <li>vel maxima(180)</li>
     * </ul>
     * El campo maxLitrosReservas se calcula como el 15% de la capacidad maxima
     * del deposito.
     * @param mat Matricula asignada
     * @param maxLitrosDeposito Tope de combustible
     * @param consumoMedio Consumo medio de litros cada 100km a 100km/h
     * @param velocidadMax Velocidad max que alcanza el coche
     */
    public Coche(String mat,
                 double maxLitrosDeposito,
                 double consumoMedio,
                 double velocidadMax){
        
        if (maxLitrosDeposito>0 && consumoMedio>0 && velocidadMax>0){
            this.matricula=mat;
            this.maxLitrosDeposito=maxLitrosDeposito;
            this.consumomedio100km=consumoMedio;
            this.velocidadMaxima=velocidadMax;
        }
        else {
            this.matricula=matricula;
            this.maxLitrosDeposito=50;
            this.consumomedio100km=7.5;
            this.velocidadMaxima=180;
        }
        this.maxLitrosReserva=maxLitrosDeposito*0.15;
    }

    /**
     * Getters y setters
     */
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMaxLitrosDeposito() {
        return maxLitrosDeposito;
    }

    public void setMaxLitrosDeposito(double maxLitrosDeposito) {
        this.maxLitrosDeposito = maxLitrosDeposito;
    }

    public double getMaxLitrosReserva() {
        return maxLitrosReserva;
    }

    public void setMaxLitrosReserva(double maxLitrosReserva) {
        this.maxLitrosReserva = maxLitrosReserva;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getConsumomedio100km() {
        return consumomedio100km;
    }

    public void setConsumomedio100km(double consumomedio100km) {
        this.consumomedio100km = consumomedio100km;
    }

    public boolean isMotorArrancado() {
        return motorArrancado;
    }

    public void setMotorArrancado(boolean motorArrancado) {
        this.motorArrancado = motorArrancado;
    }

    public boolean isEstaEnReserva() {
        return estaEnReserva;
    }

    public void setEstaEnReserva(boolean estaEnReserva) {
        this.estaEnReserva = estaEnReserva;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public void setNumLitrosActual(double numLitrosActual) {
        this.numLitrosActual = numLitrosActual;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    /**
     * Metodos de la clase
     */
    
    public String encabezado(){
        return "El coche con matricula "+this.matricula;
    }
    
    public void arrancarMotor(){
        if(){
        
        }
    }
    
    public void pararMotor(){
    
    }
    
    public void repostar(double litros){
    
    }
    
    public void fijarVelocidad(double velocidad){
    
    }
    
    public void recorrerDistancia(double kilometros){
    
    }
}
