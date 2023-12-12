package edu.ncit.demo.operator;

public class FibonniSeries {
    public static void main(String args[]) {
        int count = 10;
        int counter=1;
        //System.out.println("series"+ fib(count));
        displayFibooniSeries(count);
//        while (counter <= count) {
//            System.out.println(fib(counter));
//            count++;
//        }
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
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
