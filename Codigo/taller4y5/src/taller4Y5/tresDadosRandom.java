package taller4Y5;
import java.util.Scanner;

public class tresDadosRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try (Scanner sc = new Scanner(System.in)) {
				
			int dado1, dado2, dado3;
			
			dado1 =(int)(Math.random()*6)+1;
			
			System.out.println("Dado 1= " + dado1);
			
			
			dado2= (int)(Math.random()*6)+1;
			
			System.out.println("Dado 2= " + dado2);
			
			dado3= (int)(Math.random()*6)+1;
			
			System.out.println("Dado 3= " + dado3);
			
			//si los 3 dados son 6
			if ((dado1==6) && (dado2==6) && (dado3==6)){
				System.out.println("EXCELENTE");
			}
			else if ((dado1==6)&& (dado2==6)) {
				System.out.println("MUY BIEN");
			}
			else if ((dado1==6)&& (dado3==6)) {
				System.out.println("MUY BIEN");
				}
			else if ((dado2==6)&& (dado3==6)) {
				System.out.println("MUY BIEN");
				}
			else if (dado1==6) {
				System.out.println("REGULAR");
				}
			
			else if (dado2==6) {
				System.out.println("REGULAR");
				}
			else if (dado3==6) {
				System.out.println("REGULAR");
				}
			else {
				System.out.println("PESIMO");
			}
			
			
			}
			

	


	}

}
