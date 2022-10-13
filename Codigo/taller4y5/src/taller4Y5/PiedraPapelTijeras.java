package taller4Y5;
import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int res= 1, jugadaU;
			
			
			String jugada, jugadaM;
			String[] jugadas = {"Piedra", "Papel", "Tijeras"};
			
			while (res ==1) {
				System.out.println("Jugador, ingrese su jugada: [1: Piedra; 2:Papel; 3:Tijeras]");
				jugadaU= sc.nextInt();
				jugada=jugadas[jugadaU-1];
				jugadaM = jugadas[1+(int)(Math.random()*1)];
				
				//condiciones donde gana jugador
				if ((jugada == "Piedra") && (jugadaM =="Tijeras")) {
					System.out.println("Ha ganado Jugador, felicidades. La máquina jugó"+jugadaM + "\n");
					
				}
				else if((jugada =="Papel")&&(jugadaM=="Piedra")) {
					System.out.println("Ha ganado jugador, felicidades. La máquina jugó"+jugadaM +  "\n");
					
				}
				else if ((jugada =="Tijeras")&&(jugadaM=="Papel")) {
					System.out.println("Ha ganado jugador, felicidades. La máuina jugó" +jugadaM + "\n");
					
				}
				
				//condiciones donde gana máquina
				
				if ((jugadaM=="Piedra")&&(jugada=="Tijeras")) {
					System.out.println("Ha ganado la máquina, mayor suerte a la próxima jugador :c. La máquina jugó"+jugadaM +"\n");
				}
				else if((jugadaM=="Papel")&&(jugada=="Piedra")) {
					System.out.println("Ha ganado la máquina, mayor suerte a la próxima jugador :c. La máquina jugó" + jugadaM + "\n");
					
				}
				
				else if((jugadaM=="Tijeras")&&(jugada=="papel")) {
					System.out.println("Ha ganado la máquina, mayor suerte a la próxima jugador :c. La máquina jugó"+jugadaM +"\n" );
				}
				
				//en caso de empate
				if ((jugadaM=="Piedra")&&(jugada=="Piedra"))  {
					System.out.println("Empate");
				}
				if ((jugadaM=="Papel")&&(jugada=="Papel"))  {
					System.out.println("Empate");
				}
				
				if ((jugadaM=="Tijeras")&&(jugada=="Tijeras"))  {
					System.out.println("Empate");
				}
				
				//desea continuar?
				System.out.println("\nDesea continuar 1: si 0: no");
				res=sc.nextInt();
				
				
				
				
				
				
				
			}
			
			


		}
	}




	}


