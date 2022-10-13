package taller4Y5;
import java.util.Scanner;
public class dosNumerosEnteros_MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		try (Scanner sc = new Scanner(System.in)) {
			{
			// Mandar mensaje pidiendo primer numero
			System.out.println("Escribe el primer numero:");
			//leer primer numero
			num1=sc.nextInt();
			// Mandar mensaje pidiendo segundo numero
			System.out.println("Escribe el segundo numero");
			//leer segundo numero
			num2=sc.nextInt();
			
			if (num1==num2) {
					System.out.println("Los dos numeros son iguales");
					
				}
			else if (num1>num2) {
					System.out.println("El primer numero es mayor al segundo");
					
				}
			else if (num2>num1){
					System.out.println("El segundo numero es mayor al primero");
			}
			}
		}
		}
		
	}


