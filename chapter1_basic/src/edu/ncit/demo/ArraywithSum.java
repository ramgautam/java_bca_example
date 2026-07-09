package edu.ncit.demo;

import java.util.Scanner;

public class ArraywithSum {
    public static  void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int number[]=new int[10];//array intialize
        int sum=0;
        for(int i=0;i<10;i++){
            int count=i;
            System.out.println("Enter the "+ ++count );
            number[i]=scanner.nextInt();
            sum+=number[i];
        }
        //displaying
        System.out.println("Sum::"+ sum);
    }
}
