package com.lonwabo;

// Import Scanncer class
import java.util.Scanner;

public class ImperialMetric {

    public static void conversionTable() {

        // Set 'input' to a new Scanner class object
        Scanner input = new Scanner(System.in);

        // Set 'minFeetFound' to false initially. 'minFeetFound' will be used to check that the user has inputed a valid min value
        boolean minFeetFound = false;
        // Set 'minFeet' initially to 0
        int minFeet = 0;
        // Start while loop that runs code in it until the user has inputed a valid min value
        while (!minFeetFound) {
            // Ask the user to input their min value
            System.out.println("Enter the minimum number of feet (not less than 0):");
            // Set 'hasNextInt' to a boolean of the result by checking if the next thing inputed by the user is an integer
            boolean hasNextInt = input.hasNextInt();
            // Check if the next thing inputed by the user was an integer
            if (hasNextInt) {
                // Set 'minFeet' to the integer inputed by the user
                minFeet = input.nextInt();
                // Check if the min value inputed by the user is greater than or equal to 0
                if (minFeet >= 0) {
                    // Update 'minFeetFound' to true to break from while loop
                    minFeetFound = true;
                // Since the min number inputed by the user was less than zero print out an error message
                } else {
                    System.out.println("Invalid input. Please input a minimum number of feet no less than 0");
                }
            // If the above condition was not met it means the user did not inputed an integer
            } else {
                System.out.println("Invalid input. Please input an integer");
            }
            // Call nextLine method to not get an error incase user does not input an integer
            input.nextLine();
        }

        // Set 'maxFeetFound' to false initially. 'maxFeetFound' will be used to check that the user has inputed a valid max value
        boolean maxFeetFound = false;
        // Set 'maxFeet' initially to 0
        int maxFeet = 0;
        // Start while loop that runs code in it until the user has inputed a valid max value
        while (!maxFeetFound) {
            // Ask the user to input their max value
            System.out.println("Enter the maximum number of feet (no more than 30):");
            // Set 'hasNextInt' to a boolean of the result by checking if the next thing inputed by the user is an integer
            boolean hasNextInt = input.hasNextInt();
            // Check if the next thing inputed by the user was an integer
            if (hasNextInt) {
                // Set 'maxFeet' to the integer inputed by the user
                maxFeet = input.nextInt();
                // Check if the max value inputed by the user is less than 31
                if (maxFeet < 31) {
                    // Update 'maxFeetFound' to true to break from while loop
                    maxFeetFound = true;
                // Since the min number inputed by the user was greater than 30 print out an error message
                } else {
                    System.out.println("Invalid input. Please input a maximum number of feet no more than 30");
                }
            // If the above condition was not met it means the user did not inputed an integer
            } else {
                System.out.println("Invalid input. Please input an integer");
            }
            // Call nextLine method to not get an error incase user does not input an integer
            input.nextLine();
        }
        // Close the Scanner object 'input'
        input.close();
        // Print out to the terminal the first row which is the table heading with the inch values
        System.out.println("   |    0\"    1\"    2\"    3\"    4\"    5\"    6\"    7\"    8\"    9\"   10\"   11\"");
        // Start a for loop with indices 'feet' starting from the 'minFeet' until the 'maxFeet' for each foot in between those values including those values
        for (int feet = minFeet; feet <= maxFeet; feet++) {
            // Set 'tableRow' to the beginning of the table row depending on the current foot iteration
            String tableRow = String.format("%-3s", feet + "'") + "|";
            // Start a for loop for each inch in a foot with indices inches
            for (int inches = 0; inches < 12; inches++) {
                // Set metres to a double of the formula converting the given foot and inch to metres
                double metres = (feet * 12 + inches) * 0.0254;
                // Add to teh table row
                tableRow += " " + String.format("%.3f", metres);
            }
            // Print out the table row to the terminal
            System.out.println(tableRow);
        }
    }
}
