package edu.ncit.demo;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        String number= input.next();
        System.out.println("number entered by user>>>>>"+ number);
    }
}
