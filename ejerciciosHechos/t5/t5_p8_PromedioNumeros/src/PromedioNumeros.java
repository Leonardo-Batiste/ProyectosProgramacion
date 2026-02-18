
public class PromedioNumeros {
	
	public static double calcularPromedio(int[] numeros) throws illegalArgumentException {
		if ( numeros.length == 0 ) {
			throw new illegalArgumentException();
		}
		
		double promedio=0;
		
		for (int i=0;i<numeros.length;i++) {
			promedio+=numeros[i];
		}
		
		return promedio/=numeros.length;
		
	}
	
	public static void main(String[] args) throws illegalArgumentException{
		int[] numeros = new int [15];
		
		System.out.println(calcularPromedio(numeros));
		
	}
}
