package t4p1;

public class Persona {
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private Coche cochePropio;
	
	/**
	 * 
	 * @param nom
	 * @param apellidos
	 * @param dni
	 */
	public Persona(String nom, String apellidos, String dni) {
		
	}
	
	public void compraCoche(Coche c) {
		this.cochePropio = c;
		c.setPropietario(this);
	}
	
	public void usaCoche(double distancia, double velocidad) {
		if (cochePropio != null) {
			cochePropio.arrancarMotor();
			cochePropio.fijarVelocidad(velocidad);
			cochePropio.recorrerDistancia(distancia);
		}
		else {
			System.out.println("No posees un coche, no puedes usarlo.");
		}
	}
	
	public Coche getCocheEnPropiedad() {
		return cochePropio;
	}
	
	public boolean poseeCoche() {
		if (cochePropio != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimirDatosPersonales() {
		
	}
}
