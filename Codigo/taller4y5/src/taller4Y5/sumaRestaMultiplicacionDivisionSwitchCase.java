package taller4Y5;
import java.util.Scanner;

public class sumaRestaMultiplicacionDivisionSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner sc = new Scanner(System.in)) {
			
			// TODO Auto-generated method stub

			int num1, num2, resultado, respuesta;
			
			System.out.println("ingrese el primer numero");
			
			num1=sc.nextInt();
			
			System.out.println("ingrese el segundo numero");
			num2=sc.nextInt();
			
			System.out.println("Qu� desea hacer con esos dos numeros?");
			System.out.println("Teclee la opci�n correspondiente a la opraci�n que desea");
			System.out.println("1:Suma, 2:Resta, 3:Multiplicacion, 4:Division");
			
			respuesta=sc.nextInt();
			
			switch(respuesta) {
				case 1:
					resultado=num1+num2;
					System.out.println("El resultado de la suma es"+resultado);
					break;
				case 2:
					resultado=num1-num2;
					System.out.println("El resultado de la resta es"+resultado);
					break;
				case 3:
					resultado=num1*num2;
					System.out.println("El resultado de la multiplicacion es"+resultado);
					break;
				case 4:
					resultado=num1/num2;
					System.out.println("El resultado de la divisi�n es"+resultado);
					break;
			}
			
			
			
			
			
			
			}
		}

	



	}


