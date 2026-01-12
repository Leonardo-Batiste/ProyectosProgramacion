package t3p5_CuentaBanco;

public class PruebaCuentaBanco {
	public static void main(String[] args) {
		CuentaBanco cb = new CuentaBanco("joseluis",1000.0,false);
		
		CuentaBanco cb2 = new CuentaBanco("Gonzalo",1000.0,false);
		
		CuentaBanco cb3 = new CuentaBanco("Raton",1000.0,false);
		
		System.out.println(CuentaBanco.getNumeroTotalCuentas());
		System.out.println(CuentaBanco.getSumaSaldosCuentas());
		
		cb.retirarDinero(100);
		cb2.retirarDinero(100);
		cb3.retirarDinero(100);
		
		System.out.println(CuentaBanco.getNumeroTotalCuentas());
		System.out.println(CuentaBanco.getSumaSaldosCuentas());
		
	}
}
