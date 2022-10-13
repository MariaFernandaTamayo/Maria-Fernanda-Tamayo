package taller9;
import java.util.Scanner;

public class punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		int total=0;
		String x[]={"Gomitas","Chocolatina","Chomelos","Paletas","Almendras","Chicles"};
		int Costo[]={200,2000,1000,300,3000,100};
		System.out.println("Que dulce desea comer:"+"\n1.Productos y precios"+"\n2.Vender producto"+"\n3.Ingresos"+"\n4.Cambiar precio");
		int i=escaner.nextInt();
		System.out.println();

		while(i!=5){
			switch(i){
				case(1):
				System.out.println("Los dulces y su precio es:");
				for(int n=0;n<x.length;n++){
					System.out.print(x[n]);
					System.out.print("Su precio es: $"+Costo[n]);
					System.out.println();	
				}
				break;
				case(2):
				    System.out.println("Cuales dulces quiere vender:");
					int j=escaner.nextInt();
					switch(j){
						case(1):
						System.out.println("Cuantas unidades quiere vender:");
						int m=escaner.nextInt();
						total=Costo[0]*m;
						break;
						case(2):
						System.out.println("Cuantas unidades quiere vender:");
						int s=escaner.nextInt();
						total=Costo[1]*s;
						break;
						case(3):
						System.out.println("Cuantas unidades quiere vender:");
						int o=escaner.nextInt();
						total=Costo[2]*o;
						break;
						case(4):
						System.out.println("Cuantas unidades quiere vender:");
						int r=escaner.nextInt();
						total=Costo[3]*r;
						break;
						case(5):
						System.out.println("Cuantas unidades quiere vender:");
						int k=escaner.nextInt();
						total=Costo[4]*k;
						break;
					}
					break;
					case(3):
					System.out.println("El total de su compra es:$"+total);
					break;
					case(4):
					System.out.println("Cual es el producto que le quiere cambiar el valor:");
					int u=escaner.nextInt();
					int d=u-1;
					System.out.println("Cual es el valor:$");
					int t=escaner.nextInt();
					Costo[d]=t;
			}
			System.out.println("Necesita algo mas:");
			i=escaner.nextInt();
		}
	

		

	}



	}


