package t4p2;

public class Persona {
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private Coche[] coches;
	
	private int numCochesActual=0; //Maximo 10 coches
	
	private int cocheEnUso;
	
	/**
	 * Constructor de clase
	 * @param nom
	 * @param apellidos
	 * @param dni
	 */
	public Persona(String nom, 
					String apellidos, 
					String dni) {
		
		coches = new Coche[10];
	}
	
	/**
	 * Metodos de la clase
	 */
	
	/**
	 * 
	 * @param c
	 */
	
	public void compraCoche(Coche c) {
		if (numCochesActual>=10) {
			System.out.println("Error, no puedes comprar mas coches, has alcanzado el maxiamo de 10 por persona.");
		}
		else {
			coches[numCochesActual++]=c;
			c.setPropietario(this);
		}	
	}
	
	public void eligeCocheEnUso(int num) {
		this.cocheEnUso=num;
	}
	
	public void usaCoche(double distancia, double velocidad) {
		if (numCochesActual<=0) {
			System.out.println("No puedes usar el coche, porque no tienes o no estas usando ninguno.");
		}
		else if (numCochesActual==1) {
			
		}
		else {
			//Aqui he eliminado el anterior if, porque ya estoy comprobando que tenga coches?
			coches[cocheEnUso].arrancarMotor();
			coches[cocheEnUso].fijarVelocidad(velocidad);
			coches[cocheEnUso].recorrerDistancia(distancia);
		}
		
	}
	
	public Coche[] getCoches() {
		return coches;
	}
	
	public Coche getCocheEnPropiedad() {
		return coches[cocheEnUso];
	}
	
	public boolean poseeCoche() {
		if (coches[cocheEnUso] != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimirDatosPersonales() {
		
	}
}
