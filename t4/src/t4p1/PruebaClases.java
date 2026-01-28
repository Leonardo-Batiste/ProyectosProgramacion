package t4p1;

public class PruebaClases {
	public static void main(String[] args) {
		Coche c = new Coche("001",50,7.5,200);
		Persona p = new Persona("JoseLuis","Fernandez","12345678A");
		
		p.usaCoche(100, 50);
		
		p.compraCoche(c);
		
		c.repostar(1000);
		
		c.arrancarMotor();
		
		c.fijarVelocidad(60);
		
		c.recorrerDistancia(10);
	}
}
