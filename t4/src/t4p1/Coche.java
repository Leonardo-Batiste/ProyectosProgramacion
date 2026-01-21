/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package t4p1;

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
    
    //Propiedades de asociacion
    private Persona propietario;
    
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
        
        //No se si hace falta poner aqui  los metodos que definen la clase
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
    
    public boolean poseePropietario() {
    	if (this.propietario != null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public Persona getPropietario() {
    	return this.propietario;
    }
    
    public void setPropietario(Persona p) {
    	this.propietario=p;
    }
    
    /**
     * Metodos de la clase
     */
    
    public String encabezado(){
        return "El coche con matricula "+this.matricula;
    }
    
    /**
     * Alterna entre motor encendido y apagado
     * Tambien comprueba:
     * <ul>
     * <li>si tiene suficiente combustible (numLitrosActual)</li>
     * <li>Si esta en reserva.</li>
     * <li></li>
     * </ul>
     */
    public void arrancarMotor(){
        if(numLitrosActual>0){
            System.out.println(encabezado()+" ha arrancado.");
            this.motorArrancado=true;
        }
        else if (numLitrosActual<=0){
            System.out.println(encabezado()+" no puede arrancar el motor porque"
                    + "                     se ha queado sin combustible");
        }
        else if(motorArrancado==true){
            System.out.println(encabezado()+" no puede arrancar el motor porque"
                    + "                     ya esta arrancado.");
        }
        
        if (estaEnReserva){
            System.out.println(encabezado()+" esta en reserva de combustible.");
        }
    }
    
    /**
     * Establece motorArrancado a false, si era true
     */
    public void pararMotor(){
        if(motorArrancado){
            setMotorArrancado(false);
            System.out.println(encabezado()+" ha parado el motor.");
        }
    }
    
    /**
     * Si se rebasa la capacidad del tanque muestra un mensaje
     * Muestra despues de cada repostaje cuantos litros se tienen actualmente
     * Comprueba que litros sea positivo
     * @param litros Cuantos litros se van a añadir al tanque
     */
    public void repostar(double litros){
        if (litros>0){
            if (this.numLitrosActual+litros>maxLitrosDeposito){
            	numLitrosActual=maxLitrosDeposito;
                System.out.println(encabezado()+" ha rebosado el deposito y tiene "+numLitrosActual+"l en el deposito.");
            }
            else{
                numLitrosActual+=litros;
                System.out.println(encabezado()+" tiene "+numLitrosActual+"l de combustible");
            }  
        }    
    }
    /**
     * Solo funciona si el motor esta arrancado, sino muestra un mensaje
     * Si se pasa la velocidad maxima se asigna esta
     * Si velocidad es menor que cero, se para el coche
     * @param velocidad double que asigna cuanta velocidad se pondra el coche
     */
    public void fijarVelocidad(double velocidad){
        if (motorArrancado){
            if (velocidad>velocidadMaxima){
                velocidadActual=velocidadMaxima;
                System.out.println(encabezado()+" habia sido asignado una "
                        + "mayor a la velocidad maxima del coche, asi que se ha"
                        + "asignado esta ultima.");
            }
            else if (velocidad<0){
                this.velocidadActual=0;
                System.out.println(encabezado()+" Se ha introducido una "
                        + "velocidad menor que cero, se le ha asignado una "
                        + "velocidad de cero.");
            }
            else{
                this.velocidadActual=velocidad;
                System.out.println(encabezado()+" se le ha asignado una "
                        + "velocidad de "+velocidad+"kmh.");
            }
        }
        else{
            System.out.println(encabezado()+" no puede fijar velocidad porque"
                    + "el motor no esta arrancado.");
        }
    }
    
    /**
     * <ul>
     * <li>Comprueba que el motor este arrancado</li>
     * <li>Comprueba que la velocidad actual no sea cero</li>
     * </ul>
     * @param kilometros double que asigna cuantos km recorrera el coche
     */
    public void recorrerDistancia(double kilometros){
        if (!motorArrancado){
            System.out.println(encabezado()+" no ha recorrido distancia,"
                    + "porque el motor esta apagado.");
        }
        else if (velocidadActual==0){
            System.out.println(encabezado()+" no ha recorrido distancia "
                    + "porque la velocidad actual es cero");
        }
        else if (kilometros<=0){
            System.out.println(encabezado()+" no ha recorrido distancia "
                    + "porque la distancia a recorrer es negativa o cero.");
        }
        else{
            if (litrosNecesarios(kilometros)<=numLitrosActual){
                this.numLitrosActual-=litrosNecesarios(kilometros);
                this.kilometraje+=kilometros;
                System.out.println(encabezado()+" ha recorrido "+kilometros+
                        "km.");
                
            }
            else {
                System.out.println(encabezado()+" ha recorrido "+distanciaReal()+"km.");
                System.out.println(encabezado()+" esta sin combustible.");
                System.out.println(encabezado()+" esta parado.");
                this.numLitrosActual=0;
                this.kilometraje+=distanciaReal();
            }
            if (numLitrosActual<maxLitrosReserva){
                    estaEnReserva = true;
                    System.out.println(encabezado()+" esta en reserva.");
            }
        }
    }
    
    /**
     * 
     * @return un double con lo que consume el coche. Ej: 7.5l
     */
    private double consumoInstantaneo(){
        return consumomedio100km * (1 + (velocidadActual - 100 ) / 100);
    }
    
    /**
     * Litros necesarios para recorrer una distancia
     * @param distancia la distancia en km a recorrer
     * @return double con la distancia en km a recorrer
     */
    private double litrosNecesarios(double distancia){
        return distancia * consumoInstantaneo() / 100;
    }
    
    /**
     * Distancia que recorreria el coche si no tiene suficiente combustible para recorrer todo los kilometros indicados
     * @return double que representa los km que recorre en realidad
     */
    private double distanciaReal(){
        return 100*numLitrosActual/consumoInstantaneo();
    }
}
