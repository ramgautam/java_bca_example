package edu.ncit.demo.access_modifier.for_protected;

class Animal {
    // protected method
    protected  Integer leg;

    protected void display() {
        System.out.println("I am an animal");
    }
}

public class Dog extends Animal {


    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
        // access protected method
        dog.display();


    }
}