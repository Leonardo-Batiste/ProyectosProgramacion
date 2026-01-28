/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafico;

/**
 *
 * @author AluDAM
 */
public class Persona {
    private String nombre;
    
    private String apellidos;
    
    private String dni;
    
    private Coche cochePropio;
    
    private Coche[] coches;
    
    private int numCochesActual=0;
    
    private int cocheEnUso;
    
    /**
     * Constructor
     * @param nom String
     * @param apellidos String
     * @param dni String
     */
    public Persona(String nom, String apellidos, String dni){
        this.nombre=nom;
        this.apellidos=apellidos;
        this.dni=dni;
        coches=new Coche[10];
    }
    
    public void compraCoche(Coche c){
        if (numCochesActual<10){
            coches[numCochesActual++]=c;
            this.cochePropio=c;
            c.setPropietario(this);
        }
        else{
            System.out.println("No puedes comprar mas coches, has alcanzado el maximo de 10 coches por persona.");
        }
        
    }
    
    public void usaCoche(double distancia, double velocidad){
        if (!poseeCoche()){
            System.out.println("No puedes usar el coche, porque actualmente no tienes ninguno.");
        }
        else{
            cochePropio.arrancarMotor();
            cochePropio.fijarVelocidad(velocidad);
            cochePropio.recorrerDistancia(distancia);
        }
    }
    
    @Override
    public String toString(){
        if (poseeCoche()){
            return "Esta persona tiene de nombre: "+this.nombre+""
                + "de apellidos "+this.apellidos+""
                + "con dni "+this.dni;
            //Aqui falta poner las matricuals de todos los coches poseidos, pero no se como poner un bucle en un toString
        }
        else{
            return "Esta persona tiene de nombre: "+this.nombre+""
                + "de apellidos "+this.apellidos+""
                + "con dni "+this.dni+""
                + "y no posee ningun coche";
        }
        
    }
    
    public void imprimirDatosPersonales(){
        System.out.println(toString());
    }
    
    public Coche getCocheEnPropiedad(){
        return this.cochePropio;
    }
    
    /**
     * Sirve para comprobar si esta persona tiene asociada un coche
     * @return boolean
     */
    public boolean poseeCoche(){
        if (this.numCochesActual>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void eligeCocheEnUso(int n){
        this.cocheEnUso=n;
    }
}
