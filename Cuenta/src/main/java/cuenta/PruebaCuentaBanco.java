/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author Alumno
 */
public class PruebaCuentaBanco {
    public static void main(String[] args) {
        CuentaBanco c = new CuentaBanco(12345, "Fernando");
        
        c.imprimirDatos();
        
        c.ingresarDinero(500);
        c.retirarDinero(100);
        
        System.out.println("Saldo disponible: "+c.consultarSaldo());
    }
}
