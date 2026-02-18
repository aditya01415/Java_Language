//Write a Java program to demonstrate Single Inheritance by creating a Person class and deriving a Student class from it, and display the details of the student using inherited properties and methods.
class Person {
    String name;
    int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String studentId;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void displayStudentDetails() {
        displayDetails(); 
        System.out.println("Student ID: " + studentId);
    }
}
public class exp2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDetails("Alice", 20);
        student.setStudentId("S12345");
        student.displayStudentDetails();
    }
}


