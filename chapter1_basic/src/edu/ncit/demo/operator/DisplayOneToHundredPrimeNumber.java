package edu.ncit.demo.operator;

public class DisplayOneToHundredPrimeNumber {

    public static void main(String args[]) {
        for (int i = 2; i <= 100; i++) {
            int flag = checkingPrimeNumberWithDoWhileLoop(i);
            if (flag == 1) {
                System.out.printf(" " + i + " ");
            }
        }
    }

    private static int checkingPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    private static int checkingPrimeNumberWithWhileLoop(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return 0;
            }
            i++;
        }

        return 1;

    }

    private static int checkingPrimeNumberWithDoWhileLoop(int number) {
        int i = 2;
        do {
            if (number % i == 0) {
                return 0;
            }
            i++;
        } while (i < number);
        return 1;
    }
}


