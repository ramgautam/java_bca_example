package edu.ncit.demo.abstract3;

// Parent class
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class 1
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Child class 2
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Department: " + department);
    }
}

public class AbstractAccountDemo {
    public static void main(String[] args) {
        Employee emp1 = new Developer("John Doe", 50000, "Java");
        Employee emp2 = new Manager("Jane Smith", 60000, "HR");

        // Polymorphism: calling overridden methods
        emp1.displayDetails();
        System.out.println("--------------------");
        emp2.displayDetails();
    }
}

