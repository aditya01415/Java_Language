// wap to demonstrate throw and throws to handle user input validation(to check a valid mobile no. or email or username )
import java.util.Scanner;

// Custom Exception
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class UserValidation {

    // Method using 'throws'
    static void validateMobile(String mobile) throws InvalidInputException {
        if (!mobile.matches("\\d{10}")) {
            // using 'throw'
            throw new InvalidInputException("Invalid Mobile Number! Must be 10 digits.");
        }
    }

    static void validateEmail(String email) throws InvalidInputException {
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidInputException("Invalid Email Format!");
        }
    }

    static void validateUsername(String username) throws InvalidInputException {
        if (username.length() < 5) {
            throw new InvalidInputException("Username must be at least 5 characters long!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            validateMobile(mobile);

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            validateEmail(email);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            validateUsername(username);

            System.out.println("All inputs are valid ");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}




