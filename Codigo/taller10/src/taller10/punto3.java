package taller10;
import java.util.Scanner;
public class punto3 {
	static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String respuesta;
		System.out.println("escriba su contrase�a");
		respuesta =sc.nextLine();
		
		while (!respuesta.equals("paradigma")) {
			System.out.println("Incorrecto");
			System.out.println("escriba la contrase�a de nuevo");
			break;
			
		}
		System.out.print("Correcto");
	}

}
		
		