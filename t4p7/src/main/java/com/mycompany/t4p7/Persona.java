package com.mycompany.t4p7;

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
    private Vehiculo[] vehiculos;

    /**
     * Rango 0 a 10
     */
    private int numeroVehiculosActual = 0;

    /**
     * Rango -1 a 9
     * -1 No tiene ningun vehiculo en uso
     * 0-9 posibles posiciones para los objetos vehiculos
     */
    private int vehiculoEnUso = -1;

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
        vehiculos = new Vehiculo[10];
    }

    /**
     * Metodo que comprueba que el objeto persona tenga 10 vehiculos como maximo en su lista numeroVehiculosActual
     * Aunque numeroVehiculosActual vaya del 0 al 10, este siempre va a estar 1 por detras, ya que vehiculos[0-9]
     */
    public void compraVehiculo(Vehiculo v) {
        if (numeroVehiculosActual < 10) {
            //Añadir <Vehiculo v a la primera posicion <0> de vehiculos[]
            this.vehiculos[numeroVehiculosActual++] = v;
            
            //Añado a ese vehiculo añadido <v> un propietario
            v.setPropietario(this);
        }
        else {
            System.out.println("No puedes comprar mas vehiculos, has alcanzado el maximo de 10 vehiculos por persona.");
        }
    }

    /**
     * Comprueba que se posea un vehiculo
     * Luego usa los metodos del objeto vehiculo, llamando a cada vehiculo que esta dentro del array vehiculos[]
     */
    public void usaVehiculo(double distancia, double velocidad) {
        if (!poseeVehiculo()) {
            System.out.println(
                "Error.No puedes usar el vehiculo, porque actualmente no tienes ninguno."
            );
        }
        else {
            this.vehiculos[vehiculoEnUso].arrancarMotor();
            this.vehiculos[vehiculoEnUso].fijarVelocidad(velocidad);
            this.vehiculos[vehiculoEnUso].recorrerDistancia(distancia);
        }
    }

    /**
     * Muestra
     * <ul>
     * <li>DNI</li>
     * <li>Nombre</li>
     * <li>Apellidos</li>
     * <li>Matriculas de los vehiculos que tenga</li>
     * </ul>
     * Sino, muestra lo mismo, pero sustituye las matriculas por un mensaje de error
     */
    @Override
    public String toString() {
        //Parte que siempre muestra
        final String datos = "Dni:" + this.dni + " "
                + "Nombre: " + this.nombre + " "
                + "Apellidos" + this.apellidos;
                
        //Ultima parte, o matriculas o mensaje de error
        if (poseeVehiculo()){
            String matriculas = "Matriculas: ";
            for (int i = 0; i < numeroVehiculosActual; i++){
                matriculas += vehiculos[i].getMatricula() + " ";
            }
            return datos + matriculas;
        }
        else{
            return datos + "Esta persona no posee ningun vehiculo.";
        }
    }

    public void imprimirDatosPersonales() {
        System.out.println(toString());
    }

    public Vehiculo[] getVehiculos() {
        return this.vehiculos;
    }

    /**
     * Sirve para comprobar si esta persona tiene asociada un vehiculo
     * @return boolean
     */
    public boolean poseeVehiculo() {
        if (this.numeroVehiculosActual > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Cambia el objeto vehiculo que usara el objeto persona del array vehiculos[]
     * Rango para seleccionar un vehiculo 0-9
     */
    public void eligeVehiculoEnUso(int n) {
        if (n >= 0 && n < numeroVehiculosActual){
            this.vehiculoEnUso = n;
        }
        else {
            System.out.println("Error.Has elegido un rango que no es 0-9.");
        }
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
}