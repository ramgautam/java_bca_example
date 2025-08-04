package edu.ncit.demo;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the five number");
        int number[] = new int[5];
        int min, max, sum = 0, average;
        int count = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the:" + count);
            number[i] = scanner.nextInt();
            count++;
            sum += number[i];
        }
        min = max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) min = number[i];
            if (number[i] > max) max = number[i];

        }
        average = sum / number.length;
        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("average:" + average);

    }
}
