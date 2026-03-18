// This code is belongs to Aditya Yadav (2400320100103)
import java.util.Scanner;

class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class UserDefinedExceptionDemo {

    public static void main(String[] args) {
        System.out.println("This code is belong to Aditya Yadav (2400320100103)");
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        try {
            account.deposit(amount);
        }
        catch (NegativeAmountException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        account.displayBalance();

        sc.close();
    }
}
