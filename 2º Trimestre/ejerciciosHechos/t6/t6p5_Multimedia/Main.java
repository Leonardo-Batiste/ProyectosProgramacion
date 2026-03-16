import java.util.*;
import javax.swing.*;
/**
 * El do-while no se pedia en el enunciado, pero lo he hecho para probar si se guardaba el prestado o no
 */
public class Main {

	public static void main(String[] args) {
		int condicionBucle=0;
		
		ArrayList<Ejemplar> ejemplares = new ArrayList<Ejemplar>();
		
		ejemplares.add(new Libro(1,"libro1", "editorial1",300));
		ejemplares.add(new Libro(2,"libro2", "editorial2",300));
		ejemplares.add(new Multimedia(3,"pelicula1","dvd"));
		ejemplares.add(new Multimedia(4,"pelicula2","blu ray"));
		
		System.out.println(ejemplares);
		
		do {
			int codigoEjemplar=Integer.parseInt(JOptionPane.showInputDialog("Pon el codigo del ejemplar que quieres"));
			
			condicionBucle=codigoEjemplar;
			
			Ejemplar ejemplarCliente=ejemplares.get(codigoEjemplar);
			
			if (!ejemplarCliente.estaPrestado) {
				ejemplarCliente.prestarEjemplar();
				System.out.println("Tendras que devolverlo en: "+ejemplarCliente.getDiasPrestamo());
			}
			else {
				System.out.println("Ese ejemplar esta prestado ya!");
			}
		} while (condicionBucle!=100);
		
		
	}

}
