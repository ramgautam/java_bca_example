package edu.ncit.demo.exception.checked_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckExceptionDemo {
    public static void main(String[] args) {

        System.out.println("\n====== 5. ParseException ======");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        // Case 1: valid date
        try {
            java.util.Date d = sdf.parse("2024-07-09");
            System.out.println("Valid date    : " + d);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Case 2: wrong format
        try {
            sdf.parse("09/07/2024");
        } catch (ParseException e) {
            System.out.println("ParseException : " + e.getMessage());
            System.out.println("Error offset   : " + e.getErrorOffset());
        }

        // Case 3: invalid month
        //try {
            sdf.parse("2024-13-01");
//        } catch (ParseException e) {
//            System.out.println("Invalid month  : " + e.getMessage());
//        }

        // Case 4: number format
        try {
            Number n = new DecimalFormat("#,###.##").parse("1,234.56");
            System.out.println("Parsed number  : " + n);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
