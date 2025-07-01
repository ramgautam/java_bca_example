package edu.ncit.demo;

public class LiteralsExample {
    public static void main(String[] args) {
        // Integer literals
        int decimalInt = 10;          // Decimal literal
        int octalInt = 012;           // Octal literal (starts with 0)
        int hexInt = 0xA;             // Hexadecimal literal (starts with 0x)
        int binaryInt = 0b1010;       // Binary literal (starts with 0b)

        System.out.println("Decimal integer: " + decimalInt);
        System.out.println("Octal integer: " + octalInt);
        System.out.println("Hexadecimal integer: " + hexInt);
        System.out.println("Binary integer: " + binaryInt);

        // Floating-point literals
        float floatLiteral = 3.14f;   // Float literal (suffix 'f' or 'F')
        double doubleLiteral = 3.14;  // Double literal (default for floating-point)

        System.out.println("Float literal: " + floatLiteral);
        System.out.println("Double literal: " + doubleLiteral);

        //Long
        long longLiteral=14l; // Long literal (suffix 'l' or L)
        long longLiteralWrapper=14L; // Long literal (suffix 'l' or L)

        System.out.println("Long literal: " + longLiteral);
        System.out.println("Long literal: " + longLiteralWrapper);

        // Character and String literals
        char charLiteral = 'A';       // Character literal
        String stringLiteral = "Hello, world!";  // String literal

        System.out.println("Character literal: " + charLiteral);
        System.out.println("String literal: " + stringLiteral);

        // Boolean literals
        boolean trueLiteral = true;    // True boolean literal
        boolean falseLiteral = false;  // False boolean literal

        System.out.println("True boolean literal: " + trueLiteral);
        System.out.println("False boolean literal: " + falseLiteral);

        // Null literal
        Object nullLiteral = null;     // Null literal

        System.out.println("Null literal: " + nullLiteral);
    }
}

