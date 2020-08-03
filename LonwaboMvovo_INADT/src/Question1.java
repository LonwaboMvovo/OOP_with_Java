// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// Import 'ArrayList' class used for making array lists
import java.util.ArrayList;
// Import 'Collections' class used for sorting objects
import java.util.Collections;
// Import 'Scanner' class used for taking user input
import java.util.Scanner;

// 'Question1' driver class
public class Question1 {

    // 'main' method to run the program
    public static void main(String[] args) {

        // Create a new object 'input' of the 'Scanner' class getting input from the terminal
        Scanner input = new Scanner(System.in);

        // Set new ArrayList of 'SoftDrink' objects 'softDrinks'
        ArrayList<SoftDrink> softDrinks = new ArrayList<>();

        // Start infinite while loop that only breaks when the user would like to quit the program
        while (true) {
            // Print user prompt message to determine which option they want to opt for
            System.out.println("Enter option: (1) add soft drink (2) quit:");
            // Set 'userOption' to the integer inputted by the user
            int userOption = input.nextInt();
            // Call nextLine method in case user did not input an integer
            input.nextLine();
            // Check if the 'userOption' is 1. If it is it means that the user would like to add to the soft drinks array
            if (userOption == 1) {
                // Print user prompt message to get the name, colour and volume of the soft drink the user would like to add
                System.out.println("Enter name, colour and volume in ml separated by space");
                // Set a string array 'userInput' to the line inputted by the user split by the spaces
                String[] userInput = input.nextLine().split("\\s+");
                // Ensure that the user input a valid soft drink
                if (userInput.length == 3 && userInput[2].matches("-?\\d+")) {
                    softDrinks.add(new SoftDrink(userInput[0], userInput[1], Integer.parseInt(userInput[2])));
                } else {
                    System.out.println("Invalid soft drink");
                }
            // Otherwise check if the 'userOption' is 2. If it is it means that the user would like to quit the program
            } else if (userOption == 2) {
                // Break from the infinite while loop
                break;
            }
        }

        // Close the input object using the close method to stop allocating memory for taking user inputs from the terminal
        input.close();

        // Check if 'softDrinks' is not empty by calling the isEmpty method of ArrayLists
        if (!softDrinks.isEmpty()) {
            // Sort the values of the 'softDrinks' ArrayList using the sort method of the Collections class and the comparator as a new instance of the 'SortByNameColourAndVolume' class
            Collections.sort(softDrinks, new SortByNameColourAndVolume());

            // Print each soft drink in the 'softDrinks' ArrayList
            for (int i = 0; i < softDrinks.size(); i++) {
                System.out.println(softDrinks.get(i));
            }
        }
    }
}
