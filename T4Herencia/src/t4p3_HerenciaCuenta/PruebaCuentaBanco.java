package t4p3_HerenciaCuenta;

public class PruebaCuentaBanco {
	public static void main(String[] args) {
		Cuenta cb = new Cuenta("joseluis",1000.0,false);
		
		Cuenta cb2 = new Cuenta("Gonzalo",1000.0,false);
		
		Cuenta cb3 = new Cuenta("Raton",1000.0,false);
		
		System.out.println(Cuenta.getNumeroTotalCuentas());
		System.out.println(Cuenta.getSumaSaldosCuentas());
		
		cb.retirarDinero(100);
		cb2.retirarDinero(100);
		cb3.retirarDinero(100);
		
		System.out.println(Cuenta.getNumeroTotalCuentas());
		System.out.println(Cuenta.getSumaSaldosCuentas());
		
	}
}
