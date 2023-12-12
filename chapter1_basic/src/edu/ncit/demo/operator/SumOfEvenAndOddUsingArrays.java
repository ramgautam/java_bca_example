package edu.ncit.demo.operator;



public class SumOfEvenAndOddUsingArrays {
    public static void main(String args[]){

    int [] oddArray = new int [100];
    int [] evenArray= new int [100];

    oddArray=provideOddNumberArray();
    evenArray=provideEvenNumberArray();


        int i=0;
        int oddSum=0;
        System.out.println("Odd Number");
        while(i<oddArray.length){
            System.out.println(oddArray[i]);
            oddSum=oddSum+oddArray[i];
            i++;
        }
        System.out.println("Odd sum"+oddSum);
        i=0;
        int evenSum=0;
        System.out.println("Even Number");
        while(i<evenArray.length){
            System.out.println(evenArray[i]);
            evenSum=evenSum+evenArray[i];
            i++;
        }
        System.out.println("even sum"+evenSum);

    }

    public static int[] provideOddNumberArray(){
        int[] oddArray = new int [100];
        int i =1;
        int index =0;
        while(i<=100){
            if(i%2!=0){
                oddArray[index]=i;
                index++;
            }
            i++;
        }
        return oddArray;
    }

    public static int[] provideEvenNumberArray(){
        int[] evenArray = new int [100];
        int i =1;
        int index =0;
        while(i<=100){
            if(i%2==0){
                evenArray[index]=i;
                index++;
            }
            i++;
        }
        return evenArray;
    }
}
