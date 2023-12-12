package edu.ncit.demo.operator;

public class ModuloOperator {

    public static void main(String args[]){
        int checkingNumber=55;
        int reminder=checkingNumber%2;
        int value=checkingNumber/2;
        System.out.println("reminder:::" +reminder);
        System.out.println("value:"+value);
        if(reminder==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
        int billAmount=1545;
        int value2=billAmount%10;
        System.out.println("value"+value2);
        String billText="One Thousand five hundred and fourty-five";



    }
}
