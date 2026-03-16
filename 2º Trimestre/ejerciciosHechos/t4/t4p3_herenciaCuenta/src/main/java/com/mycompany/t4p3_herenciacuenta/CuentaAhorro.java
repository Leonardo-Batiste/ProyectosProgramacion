package com.mycompany.t4p3_herenciacuenta;

/**
 *
 * @author AluDAM
 */
public class CuentaAhorro extends Cuenta{
    private double interes; //entre 0-100%
    
    /**
     * Constructor clase
     * @param numC string
     * @param titular string
     * @param interes double
     */
    public CuentaAhorro(String numC, String titular, double interes) {
        super(Integer.parseInt(numC), titular); // Llamada al constructor del padre
        if (interes >= 0 && interes <= 100) {
            this.interes = interes;
        } else {
            this.interes = 0;
        }
    }
    
    /**
     * aplicaInteres agrega al saldo de la cuenta los intereses generados. 
     * Sólo se permite la operación si la cuenta no está bloqueada.
     */
    public void aplicaInteres(){
        if(this.bloqueada){
            System.out.println("No puedes aplicar intereses, la cuenta esta bloqueada");
        }
        else{
            this.saldo+= this.saldo*(interes/100); //No se si esta bien hecho la formula dle interes
            System.out.println("Se ha aplicado el interes al saldo de tu cuenta.");
        }
    }
    
    public void setInteres(double porc){
        if(this.bloqueada){
            System.out.println("No puedes setInteres, la cuenta esta bloqueada.");
        }
        else{
            if(porc <=100 && porc >=0){
                this.interes=porc;
            }
            else{
                System.out.println("No puedes setInteres, el numero introducido tiene que estar entre 0-100");
            }
        }
    }
    
    public double getInteres(){
        return this.interes;
    }
}
