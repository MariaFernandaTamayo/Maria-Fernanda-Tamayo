package taller9;
import java.util.Scanner;

public class punto1 {

	public static void main(String[] args) {
		int n;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del array");
		n=sc.nextInt();
		
		int array[]=new int[n];
		
		
		for(int i =0; i < array.length; i++) {
			System.out.println("Ingrese dato" +(i+1)+ ":");
			array [i] =sc.nextInt();
			
		}
		
		int mayor,menor;
		mayor=menor =array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array [i] >mayor) {
				mayor =array[i];
				
			}
			if(array [i]<menor) {
				menor = array[i];
			}
		}
		System.out.println("El valor mayor  es" +mayor);
		System.out.println("El valor menor  es" +menor);
	
		
		
		

	}

}
