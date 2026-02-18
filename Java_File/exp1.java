//Write a Java program to demonstrate Compile-time Polymorphism (Method Overloading) by creating a class Calculator that performs addition of integers, floating values, and three numbers using overloaded methods.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

} 
public class exp1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sumInt);

        float sumFloat = calculator.add(5.5f, 10.5f);
        System.out.println("Sum of two floating-point numbers: " + sumFloat);

        int sumThreeInt = calculator.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sumThreeInt);
    }
}


