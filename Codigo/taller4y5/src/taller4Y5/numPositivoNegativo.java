package taller4Y5;
import java.util.Scanner;

public class numPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			// Mandar mensaje
			System.out.println("Escribe un número:");
			// Leer lo que se introduce
			double numero = sc.nextDouble();
			//comparar
			if (numero == 0) {
				System.out.println("El número es neutro");
			} else if (numero < 0) {
				System.out.println("El número es negativo");
			} else {
				System.out.println("El número es positivo");
			}
			
		}
		
		}

	}


