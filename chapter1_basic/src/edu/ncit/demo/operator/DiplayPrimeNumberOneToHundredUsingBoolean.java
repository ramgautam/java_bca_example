package edu.ncit.demo.operator;

public class DiplayPrimeNumberOneToHundredUsingBoolean {

    public static void main(String args[]) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrimeNumber = checkingPrimeNumberUsingBoolean(i);
            if (isPrimeNumber) {

                System.out.printf(" " + i + " ");
            }
        }
    }
    private static boolean checkingPrimeNumberUsingBoolean(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int checkingPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
