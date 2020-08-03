// Objects and Classes: Exercise Four
// 15/07/2020
// Lonwabo Mvovo

// Import Scanner class in order to receive inputs from the user
import java.util.Scanner;

// Meteorology class
public class Meteorology {

    // main method to run Meteorology program
    public static void main(String[] args) {

        // Set 'temperature' to a new object of the 'Collator' class
        Collator temperature = new Collator("Temperature");
        // Set 'pressure' to a new object of the 'Collator' class
        Collator pressure = new Collator("Pressure");
        // Set 'humidity' to a new object of the 'Collator' class
        Collator humidity = new Collator("Humidity");

        // Set 'programQuestionSet' to a String consisting of the Meteorology program options for the user
        String programQuestionSet = "Meteorology Program\n" // using '\n' to create a new line so that the options can appear on different lines in the terminal as shown in the exercise
                + "Make a selection and press return:\n"
                + "1. Record a temperature reading.\n"
                + "2. Record a pressure reading.\n"
                + "3. Record a humidity reading.\n"
                + "4. Print maximum values.\n"
                + "5. Print minimum values.\n"
                + "6. Print average values.\n"
                + "7. Quit.";

        // Set 'input' to a new object of the Scanner class in order to receive inputs from the user
        Scanner input = new Scanner(System.in);

        // Initially print the Meteorology program options to the terminal to start the program
        System.out.println(programQuestionSet);
        // Start an infinite while loop that breaks when the user opts to quit from the program
        while (true) {
            // Set 'selectionIsInt' to a boolean that represents whether the next input from the user is an integer or not
            boolean selectionIsInt = input.hasNextInt();
            // Check if 'selectionIsInt' is true
            if (selectionIsInt) {
                // Set 'selection' to an integer representing the program option the user would like to select
                int selection = input.nextInt();
                // Check that the 'selection' is one of the available program options, ranging from 1-7
                if (selection > 0 && selection < 7) {
                    // Check if 'selection' is equal to 1, which means that the user would like to record a temperature reading
                    if (selection == 1) {
                        // Ask the user to enter a value for the reading they would like to record for temperature
                        System.out.println("Enter a value:");
                        // Set 'temperatureReadingIsInt' to a boolean that represents whether the next input from the user is an integer or not
                        boolean temperatureReadingIsInt = input.hasNextInt();
                        // Check if 'temperatureReadingIsInt' is true
                        if (temperatureReadingIsInt) {
                            // Record the temperature that the user inputted using the recordReading method
                            temperature.recordReading(input.nextInt());
                        }
                    // Otherwise check if 'selection' is equal to 2, which means that the user would like to record a pressure reading
                    } else if (selection == 2) {
                        // Ask the user to enter a value for the reading they would like to record for pressure
                        System.out.println("Enter a value:");
                        // Set 'pressureReadingIsInt' to a boolean that represents whether the next input from the user is an integer or not
                        boolean pressureReadingIsInt = input.hasNextInt();
                        // Check if 'pressureReadingIsInt' is true
                        if (pressureReadingIsInt) {
                            // Record the pressure that the user inputted using the recordReading method
                            pressure.recordReading(input.nextInt());
                        }
                    // Otherwise check if 'selection' is equal to 3, which means that the user would like to record a humidity reading
                    } else if (selection == 3) {
                        // Ask the user to enter a value for the reading they would like to record for humidity
                        System.out.println("Enter a value:");
                        // Set 'humidityReadingIsInt' to a boolean that represents whether the next input from the user is an integer or not
                        boolean humidityReadingIsInt = input.hasNextInt();
                        // Check if 'humidityReadingIsInt' is true
                        if (humidityReadingIsInt) {
                            // Record the humidity that the user inputted using the recordReading method
                            humidity.recordReading(input.nextInt());
                        }
                    // Otherwise check if 'selection' is equal to 4, which means that the user would like the program to print out the maximum values for temperature, pressure and humidity
                    } else if (selection == 4) {
                        // Check if the user has not inputted any reading for temperature
                        if (temperature.numberOfReadings() == 0) {
                            // Print out the maximum temperature message except with a dash indicate that there are no readings inputted for temperature
                            System.out.println("Maximum temperature: -");
                        } else {
                            // Print out the maximum temperature message with the maximum temperature that has been inputted using the maximum method from the 'Collator' class
                            System.out.println("Maximum temperature: " + temperature.maximum());
                        }

                        // Check if the user has not inputted any reading for pressure
                        if (pressure.numberOfReadings() == 0) {
                            // Print out the maximum pressure message except with a dash indicate that there are no readings inputted for pressure
                            System.out.println("Maximum pressure: -");
                        } else {
                            // Print out the maximum pressure message with the maximum pressure that has been inputted using the maximum method from the 'Collator' class
                            System.out.println("Maximum pressure: " + pressure.maximum());
                        }

                        // Check if the user has not inputted any reading for humidity
                        if (humidity.numberOfReadings() == 0) {
                            // Print out the maximum humidity message except with a dash indicate that there are no readings inputted for humidity
                            System.out.println("Maximum humidity: -");
                        } else {
                            // Print out the maximum humidity message with the maximum humidity that has been inputted using the maximum method from the 'Collator' class
                            System.out.println("Maximum humidity: " + humidity.maximum());
                        }
                    // Otherwise check if 'selection' is equal to 5, which means that the user would like the program to print out the minimum values for temperature, pressure and humidity
                    } else if (selection == 5) {
                        // Check if the user has not inputted any reading for temperature
                        if (temperature.numberOfReadings() == 0) {
                            // Print out the minimum temperature message except with a dash indicate that there are no readings inputted for temperature
                            System.out.println("Minimum temperature: -");
                        } else {
                            // Print out the minimum temperature message with the minimum temperature that has been inputted using the minimum method from the 'Collator' class
                            System.out.println("Minimum temperature: " + temperature.minimum());
                        }

                        // Check if the user has not inputted any reading for pressure
                        if (pressure.numberOfReadings() == 0) {
                            // Print out the minimum pressure message except with a dash indicate that there are no readings inputted for pressure
                            System.out.println("Minimum pressure: -");
                        } else {
                            // Print out the minimum pressure message with the minimum pressure that has been inputted using the minimum method from the 'Collator' class
                            System.out.println("Minimum pressure: " + pressure.minimum());
                        }

                        // Check if the user has not inputted any reading for humidity
                        if (humidity.numberOfReadings() == 0) {
                            // Print out the minimum humidity message except with a dash indicate that there are no readings inputted for humidity
                            System.out.println("Minimum humidity: -");
                        } else {
                            // Print out the minimum humidity message with the minimum humidity that has been inputted using the minimum method from the 'Collator' class
                            System.out.println("Minimum humidity: " + humidity.minimum());
                        }
                    // Otherwise since the selection is equal to 6, this means that the user would like the program to print out the average values for temperature, pressure and humidity
                    } else {
                        // Check if the user has not inputted any reading for temperature
                        if (temperature.numberOfReadings() == 0) {
                            // Print out the average temperature message except with a dash indicate that there are no readings inputted for temperature
                            System.out.println("Average temperature: -");
                        } else {
                            // Print out the average temperature message with the average temperature that has been inputted using the average method from the 'Collator' class
                            System.out.println("Average temperature: " + String.format("%.2f", temperature.average()));
                        }

                        // Check if the user has not inputted any reading for pressure
                        if (pressure.numberOfReadings() == 0) {
                            // Print out the average pressure message except with a dash indicate that there are no readings inputted for pressure
                            System.out.println("Average pressure: -");
                        } else {
                            // Print out the average pressure message with the average pressure that has been inputted using the average method from the 'Collator' class
                            System.out.println("Average pressure: " + String.format("%.2f", pressure.average()));
                        }

                        // Check if the user has not inputted any reading for humidity
                        if (humidity.numberOfReadings() == 0) {
                            // Print out the average humidity message except with a dash indicate that there are no readings inputted for humidity
                            System.out.println("Average humidity: -");
                        } else {
                            // Print out the average humidity message with the average humidity that has been inputted using the average method from the 'Collator' class
                            System.out.println("Average humidity: " + String.format("%.2f", humidity.average()));
                        }
                    }
                    // Print the Meteorology program options to the terminal again to continue the program
                    System.out.println(programQuestionSet);
                // Otherwise check if the 'selection' is equal to 7 which means that the user would like to quit from the program
                } else if (selection == 7) {
                    // Break from the infinite while loop
                    break;
                // If none of the above conditions were met it means that the user did not input an integer representing a valid option from the program
                } else {
                    // Print out an error message
                    System.out.println("Invalid input. Selection needs to be an integer from 1-7 relating to the operation you would like to do");
                }
            }
            // Call the 'nextLine' method from the Scanner class in case the user did not input an integer to avoid errors
            input.nextLine();
        }

        // Close the 'input' object from taking inputs using the close() method from the Scanner class
        input.close();
    }
}
