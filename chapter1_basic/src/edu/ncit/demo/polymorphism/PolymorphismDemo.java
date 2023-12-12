package edu.ncit.demo.polymorphism;

class Staff {
    private String name;
    private Double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void printSalary() {
        System.out.println(getName() + " earns $" + getSalary());
    }

    // Method to be overridden by subclasses
    public double calculateBonus() {
        return 0;
    }
}
class Manager extends Staff {
    private double bonusPercentage;
    public Manager(String name, double salary, double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * bonusPercentage / 100;
    }
    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Bonus: $" + calculateBonus());
    }
}
class Programmer extends Staff {
    private double overtimePay;

    public Programmer(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }
    @Override
    public double calculateBonus() {
        return overtimePay * 2;
    }
    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Overtime Pay: $" + overtimePay);
        System.out.println("Bonus: $" + calculateBonus());
    }
}
class Consultant extends Staff {
    private double hourlyRate;
    private int hoursWorked;

    public Consultant(String name, double hourlyRate, int hoursWorked) {
        super(name, 0); // Consultants don't have a fixed salary
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: $" + getSalary());
    }

    // Consultant specific bonus calculation
    @Override
    public double calculateBonus() {
        if (hoursWorked >= 40) {
            return getSalary() * 0.1; // 10% bonus for exceeding 40 hours
        }
        return 0;
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 5000, 10);
        Programmer programmer = new Programmer("Jane Doe", 3000, 50);
        Consultant consultant = new Consultant("Alex Smith", 75, 45);

        manager.printSalary();
        System.out.println();
        programmer.printSalary();
        System.out.println();
        consultant.printSalary();
    }
}
