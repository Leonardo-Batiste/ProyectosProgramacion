package t3p5_CuentaBanco;

public class PruebaCuentaBanco {
	public static void main(String[] args) {
		CuentaBanco cb = new CuentaBanco("joseluis");
		
		CuentaBanco cb2 = new CuentaBanco("Gonzalo");
		
		//El problema pedia que consultarSaldo solo devolviese un numero, necesita un syso para imprimirlo
		System.out.println("El saldo de la cuenta es: "+cb.consultarSaldo());
		
		
	}
}
