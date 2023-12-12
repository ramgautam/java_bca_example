package edu.ncit.demo.operator;

public class FibonniSeries {
    public static void main(String args[]) {
        int count = 4;
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
        int counter = 1;
        int sum = 0;
        if (count == 0) {
            System.out.print("0,");
        }
        while (counter <= count) {
            System.out.print(sum + counter);
            count++;
        }
    }
}
