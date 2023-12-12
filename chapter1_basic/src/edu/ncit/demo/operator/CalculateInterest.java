package edu.ncit.demo.operator;

public class CalculateInterest {
    public  static void main(String args[]){
        System.out.println("Before method call");
        int firstInterest=getInterest(100000,1,10);
        System.out.println("first Interest::"+firstInterest);
        int secondInterest=getInterest(500000,1,10);
        System.out.println("2nd interest::"+secondInterest);


    }

    public static int getInterest(int p, int t, int r) {
        int interest=(p*t*r)/100;
        return interest;
    }


}
