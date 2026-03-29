package Mathematics;

public class Matrix {
    int rows, cols;
    int[][] a;

    public Matrix(int r, int c) {
        rows = r;
        cols = c;
        a = new int[r][c];
    }

    public void setElement(int i, int j, int val) {
        a[i][j] = val;
    }

    public Matrix add(Matrix m) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res.a[i][j] = a[i][j] + m.a[i][j];
        return res;
    }

    public Matrix subtract(Matrix m) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res.a[i][j] = a[i][j] - m.a[i][j];
        return res;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
