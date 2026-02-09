package cuenta;

public class CuentaCorriente {
	private int numCuenta;
	
	private double saldo;
	
	
	
	/**
	 * Constructor de la clase
	 */
	public CuentaCorriente(String numCuenta) {
		this.numCuenta=Integer.parseInt(numCuenta);
	}
	
	public void ingresaEfectivo(double cantidad) {
		System.out.println("Se ha ingresado $"+cantidad+" a tu cuenta "+numCuenta);
		this.saldo+=cantidad;
	}
	
	public boolean retiraEfectivo(double cantidad) {
		if (cantidad>saldo) {
			this.saldo-=cantidad;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString(){
		return "Tu numero de cuenta es "+numCuenta+ " y tiene un saldo de $" + saldo;
	}
	
	public String visualiza() {
		return this.toString();
	}
	
}
