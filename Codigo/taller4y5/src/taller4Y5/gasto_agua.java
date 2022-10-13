package taller4Y5;
import java.util.Scanner;

public class gasto_agua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int agua;
			double gasto;
			System.out.println("Bienvenido");
			System.out.println("Por favor, ingrese cuánta agua ha gastado:");
			agua=sc.nextInt();
			
			
			
			if(agua<=50) {
				gasto=agua*0 +6;
				
			}
			else {
				gasto=agua*0.3+6;
				
			}
			if(agua>200) {
				gasto=agua*0.5+6;
			}
			
			System.out.println("Su gasto de agua es"+ gasto+ "pesos por este mes");
			
			gasto= gasto+6;
			
		}
		}


	}


