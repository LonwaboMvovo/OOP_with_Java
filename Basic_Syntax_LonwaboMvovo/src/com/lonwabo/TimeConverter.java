// Basic Syntax: Excercise One
// 07/07/2020
// Lonwabo Mvovo

package com.lonwabo;

// Import Scanncer class
import java.util.Scanner;

public class TimeConverter {

    public static String timeConverter() {

        // Set 'input' to a new Scanner class object
        Scanner input = new Scanner(System.in);
        // Set 'time' to a string inputed by user
        String time = input.nextLine();
        // Close the Scanner object 'input'
        input.close();

        // Remove all possible whitespaces in the 'time' string
        time = time.replaceAll("\\s+","");

        // Check that the time is correctly inputed for analog time with 2 significant digits for the hour
        if ((time.length() == 7) && (Character.isDigit(time.charAt(0))) && (Character.isDigit(time.charAt(1))) && (Character.compare(time.charAt(2), ':') == 0) && (Character.isDigit(time.charAt(3))) && (Character.isDigit(time.charAt(4))) && Integer.parseInt(time.substring(0, 2)) < 13 && Integer.parseInt(time.substring(3, 5)) < 60 && (time.endsWith("am") || time.endsWith("pm"))) {
            // Check if it is am time
            if (time.endsWith("am")) {
                // Check if the first two digits are equal to 12 and if they are return the digital time for that case
                if (Integer.parseInt(time.substring(0, 2)) == 12) {
                    return "00:00";
                }
                // Otherwise since the first two digits are not equal to 12 remove the last two characters in the time string and return this new time
                time = time.substring(0, 5);
                return time;
            // Otherwise if it is pm time
            } else {
                // Check if the first two digits are equal to 12 and if they are return the digital time for that case
                if (Integer.parseInt(time.substring(0, 2)) == 12) {
                    return "12:00";
                }
                // Otherwise since the first two digits are not equal to 12 add 12 to the first to digits, remove the last two characters in the time string and return this new time
                time = (Integer.parseInt(time.substring(0, 2)) + 12) + time.substring(2, 5);
                return time;
            }
        // Check that the time is correctly inputed for analog time with 1 significant digit for the hour
        } else if ((time.length() == 6) && (Character.isDigit(time.charAt(0))) && (Character.compare(time.charAt(1), ':') == 0) && (Character.isDigit(time.charAt(2))) && (Character.isDigit(time.charAt(3))) && Integer.parseInt(time.substring(2, 4)) < 60 && (time.endsWith("am") || time.endsWith("pm"))) {
            // Check if it is am time
            if (time.endsWith("am")) {
                // Add a "0" placeholder to the begining of 'time', remove the last two characters in the time string and return this new time
                time = "0" + time.substring(0, 4);
                return time;
            // Otherwise if it is pm time
            } else {
                // Add 12 to the first digit of 'time', remove the last two characters in the time string and return this new time
                time = (Integer.parseInt(time.substring(0, 1)) + 12) + time.substring(1, 4);
                return time;
            }
        }
        // Check that the time is correctly inputed for digital time with 2 significant digits for the hour
        if ((time.length() == 5) && (Character.isDigit(time.charAt(0))) && (Character.isDigit(time.charAt(1))) && (Character.compare(time.charAt(2), ':') == 0) && (Character.isDigit(time.charAt(3))) && (Character.isDigit(time.charAt(4))) && Integer.parseInt(time.substring(0, 2)) < 24 && Integer.parseInt(time.substring(3, 5)) < 60) {
            // Check if it is suppose to be pm time
            if (Integer.parseInt(time.substring(0, 2)) > 12) {
                // Subtract 12 from the first two digits in 'time' and format them over 2 spaces with "0" as a placeholder, add pm to te end of the time string and return this new time
                time = String.format("%02d", Integer.parseInt(time.substring(0, 2)) - 12) + time.substring(2, 5) + " pm";
                return time;
            }
            // Check if the first two digits are equal to 12
            if (Integer.parseInt(time.substring(0, 2)) == 12) {
                // Add pm to the time string and return this new time
                time = time.substring(0, 5) + " pm";
                return time;
            }
            // Check if the first two digits are equal to 0 and if they are return the appropriate analog time for this case
            if (Integer.parseInt(time.substring(0, 2)) == 0) {
                return "12:00 am";
            }
            // Otherwise if none of the above conditions are met, add "am" to time and return this new time
            time = time.substring(0, 5) + " am";
            return time;
        // Check that the time is correctly inputed for digital time with 1 significant digit for the hour
        } else if ((time.length() == 4) && (Character.isDigit(time.charAt(0))) && (Character.compare(time.charAt(1), ':') == 0) && (Character.isDigit(time.charAt(2))) && (Character.isDigit(time.charAt(3))) && Integer.parseInt(time.substring(2, 4)) < 60) {
            // Check if the first digit is equal to 0 and if it is return the appropriate analog time for this case
            if (Integer.parseInt(time.substring(0, 1)) == 0) {
                return "12:00 am";
            }
            // Add "0" as a placeholder to the beginning of 'time', and am to the end of time and return this new time
            time = "0" + time.substring(0, 4) + " am";
            return time;
        }

        // If none of the above conditions were met it means that and invalid time was inputed for the time so return "Invalid time"
        return "Invalid time";
    }
}
