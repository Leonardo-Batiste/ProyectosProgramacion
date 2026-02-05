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
    
    public Persona(String nom, String apellidos, String dni){
        this.nombre=nom;
        this.apellidos=apellidos;
        this.dni=dni;
    }
    
    public void compraCoche(Coche c){
        this.cochePropio=c;
        c.setPropietario(this);
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
        return "Esta persona tiene de nombre: "+this.nombre+""
                + "de apellidos "+this.apellidos+""
                + "con dni "+this.dni+""
                + "y el coche "+this.cochePropio;
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
        if (this.cochePropio!=null){
            return true;
        }
        else{
            return false;
        }
    }
}
