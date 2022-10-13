package taller4Y5;
import java.util.Random;
import java.util.Scanner;


public class temperatura_aletoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try (Scanner sc = new Scanner(System.in)) {
				int minimo=0;
				int maximo=60;
				Random random= new Random();
				int temperatura = random.nextInt(maximo+minimo)+minimo;
				System.out.println(temperatura);
				
				
				
				if (temperatura<10) {
					System.out.println("El clima es frio");
					
				}
				if ((temperatura>=10)&&(temperatura<=20)) {
					System.out.println("El clima es Nublado");
					
				}
				if ((temperatura>20)&&(temperatura<=30)) {
					System.out.println("El clima es cálido");
				}
				if (temperatura>30) {
					System.out.println("El clima es tropical");
					
				}
				
				
				
			}
			}
		
	}


