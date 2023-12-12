package edu.ncit.demo.operator;

public class DisplaySumOneToHundredWithOddAndEven {
    public static void main(String args[]){
        int oddSum=0;
        int evenSum=0;

        oddSum=provideSumOfOddNumber();
        evenSum=provideSumOfEvenNumber();

        System.out.println("Odd SUm::"+oddSum);
        System.out.printf("Even Sum::"+evenSum);

    }

    public static int provideSumOfEvenNumber(){
        int evenSum=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                evenSum=evenSum+i;
            }
        }
       return evenSum;
    }

    public static int provideSumOfOddNumber(){
        int oddSum=0;
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                oddSum=oddSum+i;
            }
        }
        return oddSum;
    }
}
