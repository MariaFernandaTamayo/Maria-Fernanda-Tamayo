package taller4Y5;
import java.util.Scanner;

public class descuento20Mayora300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double compra=0;
		double total=0;
		double descuento =0;
		
		try (Scanner sc = new Scanner(System.in)) {
			{
			
			// Mandar mensaje pidiendo el valor inicial de la compra
			System.out.println("¿Cuál es el valor inicial de su compra?");
			//leer primer numero
			compra=sc.nextInt();
			System.out.println("El valor de su compra es:" + compra);
			// Condicion si es mayor a 300
			if(compra >=300) {
				descuento= compra* 0.20;
				
				
			}
			else {
				descuento=0;
			}
			
			
			System.out.println("El descuento aplicado es de:" + descuento);
			//definicion de total
			total= compra-descuento;
			System.out.println("El valor de la venta total es de:" + total);
			}
		}
	}



	}


