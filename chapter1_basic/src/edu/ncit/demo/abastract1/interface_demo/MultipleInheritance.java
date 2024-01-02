package edu.ncit.demo.abastract1.interface_demo;

/* Declare the interfaces  */
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

// Implement the interfaces in a class
class Duck implements Walkable, Swimmable {
    public void walk()
    {
        System.out.println("Duck is walking.");
    }

    public void swim()
    {
        System.out.println("Duck is swimming.");
    }
}

// Use the class to call the methods from the interfaces
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();
    }
}