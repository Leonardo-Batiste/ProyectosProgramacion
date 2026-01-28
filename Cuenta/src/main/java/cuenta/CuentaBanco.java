/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cuenta;

/**
 *Cuenta bancaria
 * Reglas de bloqueo: Si la cuenta esta bloqueada solo se permite:
 * <ul>
 * <li>{@link #imprimirDatos()}</li>
 * <li>{@link #desbloquear()}</li>
 * <li>{@link #consultarSaldo()}</li>
 * </ul>
 * @author Alumno
 */
public class CuentaBanco {
    public String numero;
    
    public String titular;
    
    public double saldo;
    
    /**
     * True= esta bloqueada
     * False= no esta bloqueada
     */
    public boolean bloqueada;
    
    private static int NumeroTotalCuentas=0;
    
    private static double SumaSaldosCuentas=0;
    
    /**
     * Constructor de la clase, crea la cuenta desbloqueada y con saldo $0
     */
    public CuentaBanco(int numC, String titularC){
        this.numero=String.valueOf(numC);
        this.titular=titularC;
        this.saldo=0;
        this.bloqueada=false;
    }
    
    public CuentaBanco(int numC, String titularC, double saldo, boolean estadoBloqueo) {
    	this.numero=String.valueOf(numC);
    	this.titular=titularC;
    	this.saldo=saldo;
    	SumaSaldosCuentas+=saldo;
    	this.bloqueada=estadoBloqueo;
    }
    
    /**
     * Metodos de la clase
     * 
     */
    
    /**
     * Funciona sin importar si la cuenta es bloqueada o no
     * @return Un valor double con el saldo disponible de la cuenta.
     */
    public double consultarSaldo(){
        return this.saldo;
    }
    
    /**
     * No funciona si esta bloqueada la cuenta (bloqueada=true)
     * Suma el saldo añadido al Saldo total de todas las clases
     * @param cantidad Cantidad a ingresar a la cuenta
     */
    public void ingresarDinero(double cantidad){
        if (bloqueada){
            System.out.println("Error. No puedes ingresar dinero, porque la"
                    + "cuenta esta bloqueada.");
        }
        else {
            this.saldo+=cantidad;
            System.out.println("Se han ingresado $"+cantidad+" a tu cuenta "+""
                    +this.numero);
            this.SumaSaldosCuentas+=cantidad;
        }
    }
    
    /**
     * Retira x dinero (cantidad) de tu saldo disponible (saldo)
     * No funciona si esta bloqueada la cuenta (bloqueada=true)
     * Resta el saldo añadido al saldo total de todas las cuentas
     * @param cantidad Cantidad de dinero a retirar
     */
    public void retirarDinero(double cantidad){
        if (bloqueada){
            System.out.println("Error. No puedes retirar dinero, porque la"
                    + "cuenta esta bloqueada.");
        }
        else {
            if(cantidad>this.saldo){
                System.out.println("Error.Estas intentando retirar mas saldo del "
                        + "disponible en tu cuenta.");
            }
            else{
                this.saldo-=cantidad;
                System.out.println("Se han retirado $" +
                        cantidad+" de tu cuenta " +
                        this.numero);
                SumaSaldosCuentas-=cantidad;
            }
        }
    }
    
    /**
     * Comprueba que el nuevoTitular no este vacia
     * No funciona si esta bloqueada la cuenta
     * @param nuevoTitular Cadena con el nombre que tendra el nuevo titular
     */
    public void cambioTitular(String nuevoTitular){
        if (bloqueada){
            System.out.println("Error. No puedes cambiar el titular, porque la"
                    + "cuenta esta bloqueada.");
        }
        else{
            if (nuevoTitular.equals("")){
                System.out.println("El nombre introducido como nuevo titular"
                        + "no puede estar vacio.");
            }
            else{
                this.titular=nuevoTitular;
                System.out.println("El nuevo titular se ha actualizado"
                        + "correctamente.");
            }
        }
    }
    
    /**
     * Si la cuenta esta bloqueada, muestra un mensaje de error
     */
    public void bloquear(){
        if (bloqueada){
            System.out.println("La cuenta ya esta bloqueada, no puedes volver"
                    + "a bloquearla.");
        }
        else{
            this.bloqueada=true;
            System.out.println("Se ha bloqueado la cuenta "+this.numero
                    + "correctamente.");
        }
    }
    
    /**
     * Funciona estando bloqueada la cuenta
     * 
     */
    public void desbloquear(){
        this.bloqueada=false;
        System.out.println("Se ha desbloqueado la cuenta "+this.numero+""
                + "correctamente.");
    }
    
    /**
     * @return Devuelve un string con los valores de las propiedades de las
     * cuentas.
     */
    @Override
    public String toString(){
        return "Cuenta: "+this.numero+" "
                + "Titular: "+this.titular+" "
                + "Saldo: "+this.saldo+" "
                + "Esta bloqueada: "+this.bloqueada
                ;
    }
    
    /**
     * Imprime el toString por pantalla
     * Funciona estando bloqueada la cuenta
     */
    public void imprimirDatos(){
        System.out.println(this.toString());
    }
    
    public static int getNumeroTotalCuentas() {
    	return NumeroTotalCuentas;
    }
    
    public static double getSumaSaldosCuentas() {
    	return SumaSaldosCuentas;
    }
    
}
