package edu.ncit.demo;

public class Main {
    public static void main(String args[]) {
//        System.out.println("Hello world");
//
//        float a=(float)(10/3);
//        System.out.println("float number ::"+ a);
//
//        int b =10/3;
//        System.out.println("int number::" + b);
//        long daysInteger=3420342309423098423L;
//        //getting vlaue from daatagases
//        short days=daysInteger;


        char ch;
        ch = 't';
        System.out.println("5" + ch + "00");
        ch = '\"';


        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }

        }
        long a []={1,2,3,45444444444466L};
        for(float b : a){
            System.out.println("using for each++"+ b);
        }
        test();
    }

    public static void test(){
        try{
            System.out.println("test");
            return;
        }finally{
            System.out.println("test in finally");
        }

    }

}