package taller10;
import java.util.Scanner;

public class punto1 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int resultadosuma;
		int resultadoresta;
		int resultadomulti;
		int resultadodivi;
		int respuesta = 0;	
		
		do {
			System.out.println("Teclee la opción correspondiente a su elección" + "\n" + "1._Suma 2._Resta 3._Multiplicacion 4._Division 5._Salir\"");
			
			respuesta= sc.nextInt();
			
			
			System.out.println("Ingrese el valor del primer numero");
			numero1=sc.nextInt();
			System.out.println("Ingrese el valor del primer numero");
			numero2 = sc.nextInt();
		
			switch (respuesta) {	
			
				case 1:
					resultadosuma = numero1 + numero2;
					System.out.println("La suma de ambos valores es " + resultadosuma);
			
				break;
			
				case 2:
					resultadoresta = numero1 - numero2;
					System.out.println("La resta de ambos valores es" + resultadoresta);
				break;
			
				case 3:
					resultadomulti = numero1 * numero2;
					System.out.println("La multiplicación de ambos valores es" +resultadomulti);
				break;
			
				case 4:
					resultadodivi = numero1/numero2;
					System.out.println("La división de los dos valores es" + resultadodivi);
					break;
			
				case 5: 
					System.out.println("Gracias por elejirnos, trate de no regresar jamás :D");
					break;
				
			
			}
		
		} while (respuesta != 5);

	}

}
