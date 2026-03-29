import Mathematics.Matrix;

public class MainApp {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.setElement(0, 0, 1);
        m1.setElement(0, 1, 2);
        m1.setElement(1, 0, 3);
        m1.setElement(1, 1, 4);

        m2.setElement(0, 0, 5);
        m2.setElement(0, 1, 6);
        m2.setElement(1, 0, 7);
        m2.setElement(1, 1, 8);

        Matrix sum = m1.add(m2);
        Matrix diff = m1.subtract(m2);

        sum.display();
        diff.display();
    }
}
