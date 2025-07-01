package edu.ncit.demo.this_pointer;


// Example 1: Instance Variable Hiding
class Student {
    private String name;
    private int age;

    // Constructor demonstrating instance variable hiding
    public Student(String name, int age) {
        // Without 'this', parameter names would hide instance variables
        this.name = name;  // this.name refers to instance variable
        this.age = age;    // this.age refers to instance variable

        // The following would be incorrect:
        // name = name;  // This assigns parameter to itself, instance variable remains unchanged
    }

    // Setter method also demonstrating instance variable hiding
    public void setName(String name) {
        this.name = name;  // Distinguish between parameter and instance variable
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Example 2: Constructor Chaining (this() to call another constructor)
class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this(1.0, 1.0);  // Calls the parameterized constructor with default values
        System.out.println("Default constructor called");
    }

    // Single parameter constructor
    public Rectangle(double side) {
        this(side, side);  // Calls the two-parameter constructor (creates a square)
        System.out.println("Square constructor called");
    }

    // Two parameter constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Full parameterized constructor called");
    }

    public double getArea() {
        return length * width;
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

// Example 3: Passing current object as parameter
class Calculator {
    private int value;

    public Calculator(int value) {
        this.value = value;
    }

    // Method that accepts another Calculator object
    public Calculator add(Calculator other) {
        return new Calculator(this.value + other.value);
    }

    // Method that passes current object to another method
    public void processWithHelper() {
        ThisPointerHelper helper = new ThisPointerHelper();
        helper.processCalculator(this);  // Passing current object as parameter
    }

    // Method that returns current object for method chaining
    public Calculator multiply(int factor) {
        this.value *= factor;
        return this;  // Return current object for chaining
    }

    public Calculator subtract(int num) {
        this.value -= num;
        return this;  // Return current object for chaining
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class ThisPointerHelper {
    public void processCalculator(Calculator calc) {
        System.out.println("Processing calculator with value: " + calc.getValue());
        calc.setValue(calc.getValue() * 2);
        System.out.println("Value after processing: " + calc.getValue());
    }
}

public class ThisPointerExamples {
    public static void main(String[] args) {
        System.out.println("=== Example 1: Instance Variable Hiding ===");
        Student student = new Student("Alice", 20);
        student.displayInfo();
        student.setName("Bob");
        student.setAge(22);
        student.displayInfo();

        System.out.println("\n=== Example 2: Constructor Chaining ===");
        Rectangle rect1 = new Rectangle();  // Default constructor
        rect1.displayDimensions();
        System.out.println("Area: " + rect1.getArea());

        Rectangle rect2 = new Rectangle(5.0);  // Square constructor
        rect2.displayDimensions();
        System.out.println("Area: " + rect2.getArea());

        Rectangle rect3 = new Rectangle(4.0, 6.0);  // Full constructor
        rect3.displayDimensions();
        System.out.println("Area: " + rect3.getArea());

        System.out.println("\n=== Example 3: Passing Current Object as Parameter ===");
        Calculator calc1 = new Calculator(10);
        Calculator calc2 = new Calculator(5);

        // Adding two calculator objects
        Calculator result = calc1.add(calc2);
        System.out.println("10 + 5 = " + result.getValue());

        // Using helper class (passing current object)
        calc1.processWithHelper();

        // Method chaining (returning current object)
        Calculator calc3 = new Calculator(8);
        int finalValue = calc3.multiply(3).subtract(4).getValue();
        System.out.println("8 * 3 - 4 = " + finalValue);
    }
}
