package edu.ncit.demo.operator;

public class FibonniSeries {
    public static void main(String args[]) {
        int count = 10;
        int counter=1;
        displayFibooniSeries(count);
    }
    public static void displayFibooniSeries(int count) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + count + " terms:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
