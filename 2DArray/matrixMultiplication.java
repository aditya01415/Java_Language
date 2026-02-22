import java.util.Scanner;
public class matrixMultiplication {
    public static int[][] mulMatrices(int[][] matrixA,int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        if(rowsA!=colsB){
            System.out.print("Matrix multiplication not possible");
        }
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no. of cols:");
        int cols=sc.nextInt();

        int [][] matrixA = new int [rows][cols];
        int [][] matrixB = new int [rows][cols];
        System.out.print("Enter the elements of first matrix:");
        for(int i =0; i<rows;i++) {
            for(int j =0; i<cols;j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the elements of second matrix:");
        for(int i =0; i<rows;i++) {
            for(int j =0; i<cols;j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        int[][] result = mulMatrices(matrixA,matrixB);

        System.out.print("Resultant Matrix:");
        for(int i =0; i<rows;i++) {
            for(int j =0; i<cols;j++) {
                System.out.print(result[i][j]);
            }
        }
        sc.close();

    }
}
