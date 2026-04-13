import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

    try {
 System.out.print("Enter first number: ");
 int a = sc.nextInt();

 System.out.print("Enter second number: ");
 int b = sc.nextInt();
 int result = a / b;
 System.out.println("Result: " + result);
 int[] arr = {10, 20, 30};
System.out.print("Enter index (0-2): ");
int index = sc.nextInt();

 System.out.println("Element: " + arr[index]);
 }

 catch (ArithmeticException e) {
 System.out.println("Error: Cannot divide by zero.");
 }

 catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Error: Invalid array index.");
 }

 catch (Exception e) {
 System.out.println("General Error: " + e.getMessage());
 }

 finally {
 System.out.println("Finally block executed (cleanup done).");
 sc.close();
 }
}
}

