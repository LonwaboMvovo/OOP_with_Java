package com.lonwabo;

// Import Scanncer class
import java.util.Scanner;

public class PalinPerfect {

    public static void perfectPalindromeFinder() {

        // Set 'input' to a new Scanner class object
        Scanner input = new Scanner(System.in);

        // Set 'startingPointFound' to false initially. 'startingPointFound' will be used to check that the user has inputed a valid starting value
        boolean startingPointFound = false;
        // Set 'startingPoint' initially to 0
        int startingPoint = 0;
        // Start while loop that runs code in it until the user has inputed a valid starting value
        while (!startingPointFound) {
            // Ask the user to input their starting value
            System.out.println("Enter the starting point N:");
            // Set 'hasNextInt' to a boolean of the result by checking if the next thing inputed by the user is an integer
            boolean hasNextInt = input.hasNextInt();
            // Check if the next thing inputed by the user was an integer
            if (hasNextInt) {
                // Set 'startingPoint' to the integer inputed by the user
                startingPoint = input.nextInt();
                // Check if the starting value inputed by the user is greater than or equal to 0
                if (startingPoint >= 0) {
                    // Update 'startingPointFound' to true to break from while loop
                    startingPointFound = true;
                    // Since the starting number inputed by the user was less than zero print out an error message
                } else {
                    System.out.println("Invalid input. Please input a starting number no less than 0");
                }
                // If the above condition was not met it means the user did not input an integer
            } else {
                System.out.println("Invalid input. Please input an integer");
            }
            // Call nextLine method to not get an error incase user does not input an integer
            input.nextLine();
        }

        // Set 'endingPointFound' to false initially. 'endingPointFound' will be used to check that the user has inputed a valid ending value
        boolean endingPointFound = false;
        // Set 'endingPoint' initially to 0
        int endingPoint = 0;
        // Start while loop that runs code in it until the user has inputed a valid ending value
        while (!endingPointFound) {
            // Ask the user to input their ending value
            System.out.println("Enter the ending point M:");
            // Set 'hasNextInt' to a boolean of the result by checking if the next thing inputed by the user is an integer
            boolean hasNextInt = input.hasNextInt();
            // Check if the next thing inputed by the user was an integer
            if (hasNextInt) {
                // Set 'endingPoint' to the integer inputed by the user
                endingPoint = input.nextInt();
                // Check if the ending value inputed by the user is greater than or equal to 0
                if (endingPoint >= 0) {
                    // Update 'endingPointFound' to true to break from while loop
                    endingPointFound = true;
                    // Since the starting number inputed by the user was less than zero print out an error message
                } else {
                    System.out.println("Invalid input. Please input a ending number no less than 0");
                }
                // If the above condition was not met it means the user did not inputed an integer
            } else {
                System.out.println("Invalid input. Please input an integer");
            }
            // Call nextLine method to not get an error in case user does not input an integer
            input.nextLine();
        }
        // Close the Scanner object 'input'
        input.close();
        // Start a for loop for each number starting from the starting point up to the ending point with indices num going up in increments of 1
        for (int num = startingPoint + 1; num < endingPoint; num++) {
            // Set 'numString' to a string of the num at the current iteration
            String numString = "" + num;
            // Set 'reversedNum' to an empty string which represents the num at the current iteration reversed
            String reversedNum = "";
            // Start a for loop starting from the length of the num going downwards to zero
            for (int i = numString.length() - 1; i >= 0; i--) {
                // Add the character at the index to the 'reversedNum'
                reversedNum += numString.charAt(i);
            }
            // Check if the original number is equal to the reversed number
            if (num == Integer.parseInt(reversedNum)) {
                // Check if the number is a perfect square
                if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
                    // Print the number if the above conditions are ment
                    System.out.println(num);
                }
            }

        }
    }
}
