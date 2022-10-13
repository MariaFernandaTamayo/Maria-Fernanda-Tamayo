package taller4Y5;
import java.util.Scanner;

public class salarioSemanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_horas;
		int horas_extra;
		int total;
		
		
		try (Scanner sc = new Scanner(System.in)) {
			{
			// datos ingresados por el usario:
			System.out.println("Bienvenido al sistema");
			System.out.println("Por favor digite el numero de horas que trabaja a la semana:");
			//leer horas trabajadas
			num_horas=sc.nextInt();
			//condicion
			
			if(num_horas<=40) {
				total=num_horas*16;
				//muestra total en pantalla
				System.out.println("Por haber trabajado" + num_horas +"Su salario es de $:" + total);
				
			}
			else {
				horas_extra=num_horas-40;
				total=(horas_extra*20)+(40*16);
				System.out.println("Su sueldo total es de $:" +total);
			
				
			}
			
			
			
			
			
			
			
			
			}
			
			
			
			}
		
	
	

	}

}
