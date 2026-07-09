// Base class or interface
interface Shape {
    double area();
}

// Concrete implementations of Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Generic class that operates on any type that implements Shape interface
class AreaCalculator<T extends Shape> {
    private T shape;

    public AreaCalculator(T shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.area();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating instances of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Using AreaCalculator with different shapes
        AreaCalculator<Rectangle> rectangleCalculator = new AreaCalculator<>(rectangle);
        AreaCalculator<Circle> circleCalculator = new AreaCalculator<>(circle);

        // Calculating and printing areas
        System.out.println("Area of rectangle: " + rectangleCalculator.calculateArea());
        System.out.println("Area of circle: " + circleCalculator.calculateArea());
        System.gc();
        Runtime runtime = Runtime.getRuntime();
    }
}

