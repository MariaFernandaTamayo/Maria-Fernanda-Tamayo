package taller12;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = new int[5][5];
		int max= 9;
		int min= 1;
				
				//ciclo
				for (int i=0; i<intArray.length;i++) {
					//columnas mostradas
					for (int j=0; j<intArray[i].length;j++) {
						intArray[i][j]= (int) Math.floor(Math.random()*(max-min+1))+min;
					}
					
				}
				
				
				//Imprimir el arreglo
				for (int i=0; i<intArray.length;i++) {
					//columnas mostradas
					for (int j=0; j<intArray[i].length;j++) {
						System.out.print(intArray[i][j]+" ");
						
					}
					System.out.println();
				}
				
				
				
				
				
			}

		

	

}
