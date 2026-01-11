package t3p5_CuentaBanco;

import java.util.*;

/**
 * Cuenta bancaria con operaciones basicas !Falta hacer las siguientes versions
 * Este codigo tiene un problema, es que como no se lleva a cuenta las cuentas creadas, y como hay 2 constructores, 
 * uno que asigna el numero de cuenta de forma automatica y otro de forma manual. Esto hace que, si se asigna un numero de forma manual (numCuenta), mayor al
 * que se esta llevando el recuento (numeroActualCuenta), cuando se llegue de forma automatica a este, no se puede revisar que se haya creado o no.
 * Pero si es al reves si que se tiene en cuenta. Asi que solo usar de forma manual en casos especificos.
 */
public class CuentaBanco {
	/**
	 * Propiedades de los objetos
	 */

	/**
	 * numero de la cuenta
	 */
	public String numero;

	public String titular;

	public double saldo;

	/**
	 * true = la cuenta esta bloqueada, false = la cuenta esta desbloqueada
	 */
	public boolean bloqueada;

	/**
	 * Si se ha llegado al tope de cuentas, aumentar esta propiedad de la clase
	 */
	public static final int numeroMaximoCuentas = 1000;

	/**
	 * El numero en el que empieza las cuentas
	 */
	public static int numeroActualCuenta = 0;

	/**
	 * Propiedad static que va añadiendo/restando de cada cuenta para saber el saldo total.
	 */
	public static double SumaSaldosCuentas=0;
	
	/**
	 * Constructores de la clase CuentaBanco
	 */

	/**
	 * Constructor que crea el objeto con el numero de cuenta y el titular
	 * introducidos manualmente. Tambien comprueba que este disponible ese numero, sino pone el siguiente disponible.
	 * Cuidado con el error explicado de arriba del codigo!
	 * 
	 * @param numCuenta     Numero de cuenta introducida manualmente
	 * @param titularCuenta El nombre del titular de la cuenta bloqueada = Las
	 *                      cuentas estan desbloqueadas al crearse saldo = Las
	 *                      cuentas empiezan con $0 de saldo
	 */
	public CuentaBanco(int numCuenta, String titularCuenta) {
		
		if (numCuenta<=numeroActualCuenta) {
				this.numero=""+numeroActualCuenta;
				System.out.println("El numero introducido para la cuenta, ya esta en uso. Asignado el siguiente disponible.");
		}
		else {
			this.numero = "" + numCuenta;
		}

		this.titular = titularCuenta;
		this.bloqueada = false;
		this.saldo = 0.0;
	}

	/**
	 * Este constructor genera el numero de la cuenta de forma automatica, solo se
	 * necesita introducir el nombre para el titular de la cuenta
	 * 
	 * @param titularCuenta El nombre del titular de la cuenta bloqueada = Las
	 *                      cuentas estan desbloqueadas al crearse saldo = Las
	 *                      cuentas empiezan con $0 de saldo
	 */
	public CuentaBanco(String titularCuenta, double saldoInicial, boolean bloqueadoInicial) {
		if (numeroActualCuenta > numeroMaximoCuentas) {
			System.out.println("No se pueden crear mas cuentas, se ha alcanzado el maximo.");
		}
		this.numero = "" + ++numeroActualCuenta;
		this.titular = titularCuenta;
		this.bloqueada = bloqueadoInicial;
		this.saldo = saldoInicial;
		this.SumaSaldosCuentas+=saldoInicial;
	}
	
	/**
	 * Constructor que recibe: Numero de cuenta, nombre titular, saldo inicial, y estado de bloqueo
	 * @param titularCuenta Nombre del titular de la cuenta a crear
	 * @param saldoInicial El saldo con el que empieza esta cuenta
	 * @param bloqueadoInicial Si la cuenta esta bloqueada(true) o no(false) en el momento de crearla
	 */
	public CuentaBanco(int numCuenta, String titularCuenta, double saldoInicial, boolean bloqueadoInicial) {
			if (numCuenta<=numeroActualCuenta) {
				this.numero=""+numeroActualCuenta;
				System.out.println("El numero introducido para la cuenta, ya esta en uso. Asignado el siguiente disponible.");
		}
		else {
			this.numero = "" + numCuenta;
		}
			this.titular = titularCuenta;
			this.bloqueada = bloqueadoInicial;
			this.saldo = saldoInicial;
			this.SumaSaldosCuentas+=saldoInicial;
		}

