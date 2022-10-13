package taller4Y5;
import java.util.Random;
import java.util.Scanner;

public class numAleatorioentre0y10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int minimo=0;
			int maximo = 10;
			Random random= new Random();
			int numero = random.nextInt(maximo+minimo)+minimo;
			System.out.println(numero);
			
			if (numero %2==0) {
				System.out.println("El número es par");
				
			}
			
			else {
				System.out.println("El número es impar");
			}
			}
		}



	}


