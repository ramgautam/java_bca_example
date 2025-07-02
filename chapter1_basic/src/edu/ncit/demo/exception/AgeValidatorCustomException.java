package edu.ncit.demo.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidatorCustomException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine(); // Accepts string input

            // Call validate method with string input
            validateAge(input);

            System.out.println("Age is valid. You are eligible.");

        } catch (InvalidAgeException e) {
            System.out.println("Validation Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be a number.");

        } catch (NullPointerException e) {
            System.out.println("Input Error: Age cannot be null.");

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Finished age validation.");
        }
    }

    // Validate string input and throw appropriate exceptions
    public static void validateAge(String ageStr) throws InvalidAgeException {
        if (ageStr == null) {
            throw new NullPointerException();
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageStr); // may throw NumberFormatException
        } catch (NumberFormatException n) {
             throw new InvalidAgeException("Number Parsing exception::" + ageStr);
        }
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old.");
        }
    }
}

