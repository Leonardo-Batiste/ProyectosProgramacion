package calculo_raiz_cuadrada;

import java.util.*;

public class Main {

	public static double calcularRaiz(double numero) throws raizException{
		if (numero<0) {
			throw new raizException();
		}
		return Math.sqrt(numero);
	}
	
	public static void main(String[] args) throws raizException {
		try {
			Scanner prompt = new Scanner(System.in);
			
			System.out.println("Introduce numero: ");
			int numero = prompt.nextInt();
			
			System.out.println(calcularRaiz(numero));
		}
		catch (raizException e){
			throw new raizException();
		}

	}

}
