package taller9;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 1;
		
		
		int[] numerosAleatorios = new int[20];
		int cont = 0;
		
		for(int i=0;i<20;i++) {
			int valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			numerosAleatorios[i]=valorAleatorio;
			
			if(numerosAleatorios[i]==0) {
				System.out.println(numerosAleatorios[i]);
				cont++;
			} else {
				System.out.println(numerosAleatorios[i]);
			}
			
		}
		System.out.println("El numero es "+cont);

	}
}
		