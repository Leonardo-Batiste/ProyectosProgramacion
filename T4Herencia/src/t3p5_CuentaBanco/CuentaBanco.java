package t3p5_CuentaBanco;
/**
 * 
 */
import java.util.*;
public class CuentaBanco {
	//Propiedades
	public String 	numero,
					titular;
	
	public double saldo;
	
	public boolean bloqueada;
	
	Random rand=new Random();
	
	//Constructores
	public CuentaBanco(int numCuenta, String titularCuenta) {
		this.numero=""+numCuenta;
		this.titular=titularCuenta;
		this.bloqueada=false;
		this.saldo=0.0;
	}
	
	
	public CuentaBanco(String titularCuenta) { //Este constructor genera el numero de cuenta de forma aleatoria
		this.numero=""+generarNumeroCuenta();
		this.titular=titularCuenta;
		this.bloqueada=false;
		this.saldo=0.0;
	}
	
	//Metodos
	public double consultarSaldo() {
		//Funciona estando bloqueada la cuenta
		return this.saldo;
	}
	
	void ingresarDinero(double cantidad) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes ingresar dinero.");
		}
		else {
			System.out.println("Has ingresado "+cantidad+" a tu cuenta "+numero);
			this.saldo+=cantidad;
		}
		
	}
	
	void retirarDinero(double cantidad) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes retirar dinero.");
		}
		else if (cantidad>this.saldo) {
			System.out.println("Error.Estas intentando retirar mas dinero del que hay disponible en la cuenta.");
		}
		else {
			this.saldo-=cantidad;
			System.out.println("Has retirado "+cantidad+"$ de tu cuenta "+this.numero);
		}
	}
	
	void cambioTitular(String nuevoTitular) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes cambiar de titular.");
		}
		else if (nuevoTitular.equals("")) {
			System.out.println("Para cambiar de titular, debes introducir una cadena de texto.");
		}
		else{
			this.titular=nuevoTitular;
			System.out.println("El nuevo titular de la cuenta "+this.numero+" es"+nuevoTitular);
		}
	}
	
	void bloquear() {
		if (this.bloqueada) {
			System.out.println("No puedes bloquear la cuenta, ya esta bloqueada.");
		}
		else {
			this.bloqueada=true;
			System.out.println("La cuenta "+this.numero+" se ha bloqueado.");
		}
		
	}
	
	void desbloquear() {
		//Funciona estando bloqueada la cuenta
		this.bloqueada=false;
		System.out.println("La cuenta "+this.numero+" se ha desbloqueado.");
	}
	
	void imprimirDatos() {
		//Funciona estando bloqueada la cuenta
		System.out.println("-----Has seleccionado imprimir los datos de la cuenta-----");
		System.out.println("El numero de la cuenta es: "+this.numero);
		System.out.println("El titular de la cuenta es: "+this.titular);
		System.out.println("El saldo de la cuenta es "+this.saldo);
		System.out.println("¿Esta bloqueada?"+this.bloqueada);
		System.out.println("----------------------------------------------------------");
	}
	
	public int[] generarNumeroCuenta() {
		
	}
}
