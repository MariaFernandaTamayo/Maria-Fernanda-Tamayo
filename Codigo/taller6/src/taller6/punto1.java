package taller6;
import java.util.Scanner;



public class punto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int promedio;
			int n;
			int numeros=0;
			int acumulado=1;
			int cantidad_num;
			 System.out.println("Ingrese la cantidad de numeros a usar");
			 cantidad_num=sc.nextInt();
			 
			 while(acumulado<=cantidad_num) {
				 System.out.println("ingrese el numero " +acumulado);
				 n=sc.nextInt();	
				 numeros += n;
				 acumulado++;
			 }
			 
			 promedio = numeros/cantidad_num;
			 System.out.println("El promedio de los numeros es" +promedio);
		    
		}
	}

