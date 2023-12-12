package edu.ncit.demo.operator;

public class TenaryOperator {

    public static void main(String[] args) {
        Double number = -5.5;
        String result;

//        if(number>0.0){
//            result="positive";
//        }
//        else{
//            result="not positive";
//        }

        result = (number >0.0) ? "positive" : "not positive";
        System.out.println(number + " is " + result);
    }
}
