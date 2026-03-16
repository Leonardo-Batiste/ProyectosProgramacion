/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4p6_claseabstracta;

/**
 *
 * @author AluDAM
 */
public class Persona {

    private String nombre;

    private String apellidos;

    private String dni;

    /**
     * Rango 0-9
     */
    private Coche[] coches;

    /**
     * Rango 0 a 10
     */
    private int numeroCochesActual = 0;

    /**
     * Rango -1 a 9
     * -1 No tiene ningun coche en uso
     * 0-9 posibles posiciones para los objetos coches
     */
    private int cocheEnUso = -1;

    /**
     * Constructor de persona
     * @param nom String
     * @param apellidos String
     * @param dni String
     */
    public Persona(String nom, String apellidos, String dni) {
        this.nombre = nom;
        this.apellidos = apellidos;
        this.dni = dni;
        coches = new Coche[10];
    }

    /**
     * Metodo que comprueba que el objeto persona tenga 10 coches como maximo en su lista numeroCochesActual
     * Aunque numeroCochesActual vaya del 0 al 10, este siempre va a estar 1 por detras, ya que coches[0-9]
     */
    public void compraCoche(Coche c) {
        if (numeroCochesActual < 10) {
            //Añadir <Coche c a la primera posicion <0> de coches[]
            this.coches[numeroCochesActual++]=c;
            
            //Añado a ese coche añadido <c> un propietario
            c.setPropietario(this);
        }
        else {
            System.out.println("No puedes comprar mas coches, has alcanzado el maximo de 10 coches por persona.");
        }
    }

    /**
     * Comprueba que se posea un coche
     * Luego usa los metodos del objeto coche, llamando a cada coche que esta dentro del array coches[]
     */
    public void usaCoche(double distancia, double velocidad) {
        if (!poseeCoche()) {
            System.out.println(
                "Error.No puedes usar el coche, porque actualmente no tienes ninguno."
            );
        }
        else {
            this.coches[cocheEnUso].arrancarMotor();
            this.coches[cocheEnUso].fijarVelocidad(velocidad);
            this.coches[cocheEnUso].recorrerDistancia(distancia);
        }
    }

    /**
     * Muestra
     * <ul>
     * <li>DNI</li>
     * <li>Nombre</li>
     * <li>Apellidos</li>
     * <li>Matriculas de los coches que tenga</li>
     * </ul>
     * Sino, muestra lo mismo, pero sustituye las matriculas por un mensaje de error
     */
    @Override
    public String toString() {
        //Parte que siempre muestra
        final String datos = "Dni:"+this.dni+" "
                +"Nombre: "+this.nombre+" "
                +"Apellidos"+this.apellidos;
                
        //Ultima parte, o matriculas o mensaje de error
        if (poseeCoche()){
            String matriculas="Matriculas: ";
            for (int i=0;i<numeroCochesActual;i++){
                matriculas+=coches[i].getMatricula()+" ";
            }
            return datos+matriculas;
        }
        else{
            return datos+"Esta persona no posee ningun coche.";
        }
    }

    public void imprimirDatosPersonales() {
        System.out.println(toString());
    }

    public Coche[] getCoches() {
        return this.coches;
    }

    /**
     * Sirve para comprobar si esta persona tiene asociada un coche
     * @return boolean
     */
    public boolean poseeCoche() {
        if (this.numeroCochesActual > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Cambia el objeto coche que usara el objeto persona del array coches[]
     * Rango para seleccionar un coche 0-9
     */
    public void eligeCocheEnUso(int n) {
        if (n >= 0 && n<numeroCochesActual){
            this.cocheEnUso = n;
        }
        else {
            System.out.println("Error.Has elegido un rango que no es 0-9.");
        }
        
    }
}
