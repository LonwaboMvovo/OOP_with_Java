// Class Members and Arrays: Question 1
// 21/07/2020
// Lonwabo Mvovo

public class NumberUtils {

    // Fields: No fields or instance variables needed for this class

    // Constructor:
    private NumberUtils() {} // Private, empty-bodied constructor prevents NumberUtil objects from being created

    // Methods:
    // 'toArray' method which converts an integer 'number' given as a parameter into an array and returns this array
    public static int[] toArray(int number) {
        // Set 'stringNumber' to the 'number' parameter converted into a string using the toString method
        String stringNumber = Integer.toString(number);
        // Create a new integer array 'array' with the same length as the number
        int[] array = new int[stringNumber.length()];
        // Start a for loop with index 'i' starting from 0 to the length of 'array', incrementing by one each loop
        for (int i = 0; i < array.length; i++) {
            // Set the current index position of 'array' to the character at the current index position of 'stringNumber' converted into an integer
            array[i] = Character.getNumericValue(stringNumber.charAt(i));
        }
        // Return 'array'
        return array;
    }

    // 'countMatches' method which returns the number of matching digits (those with same value and position) in two integers 'numberA' and 'numberB' given as parameters
    public static int countMatches(int numberA, int numberB) {
        // Set 'arrayA' to 'numberA' converted into an array
        int[] arrayA = toArray(numberA);
        // Set 'arrayB' to 'numberB' converted into an array
        int[] arrayB = toArray(numberB);

        // Set 'matchesCounter' which will represent the number of matching digits initially to 0
        int matchesCounter = 0;

        // Start a for loop with index 'j' starting from 0 to the length of 'arrayA' (which should be the same as 'arrayB'), incrementing by one each loop
        for (int j = 0; j < arrayA.length; j++) {
            // Check if the integer at current index position in 'arrayA' is equal to the integer at current index position in 'arrayB'
            if (arrayA[j] == arrayB[j]) {
                // Increment 'matchesCounter' by one
                matchesCounter++;
            }
        }

        // Return 'matchesCounter'
        return matchesCounter;
    }

    // 'countIntersect' method which returns the quantity of digits that two numbers 'numberA' and 'numberB' given as parameters have in common, regardless of position
    public static int countIntersect(int numberA, int numberB) {
        // Set 'arrayA' to 'numberA' converted into an array
        int[] arrayA = toArray(numberA);
        // Set 'arrayB' to 'numberB' converted into an array
        int[] arrayB = toArray(numberB);

        // Set 'intersectCounter' which will represent the quantity of digits in common initially to 0
        int intersectCounter = 0;

        // Start a for loop with index 'k' starting from 0 to the length of 'arrayA' (which should be the same as 'arrayB'), incrementing by one each loop
        for (int k = 0; k < arrayA.length; k++) {
            // Start a for loop with index 'kb' starting from 0 to the length of 'arrayB', incrementing by one each loop
            for (int kb = 0; kb < arrayB.length; kb++) {
                // Check if the integer at current 'k' index position in 'arrayA' is equal to the integer at current 'kb' index position in 'arrayB'
                if (arrayA[k] == arrayB[kb]) {
                    // Increment 'intersectCounter' by one
                    intersectCounter++;
                }
            }
        }

        // Return 'intersectCounter'
        return intersectCounter;
    }
}