	/**
	 * Metodos de la clase CuentaBanco
	 */

	/**
	 * consultarSaldo funciona estando bloqueada la cuenta
	 * 
	 * @return un double con el saldo actual de la cuenta
	 */
	public double consultarSaldo() {
		return this.saldo;
	}
	/**
	 * Ingresa X dinero a this.saldo si no esta bloqueada la cuenta El problema
	 * pedia que consultarSaldo solo devolviese un double, necesita un syso para
	 * imprimirlo.
	 * Se añade la cantidad ingresada a la variable SumaSaldosCuentas para saber la cantidad total de saldo entre todas las cuentas
	 * 
	 * @param cantidad Cantidad que se añade
	 */
	public void ingresarDinero(double cantidad) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes ingresar dinero.");
		} else {
			System.out.println("Has ingresado $" + cantidad + " de la cuenta nº " + numero);
			this.saldo += cantidad;
			this.SumaSaldosCuentas+=cantidad;
		}

	}

	/**
	 * Resta dinero de this.saldo, en caso de que no este bloqueada, y tengas
	 * suficiente saldo para retirar esa cantidad.
	 * * Se resta la cantidad ingresada a la variable SumaSaldosCuentas para saber la cantidad total de saldo entre todas las cuentas
	 * @param cantidad Cantidad a retirar
	 */
	public void retirarDinero(double cantidad) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes retirar dinero.");
		} else if (cantidad > this.saldo) {
			System.out.println("Error.Estas intentando retirar mas dinero del que hay disponible en la cuenta.");
		} else {
			this.saldo -= cantidad;
			this.SumaSaldosCuentas-=cantidad;
			System.out.println("Has retirado $" + cantidad + " de la cuenta nº " + this.numero);
		}
	}

	/**
	 * Reemplaza el nombre del titular actual de la cuenta por uno nuevo, en caso de
	 * que no este bloqueada y comprueba que tenga caracteres el nuevo titular
	 * 
	 * @param nuevoTitular Nombre del nuevo titular de la cuenta
	 */
	public void cambioTitular(String nuevoTitular) {
		if (this.bloqueada) {
			System.out.println("La cuenta esta bloqueada, no puedes cambiar de titular.");
		} else if (nuevoTitular.equals("")) {
			System.out.println("Para cambiar de titular, debes introducir una cadena de texto.");
		} else {
			this.titular = nuevoTitular;
			System.out.println("El nuevo titular de la cuenta " + this.numero + " es " + nuevoTitular);
		}
	}

	public void bloquear() {
		if (this.bloqueada) {
			System.out.println("No puedes bloquear la cuenta, ya esta bloqueada.");
		} else {
			this.bloqueada = true;
			System.out.println("La cuenta " + this.numero + " se ha bloqueado.");
		}

	}

	public void desbloquear() {
		this.bloqueada = false;
		System.out.println("La cuenta " + this.numero + " se ha desbloqueado.");
	}

	/**
	 * Imprime las propiedades del objeto, funciona estando bloqueada la cuenta
	 */
	public void imprimirDatos() {
		System.out.println("\n-----Has seleccionado imprimir los datos de la cuenta-----");

		System.out.println("El numero de la cuenta es: " + this.numero);
		System.out.println("El titular de la cuenta es: " + this.titular);
		System.out.println("El saldo de la cuenta es $" + this.saldo);

		if (this.bloqueada) {
			System.out.println("La cuenta nº " + this.numero + " esta bloqueada");
		} else {
			System.out.println("La cuenta nº " + this.numero + " no esta bloqueada");
		}

		System.out.println("----------------------------------------------------------\n");
	}
	
	public static int getNumeroTotalCuentas() {
		return numeroActualCuenta;
	}

	public static double getSumaSaldosCuentas() {
		return SumaSaldosCuentas;
	}
}
