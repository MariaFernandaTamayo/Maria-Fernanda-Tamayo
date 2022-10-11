package taller12;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arreglo = new int [10];
		int x = 1, valor1 = 1, valor2=10;;
		do {
			for(int i=0;i<arreglo.length;i++) {
				arreglo[i] = valor1*x++;
			}
			for(int i=0;i<arreglo.length;i++) {
				System.out.print("\t["+ arreglo[i] + "]");
		}
			valor1++;
			x=1;
			System.out.println();
			

	} while(valor1 <= valor2);

}


}


