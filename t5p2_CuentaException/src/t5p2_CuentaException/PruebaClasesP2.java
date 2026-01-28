package t5p2_CuentaException;

public class PruebaClasesP2 {

	public static void main(String[] args) {
		Cuenta c = new Cuenta("0001","Jose");
		try {
			c.ingresarDinero(2000);
			c.retirarDinero(100);
			c.imprimirSaldo();
			c.retirarDinero(3000);
		}
		catch (SaldoInsuficienteException s) {
			System.out.println("No hay saldo suficiente");
		}
		catch (CuentaException ce) {
			System.out.println("La cuenta esta bloqueada");
		}
	}

}
