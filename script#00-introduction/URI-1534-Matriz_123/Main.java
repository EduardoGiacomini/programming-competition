import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[][] matrix;
		int rows_columns;


		while (keyboard.hasNext()) {
			rows_columns = keyboard.nextInt();
			matrix = new int [rows_columns][rows_columns];
			
			for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
				matrix[i][j] = 2;
			}

			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][i] != 2)
					matrix[i][i] = 1;
			}

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] != 1 && matrix[i][j] != 2)
						matrix[i][j] = 3;
				}
			}

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.printf("%d", matrix[i][j]);
				}
				System.out.printf("\n");
			}
		}
	}
}
