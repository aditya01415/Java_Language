// This code is belongs to Aditya Yadav (2400320100103)
class Person {
    void showPerson() {
        System.out.println("I am a Person.");
    }
}

class Employee {
    void showEmployee() {
        System.out.println("I am an Employee.");
    }
}

interface Sports {
    void playSports();
}

interface CulturalActivities {
    void participateInCultural();
}

interface Academics {
    void study();
}

class Student implements Sports, CulturalActivities, Academics {

    String name;
    long rollNo;

    Student(String name, long rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void playSports() {
        System.out.println(name + " plays Cricket.");
    }

    @Override
    public void participateInCultural() {
        System.out.println(name + " participates in Dance competition.");
    }

    @Override
    public void study() {
        System.out.println(name + " studies Computer Science.");
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        System.out.println("Demonstration of Multiple Inheritance in Java");
        Student s1 = new Student("Aditya Yadav", 2400320100103L);
        s1.displayDetails();
        s1.study();
        s1.playSports();
        s1.participateInCultural();

        System.out.println("\nConclusion:");
        System.out.println("Java does not support multiple inheritance using classes.");
        System.out.println("But Java supports multiple inheritance using interfaces.");
    }
}
