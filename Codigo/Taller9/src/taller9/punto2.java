package taller9;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numMin= 0;
	        int numMax= 30;
	        
	        int [] numAleatorio= new int[6];
	        
	        for(int i=0; i< numAleatorio.length; i++) {
	            int valorAleatorio= (int) Math.floor(Math.random()*(numMax-numMin+1))+ numMin;
	            numAleatorio[i]= valorAleatorio;
	            
	            if(numAleatorio[i]%3==0) {
	                System.out.println("El número "+ numAleatorio[i]+" es múltiplo de 3");
	            }
	        }
	        for(int valor: numAleatorio) {
	            System.out.println("Número: "+ valor);
	        }

	}

}
