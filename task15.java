// 1. Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. Abstract class implementing Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// 3a. Circle class
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, radius, radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 3b. Rectangle class
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. Main class
public class task15 {
    public static void main(String[] args) {

        // Circle instance
        Circle circle = new Circle("Red", 5.0);
        System.out.println("=== Circle ===");
        System.out.println("Color     : " + circle.color);
        System.out.println("Radius    : " + circle.radius);
        System.out.printf("Area      : %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter : %.2f%n", circle.calculatePerimeter());

        System.out.println();

        // Rectangle instance
        Rectangle rectangle = new Rectangle("Blue", 8.0, 4.0);
        System.out.println("=== Rectangle ===");
        System.out.println("Color     : " + rectangle.color);
        System.out.println("Length    : " + rectangle.length);
        System.out.println("Width     : " + rectangle.width);
        System.out.printf("Area      : %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter : %.2f%n", rectangle.calculatePerimeter());
    }
}