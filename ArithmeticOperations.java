package com.test;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main (String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int a, b, c;

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (a): ");
        a = scanner.nextInt(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (b): ");
        b = scanner.nextInt(); // Read the second number

        // Perform the addition operation
        c = a + b;

        // Display the result
        System.out.println("Sum of two numbers c = " + c);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
