//Write a Java program to demonstrate Runtime Polymorphism (Method Overriding) by creating a base class Shape and derived classes Circle and Rectangle to override the area method and display the area of each shape.
class Shape {
    public void area() {
        System.out.println("Area of shape");
    }
}
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class exp3 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        shape1.area(); 
        shape2.area(); 
    }
}