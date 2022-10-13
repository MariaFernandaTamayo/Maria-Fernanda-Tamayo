package taller4Y5;
import java.util.Scanner;

public class dadosWhile {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int dado1,dado2,res, opcion, puntaje, puntajeH,puntajeM;
			
			
				System.out.println("Ingrese la opcion correspondiente a la accion a realizar");
				System.out.println("1:Arrojar dados, 2:Ver puntaje, 3:Borrar puntaje");
				opcion=sc.nextInt();
			
			
			switch(opcion) {
				case 1:
					dado1 =(int)(Math.random()*6)+1;
					dado2 =(int)(Math.random()*6)+1;
					if(dado1==dado2) {
						puntajeH = 1+1;
						puntajeH=sc.nextInt();
						
					
					}
					else if ((dado1+dado2 %2==0)&& (dado1+dado2>=5)) {
						puntajeM=1;
						
					}
			}
		// TODO Auto-generated method stub

	}

}
}