package taller7;

import java.util.Scanner;

public class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 double num1=-0.1, num2=-0.1;
	        System.out.println("Ingrese el primer n�mero (Debe ser entero mayor o igual a 0" 
	        +" y menor que el segundo n�mero)");
	        while(num1<0 || (num1-Math.round(num1))!=0.0){
	            num1 = sc.nextDouble();
	            if(num1<0 || (num1-Math.round(num1))!=0.0){System.out.println("El n�mero no cumple con las condiciones dadas."
	            +" Int�ntelo nuevamente.");}
	        }
	        System.out.println("Ingrese el segundo n�mero (Debe ser entero positivo y mayor"
	        +" que el primer n�mero)");
	        while(num2<=num1 || (num2-Math.round(num2))!=0.0){
	            num2 = sc.nextDouble();
	            if(num2<=num1 || (num2-Math.round(num2))!=0.0){System.out.println("El n�mero no cumple con las condiciones dadas."
	            +" Int�ntelo nuevamente.");}
	        }    
	        for(int i= (int)(num2-num1)-1; i>=0; i--){
	        System.out.print(num1);
	        num1+=num2-i; 
	        System.out.println(" + "+ (num2-i) +" = "+num1);
	        }
	    }

	


}

