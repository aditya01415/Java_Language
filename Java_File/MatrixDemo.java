import mathematics.Matrix;

public class MatrixDemo {
	public static void main(String[] args) {
		int[][] A = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		int[][] B = {
			{9, 8, 7},
			{6, 5, 4},
			{3, 2, 1}
		};

		Matrix matrix = new Matrix();

		System.out.println("Matrix A:");
		matrix.display(A);

		System.out.println("\nMatrix B:");
		matrix.display(B);

		int[][] sum = matrix.add(A, B);
		System.out.println("\nA + B:");
		matrix.display(sum);

		int[][] difference = matrix.subtract(A, B);
		System.out.println("\nA - B:");
		matrix.display(difference);
	}
}
