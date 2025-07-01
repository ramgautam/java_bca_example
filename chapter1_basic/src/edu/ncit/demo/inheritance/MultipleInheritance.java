package edu.ncit.demo.inheritance;

interface Printable {
    void print();
}
interface Showable {
    void show();
}

public class MultipleInheritance implements Printable,Showable {

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.print();
        mi.show();
    }
    @Override
    public void print() {
        System.out.println("Printing Multiple Inheritance   ");
    }

    @Override
    public void show() {
        System.out.println("Showing Multiple Inheritance   ");

    }
}
