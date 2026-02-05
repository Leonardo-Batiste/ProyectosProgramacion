
public class Multimedia extends Ejemplar {
	protected String tipoSoporte;
	
	
	public Multimedia(int codigo, String titulo, String tipSoport) {
		super(codigo, titulo);
		this.tipoSoporte=tipSoport;
	}
	
	/**
	 * Los ejemplares multimedia se pueden prestar durante 10 dias
	 */
	@Override
	public int getDiasPrestamo() {
		return 10;
	}

}
