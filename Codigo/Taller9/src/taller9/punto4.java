package taller9;

import java.util.Arrays;

public class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo= 9;
        int minimo= 1;
        
        int[] Aleatorios= new int[10];
        
        for(int i=0; i<10; i++) {
            int valorAleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1))+minimo;
                Aleatorios[i]=valorAleatorio;
                System.out.print(valorAleatorio+ " ");
        }
        Arrays.sort(Aleatorios);
        System.out.println( "Números ordenados de menor a mayor: "+Arrays.toString(Aleatorios));
    }





	}


