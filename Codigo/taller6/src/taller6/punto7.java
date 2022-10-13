package taller6;
import java.util.Scanner;

public class punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int intento, contraseña=1503, veces=0;
		
		do {
			System.out.println("Ingrese la contraseña, un pin de 4 digitos");
			intento=sc.nextInt();
			if(intento==contraseña) {
				System.out.println("La contraseña es correcta" + "\n"+ "Acceso concedido, BIenvenido");
				veces=veces+1;}
			
			else  {
				System.out.println("Contraseña incorrecta." + "\n"+ "Favor, intente nuevamente");			
				veces=veces+1;}
			if(veces==3) {
					System.out.println("Acceso Restringido" + "\n" + "Se ha bloqueado la cuenta");
					System.out.println("Bloqueando el sistema...");
						}
				
			
			
		}while(veces<3);
		
		

	}

}
