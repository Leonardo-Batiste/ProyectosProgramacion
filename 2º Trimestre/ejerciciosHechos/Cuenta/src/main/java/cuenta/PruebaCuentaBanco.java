/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class PruebaCuentaBanco {
    public static void main(String[] args) {
    	CuentaCorriente cc1 = new CuentaCorriente("001");
    	CuentaCorriente cc2 = new CuentaCorriente("002");
    	
    	cc1.ingresaEfectivo(100);
    	cc2.ingresaEfectivo(350);
    	
    	System.out.println(cc1.visualiza());
    	System.out.println(cc2.visualiza());
    }
}
