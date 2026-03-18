// This code belongs to Aditya Yadav (2400320100103)

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public void displayStudentDetails() {
        super.displayDetails(); // better to use super
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("This code belongs to Aditya Yadav (2400320100103)");

        Student student = new Student(
            "Aditya",
            20,
            "2400320100103",
            "Computer Science"
        );

        student.displayStudentDetails();
    }
}