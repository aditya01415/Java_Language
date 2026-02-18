//Write a java program to implement user defined exception handling for negative amount entered.
import java.util.Scanner;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
public class exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Negative amount entered: " + amount);
            } else {
                System.out.println("Amount entered: " + amount);
            }
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}





