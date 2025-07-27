package edu.ncit.demo;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

public class UserInput {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        //String number= input.next();
        String number= input.nextLine();
        double intNumber = Integer.parseInt(number);
        System.out.println("number entered by user>>>>>"+ number);
    }
}
