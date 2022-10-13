package taller7;

import java.util.Scanner;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		        System.out.println("Ingrese el número total de notas : ");
		        double a = sc.nextDouble(), promedio, notaAcumulada = 0.0;
		        for (int i=1; i<=a; i++){
		            System.out.println("Ingrese nota #" + i);
		            notaAcumulada+=sc.nextDouble();
		        }
		        promedio = (notaAcumulada/a);
		        System.out.println("Promedio : " + promedio);
	}
}