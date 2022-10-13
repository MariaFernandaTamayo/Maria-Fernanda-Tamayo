package taller7;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
        int n=0;
        for(int i=2; i<=100; i+=2){
            contador++;
            n+=i;
        }
        System.out.println("La cantidad de números pares de 2 hasta 100 es de: "+contador);
        System.out.println("Suma total de los pares del 1 al 100 : "+n);
    }


	}


