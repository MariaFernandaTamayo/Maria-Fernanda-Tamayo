package taller4Y5;
import java.util.Scanner;

public class areas {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int opcion;
			
			System.out.println("Seleccione la opcion que desea hallar");
			System.out.println("1:Area de triangulo, 2: Area de rectangulo, 3: Area de circulo, 4: Area de cuadrado");
			opcion=sc.nextInt();
			
			double base=0.0, altura=0.0, area=0.0, baseRec=0.0, alturaRec=0.0, areaRec=0.0, radio=0.0,pi=3.1416,areaCir=0.0,baseCuad=0.0, alturaCuad=0.0, areaCuad=0.0;
			switch(opcion) {
				case 1:
					System.out.println("ingrese la base del triangulo");
					base=sc.nextInt();
					System.out.println("ingrese la altura del triangulo");
					altura=sc.nextInt();
					area=(base*altura)/2;
					System.out.println("El area del triangulo es"+ area);
					
				case 2:
					System.out.println("ingrese la base del rectangulo");
					baseRec=sc.nextInt();
					System.out.println("ingrese la altura del rectangulo");
					alturaRec=sc.nextInt();
					areaRec=baseRec*alturaRec;
					System.out.println("el area del rectangulo es"+areaRec);
				case 3:
					System.out.println("ingrese el radio del circulo");
					radio=sc.nextInt();
					
					areaCir=pi*radio*radio;
					System.out.println("el area del circulo es"+areaCir);
					
				case 4:
					System.out.println("ingrese la base del cuadrado");
					baseCuad=sc.nextInt();
					System.out.println("ingrese la altura del cuadrado");
					alturaCuad=sc.nextInt();
					areaCuad=baseCuad*alturaCuad;
					System.out.println("el area del cuadrado es" +areaCuad);
					
					
			}
			
			
			
		}
		
		

	}


	}


