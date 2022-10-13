package taller6;
import java.util.Scanner;

public class punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese un numero X");
		 int x;
		 x=sc.nextInt();
		 int producto=1;
		 int i=1;
		 do {
			 producto=producto*i;
			 i++;
			
		 	} while(i<=x);
		 
		 
		 	System.out.println("El factorial del numero es:" +producto);
		 
		 
		

	}

}
