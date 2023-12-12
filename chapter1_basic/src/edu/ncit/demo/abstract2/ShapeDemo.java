package edu.ncit.demo.abstract2;

// Abstract class Shape
abstract class Shape {
    public abstract double calculateArea(); // Abstract method to calculate area
    public abstract double calculatePerimeter(); // Abstract method to calculate perimeter
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing abstract method to calculate perimeter (circumference) for a circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area for a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementing abstract method to calculate perimeter for a rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing abstract method to calculate area for a triangle (using Heron's formula)
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementing abstract method to calculate perimeter for a triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and printing areas and perimeters
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}
