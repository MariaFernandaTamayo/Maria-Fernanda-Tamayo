package taller12;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {{11,12,13},{21,22,23}};

		System.out.println("Matriz original :\n");
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 3; c++)
				System.out.print("a"+matriz[f][c] + " ");

			System.out.println();
		}

		int[][] transpuesta = new int[9][5];

		//Se transpone la matriz
		for (int x = 0; x < 2; x++)
			for (int c = 0; c < 3; c++)
				transpuesta[c][x] = matriz[x][c];

		//Mostrar matriz
		System.out.println("\nMatriz transpuesta:\n");
		for (int x = 0; x < 3; x++) {
			for (int c = 0; c < 2; c++)
				System.out.print("a" + transpuesta[x][c] + " ");

			System.out.println();
		}

		}

		

	}


