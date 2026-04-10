import java.io.Console;

public class UsernamePass {
 public static void main(String[] args) {

 Console console = System.console();

 if (console == null) {
 System.out.println("Console not available. Run this program in terminal.");
return;
 }

 String username = console.readLine("Enter Username: ");

 char[] passwordArray = console.readPassword("Enter Password: ");
 String password = new String(passwordArray);

 System.out.println("\nEntered Username: " + username);
 System.out.println("Entered Password: " + password);
 }
}

