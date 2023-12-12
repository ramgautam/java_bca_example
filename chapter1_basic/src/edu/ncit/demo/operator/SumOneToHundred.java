package edu.ncit.demo.operator;

public class SumOneToHundred {
    public static void main(String args[]){
        System.out.println("sum from for loop");
        //declaration and initialization
        int sum=0;
        for(int i =1;i<=100;i++) {

            sum=sum+i;//use
        }


        System.out.println("Sum from for loop::"+sum);//use sum variable
        System.out.println("sum from while loop");
        sum=0;
        int i =1;
        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum from while loop::"+sum);
        System.out.println("Sum from do-while loop");
        sum=0;
        i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=100);
        System.out.println("Sum from do-while loop::"+sum);

    }



}
