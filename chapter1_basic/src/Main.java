public class Main {
    public static void main(String[] args)
    {

        byte a=64,b;
        int i;
        i=a<<2;
        b=(byte)(a<<2);
        System.out.println("Original value of a :"+a);
        System.out.println("i and b :"+i+" " +b);

        System.out.println("Hello world!");

        char ch;
        ch='X';
        System.out.println("The value of ch:"+ch);
        ch++;
        System.out.println("The value of ch:"+ch);
        ch=90;
        System.out.println("The value of ch:"+ch);
    }
}