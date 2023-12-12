package edu.ncit.demo.operator;

public class CalculateInterestUsingArray {

    public  static void main(String args[]){
        System.out.println("Before method call");
        int firstInterest=getInterest(100000,1,10);
        System.out.println("first Interest::"+firstInterest);
        int secondInterest=getInterest(500000,1,10);
        System.out.println("2nd interest::"+secondInterest);

        System.out.println("Interest calculation using array");
        int []p={100000,500000};
        int []t={1,1};
        int []r={10,10};
         int [] interestArray=getInterestUsingArray(p,t,r);
        System.out.println("First Interest::"+interestArray[0]);
        System.out.println("Second Interest::"+interestArray[1]);

        int []a=new int[5];
        a[0]=3;
        System.out.println(""+a[0]);

    }

    private static int getInterest(int p, int t, int r) {
        int interest=(p*t*r)/100;
        return interest;
    }

    private static int[] getInterestUsingArray(int[] p, int[] t, int[] r){
        int []  interestArray;
             interestArray   =new int[p.length];
        System.out.println("length::"+p.length);

        for(int i=0;i<p.length;i++){
            interestArray[i]=(p[i]*t[i]*r[i])/100;
        }
        return interestArray;
    }
}
