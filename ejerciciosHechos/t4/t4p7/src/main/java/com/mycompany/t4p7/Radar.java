package com.mycompany.t4p7;

public class Radar {
    /**
     * Velocidad maxima permitida por el radar
     */
    private double velocidadLimite;

    private String ubicacion;

    /**
     * Constructor clase
     * @param ubicacion String
     * @param velocidadLimite double, se mide en km/h
     */
    public Radar(String ubicacion, double velocidadLimite){
        this.ubicacion=ubicacion;

        if(velocidadLimite>=0){
            this.velocidadLimite=velocidadLimite;
        }
        else{
            this.velocidadLimite=100;
        }
    }

    /**
     * Comprueba que la velocidad supere en mas de 15km/h la velocidad permitida
     * Si se supera la velocidad, invoca el metodo imponeMulta()
     * @param v clase Vehiculo
     */
    public void pasaVehiculo(Vehiculo v){
        if(v.getVelocidadActua()>this.velocidadLimite+15){
            imponeMulta(v);
        }
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(String dir){
        this.ubicacion=dir;
    }

    private void imponeMulta(Vehiculo v){
        System.out.println("Velocidad maxima permitida de "+getUbicacion()+": "+this.velocidadLimite+" km/h.");

        System.out.println("Velocidad del vehiculo "+v.getMatricula()+": "+v.getVelocidadActua()+" km/h.");
        
        System.out.println("Se sanciona al propietario: "+v.getPropietario().getDni()+v.getPropietario().getNombre()+
                            v.getPropietario().getApellidos());
    }

}
