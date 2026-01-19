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
        CuentaBanco c = new CuentaBanco(1,"alebrto", 1000,false);
        CuentaBanco c2 = new CuentaBanco(1,"jose", 1000,false);
        CuentaBanco c3 = new CuentaBanco(1,"chiquibai", 1000,false);
        
       System.out.println(CuentaBanco.getNumeroTotalCuentas());
       System.out.println(CuentaBanco.getSumaSaldosCuentas());
       
       c.retirarDinero(100);
       c2.retirarDinero(100);
       c3.retirarDinero(100);
       
       System.out.println(CuentaBanco.getNumeroTotalCuentas());
       System.out.println(CuentaBanco.getSumaSaldosCuentas());
    }
}
