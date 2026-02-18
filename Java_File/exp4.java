//Write a Java program to justify that Java does not support multiple inheritance using classes, but multiple inheritanc can be achieved using interfaces by implementing more than one interface in a single class.
interface A {
    void methodA();
}
interface B {
    void methodB();
}
class C implements A, B {
    public void methodA() {
        System.out.println("Method A from interface A");
    }
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}
public class exp4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}   

