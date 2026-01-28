/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package t5p2_CuentaException;

/**
 *
 * @author AluDAM
 */
public class Cuenta {
    private String numero;
    
    private String titular;
    
    protected double saldo;
    
    protected boolean bloqueada;
    
    /**
     * Constructor
     */
    public Cuenta(String numC, String titularC){
        this.numero=numC;
        this.titular=titularC;
    }
    
    /**
     * Funciones
     */
    
    /**
     * 
     * @param cantidad 
     */
    public void ingresarDinero(double cantidad) throws CuentaBloqueadaException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException();
        }
        else{
            this.saldo+=cantidad;
            System.out.println("Se ha ingresado saldo");
        }
    }
    
    public void retirarDinero(double cantidad) throws SaldoInsuficienteException, CuentaBloqueadaException{
        if (this.bloqueada){
            throw new CuentaBloqueadaException();
        }
        if (cantidad>this.saldo){
            throw new SaldoInsuficienteException();
        }
        this.saldo-=cantidad;
        System.out.println("Se ha retirado dinero");
    }
    
    public void bloquear(){
        this.bloqueada=true;
    }
    
    public void desbloquear(){
        this.bloqueada=false;
    }
    
    public boolean estaBloqueada(){
        return this.bloqueada;
    }
    
    @Override
    public String toString(){
        return ""+this.saldo;
    }
    
    public String imprimirSaldo(){
        return this.toString();
    }

    /**
     * Getters 
     */
    
    /**
     * 
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
}