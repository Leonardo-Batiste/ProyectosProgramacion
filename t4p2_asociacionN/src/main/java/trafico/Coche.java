/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafico;

public class Coche {
    //Propiedades
    private String matricula;

    private double  maxLitrosDeposito,
                    maxLitrosReserva,
                    velocidadMaxima, //Debe ser mayor o igual a cero y se mide en km/h
                    consumoMedio100km, //Litros que consume el coche a una velocidad de 100 km/h en un recorrido de 100 km.
                    numLitrosActual,
                    velocidadActual, //Debe ser mayor o igual a cero y se mide en km/h
                    kilometraje;

    private boolean motorArrancado,
                    estaEnReserva;

    private Persona propietario;

    //Constructor
    public Coche(String mat,
                double maxLitrosDeposito,
                double consumoMedio,
                double velocidadMax)
    {
        if (maxLitrosDeposito>0 && consumoMedio>0 && velocidadMax>0){
           this.maxLitrosDeposito=maxLitrosDeposito;
           this.consumoMedio100km=consumoMedio;
           this.velocidadMaxima=velocidadMax;
        } 
        else {
            this.maxLitrosDeposito=50;
            this.consumoMedio100km=7.5;
            this.velocidadMaxima=180;
        }
        
        this.matricula = mat;
        maxLitrosReserva=maxLitrosDeposito*0.15;
    }

    //Getter y setters
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

    public double getConsumoMedio100km() {
        return consumoMedio100km;
    }

    public void setConsumoMedio100km(double consumoMedio100km) {
        this.consumoMedio100km = consumoMedio100km;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public void setNumLitrosActual(double numLitrosActual) {
        this.numLitrosActual = numLitrosActual;
    }

    public double getVelocidadActua() {
        return velocidadActual;
    }

    public void setVelocidadActua(double velocidadActua) {
        this.velocidadActual = velocidadActua;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
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

    //metodos-comportamientos
    public void arrancarMotor(){
        if (numLitrosActual>0){
            System.out.println("El coche con matricula "+this.matricula+" ha arrancado");
            motorArrancado = true;

            if (estaEnReserva==true){
                System.out.println("El coche con matricula "+this.matricula+" esta en reserva de combustible");
            }
        }

        else if (numLitrosActual<=0){
            System.out.println("El coche con matricula "+this.matricula+" no tiene combustible");
        }

        else if (motorArrancado==true){
            System.out.println("El coche con matricula " + this.matricula +" ya esta arrancado");
        }
    }

    public void pararMotor(){
        if (motorArrancado){
            motorArrancado = false;
            System.out.println("El coche con matricula " + this.matricula + " ha parado el motor");
        }
    }

    public void repostar (double litros) {
        if ((numLitrosActual+litros)>maxLitrosDeposito){
            this.numLitrosActual=this.maxLitrosDeposito;
            System.out.println("El coche con matricula " + this.matricula + " ha rebosado el deposito");
        }
        else {
            this.numLitrosActual+=litros;
            System.out.println("El coche con matricula " + this.matricula + " tiene "+numLitrosActual+" litros de combustible");
        }
    }

    public void fijarVelocidad (double velocidad){
        if (this.motorArrancado==true){
            if (velocidad>this.velocidadMaxima){
                this.velocidadActual=this.velocidadMaxima;
                System.out.println("El coche con matricula " + this.matricula + " ha fijado la velocidad a "+this.velocidadActual);
            }
            else if (velocidad<0){
                this.velocidadActual=0;
                System.out.println("El coche con matricula " + this.matricula + " ha fijado la velocidad a 0");
            }
            else{
                this.velocidadActual=velocidad;
                System.out.println("El coche con matricula "+this.matricula+ "ha fijado la velocidad a "+this.velocidadActual);
            }
        }else {
            System.out.println("El coche con matricula " + this.matricula + " no puede fijar la velocidad, porque no esta arrancado");
        }
    }

    /*

    */
    private double consumoInstantaneo(){
        double consumoInstantaneo=0;
        consumoInstantaneo=this.consumoMedio100km * (1 + (this.velocidadActual-100 ) / 100);
        return consumoInstantaneo;
    }

    private double litrosNecesarios(double distancia){
       double litrosNecesarios=0;
        return litrosNecesarios=distancia*consumoInstantaneo()/100;
    }

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

    public boolean poseePropietario(){
        if(this.propietario!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public Persona getPropietario(){
        return this.propietario;
    }

    public void setPropietario(Persona p){
        this.propietario=p;
    }
}
