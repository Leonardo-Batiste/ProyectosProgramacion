
public class Libro extends Ejemplar {

	protected String editorial;
	
	protected int numeroPaginas;
	
	public Libro(int codigo, String titulo, String editorial, int numeroPag) {
		super(codigo, titulo);
		this.editorial=editorial;
		this.numeroPaginas=numeroPag;
	}
	
	/**
	 * Los libros se pueden prestar durante 15 dias
	 */
	@Override
	public int getDiasPrestamo() {
		return 15;
	}

}
