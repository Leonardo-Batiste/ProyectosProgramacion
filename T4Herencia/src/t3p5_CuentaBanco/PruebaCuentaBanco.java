package t3p5_CuentaBanco;

public class PruebaCuentaBanco {
	public static void main(String[] args) {
		CuentaBanco cb = new CuentaBanco(1111, "joseluis");
		
		System.out.println("El saldo de la cuenta es: "+cb.consultarSaldo());
		
		cb.ingresarDinero(500);
		
		cb.retirarDinero(400);
		
		cb.imprimirDatos();
		
		cb.bloquear();
		
		cb.bloquear();
		
		cb.desbloquear();
		
		cb.cambioTitular("JoseFina");
		
		cb.imprimirDatos();
	}
}
