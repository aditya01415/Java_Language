import java.io.*;
import java.util.Scanner;

public class AllInputMethods {

 static void commandLineInput(String[] args) {
System.out.println("METHOD 1: Command Line Arguments");

 if (args.length == 0) {
 System.out.println("No command line arguments provided.");
System.out.println("Run as: java AllInputMethods <name> <age>");
 } else {
System.out.println("Number of arguments: " + args.length);
 for (int i = 0; i < args.length; i++) {
 System.out.println("Argument[" + i + "] = " + args[i]);
 }
 }
 System.out.println();
 }

 @SuppressWarnings("deprecation")
 static void dataInputStreamInput() {
 System.out.println("METHOD 2: DataInputStream");

 try {
 DataInputStream dis = new DataInputStream(System.in);

 System.out.print("Enter your City: ");
 String city = dis.readLine();

System.out.println("City: " + city);
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
System.out.println();
 }

 static void bufferedReaderInput() {
 System.out.println("METHOD 3: BufferedReader");
 System.out.println("METHOD 3: BufferedReader");

 try {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter your College: ");
String college = br.readLine();

 System.out.print("Enter your Course: ");
String course = br.readLine();

 System.out.println("College: " + college);
 System.out.println("Course : " + course);
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 System.out.println();
 }

 static void scannerInput() {
 System.out.println("METHOD 4: Scanner");
Scanner sc = new Scanner(System.in);

 System.out.print("Enter your Name: ");
String name = sc.nextLine();

 System.out.print("Enter your Age: ");
 int age = sc.nextInt();
 sc.nextLine();

 System.out.print("Enter your Email: ");
 String email = sc.nextLine();

 System.out.println("Name  : " + name);
 System.out.println("Age   : " + age);
 System.out.println("Email : " + email);

 System.out.println();
 }

 static void consoleInput() {
 System.out.println("METHOD 5: Console");

 Console console = System.console();

if (console == null) {
System.out.println("Console not available.");
 } else {
String username = console.readLine("Enter Username: ");
char[] passwordArr = console.readPassword("Enter Password: ");
String password = new String(passwordArr);

System.out.println("Username : " + username);
 System.out.println("Password : " + password);
}
 System.out.println();
 }

 public static void main(String[] args) {

 System.out.println();
System.out.println("Java All Input Methods Demo ");
System.out.println();

 commandLineInput(args);
 dataInputStreamInput();
 bufferedReaderInput();
scannerInput();
 consoleInput();

 System.out.println("Java All Input Methods Demo ");
 }
}

