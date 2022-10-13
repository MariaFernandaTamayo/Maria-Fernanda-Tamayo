package taller6;
import java.util.Scanner;

public class punto2 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
			
		int suma=0;
	       String cad="";
	       for(int i=0;i<=100;i=i+2){
	           cad=cad+" "+i;
	           suma=suma+i;
	       }
	       System.out.println("Los numeros pares del 1 al 100 son:" +cad);
	       System.out.println("La suma de todos los pares del 1 al 100 son:" +suma);
	     }
	}
