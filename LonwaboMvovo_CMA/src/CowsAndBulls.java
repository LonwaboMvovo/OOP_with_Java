// Class Members and Arrays: Question 1
// 21/07/2020
// Lonwabo Mvovo

public class CowsAndBulls {

    // Fields:
    // Set 'NUM_DIGITS' which represents the number of digits the mystery number should have to 4
    public final static int NUM_DIGITS = 4;
    // Set 'MAX_VALUE' which represents the maximum value that the mystery number can be to 9876
    public final static int MAX_VALUE = 9876;
    // Set 'MIN_VALUE' which represents the minimum value that the mystery number can be to 1234
    public final static int MIN_VALUE = 1234;
    // Set 'MAX_GUESSES' which represents the number of guesses the user has to guess the mystery number to 10
    public final static int MAX_GUESSES = 10;
    // Declare 'guessesLeft' which represents the number of guesses the user has left to guess the mystery number
    private int guessesLeft;
    // Declare 'mysteryNumber' which represents the mystery number that the user has to guess
    private int mysteryNumber;
    // Declare 'result' object from Result class which will represent the user's current result in the game
    private Result result;

    // Constructor:
    // 'CowsAndBulls' constructor which takes parameter 'seed'
    public CowsAndBulls(int seed) {
        // Create a new 'NumberPicker' object by calling the 'NumberPicker' constructor with arguments 'seed', 1 as the min and 9 as the max
        NumberPicker numberPicker = new NumberPicker(seed, 1, 9);
        // Set 'guessesLeft' initially to 'MAX_GUESSES'
        guessesLeft = MAX_GUESSES;
        // Set a boolean 'mysteryNumberFound' which represents if a mystery number for the game has been found or not initially to false
        boolean mysteryNumberFound = false;
        // Start a for loop with index 'i' starting from 0 incrementing by one if the conditions that 'i' is less that 3 and that the numberPicker object method hasNext returns true are met
        for (int i = 0; (i < 3) && (numberPicker.hasNext()); i++) {
            // Add a digit from the 'numberPicker' object by calling the nextInt method
            mysteryNumber += numberPicker.nextInt();
            // Multiply 'mysteryNumber' by 10 to create space for another integer
            mysteryNumber *= 10;
        }
        // Check that the numberPicker object method hasNext returns true at least one more time to insure that there is another integer to add
        if (numberPicker.hasNext()) {
            // Add a digit from the 'numberPicker' object by calling the nextInt method
            mysteryNumber += numberPicker.nextInt();
        }
        // Create a new integer array 'mysteryNumberArray' and set it to the 'mysteryNumber' converted to an array by calling the toArray method from the 'NumberUtils' class
        int[] mysteryNumberArray = NumberUtils.toArray(mysteryNumber);
        // Check if the 'mysteryNumber' is greater than or equal to the minimum value it can be and
        if (mysteryNumber >= MIN_VALUE &&
                // check if the 'mysteryNumber' is lower than or equal to the maximum value it can be and
                mysteryNumber <= MAX_VALUE &&
                // check if the 'mysteryNumber' contains the correct number of digits and
                (mysteryNumberArray.length == NUM_DIGITS) &&
                // check if the 'mysteryNumber' contains no repeat digits
                (NumberUtils.countMatches(mysteryNumber, mysteryNumber) == 4) && (NumberUtils.countIntersect(mysteryNumber, mysteryNumber) == 4)) {
            // update 'mysteryNumberFound' to true
            mysteryNumberFound = true;
            // Start a for loop with index 'i' starting from 0, incrementing by one if the condition that 'i' is less than the length of the 'mysteryNumberArray'
            for (int i = 0; i < mysteryNumberArray.length; i++) {
                // Check if the number at the current index position in 'mysteryNumberArray' is equal to 0
                if (mysteryNumberArray[i] == 0) {
                    // update 'mysteryNumberFound' to false because the 'mysteryNumber' should not contain any zeros
                    mysteryNumberFound = false;
                }
            }
        }
        // Check if the mystery number is not found
        if (!mysteryNumberFound) {
            // Print out an error message for finding the mystery number
            System.out.println("No Valid 4 digit mystery number exists within the given range of numbers");
            // End the game
            giveUp();
        }
    }

    // Methods:
    // Public method 'guessesRemaining' which returns an integer of the number of guesses remaining for the user
    public int guessesRemaining() {
        return guessesLeft;
    }

    // Public method 'guess' which evaluates a guess that the mystery number is 'guessNumber', returning the outcome in the form of a Result object and decrements the guesses remaining for the user
    public Result guess(int guessNumber) {
        // Set 'bulls' to the number of bulls the user has by calling the 'countMatches' method from the 'NumberUtils' class with 'mysteryNumber' and 'guessNumber' given as parameters
        int bulls = NumberUtils.countMatches(mysteryNumber, guessNumber);
        // Set 'cows' to the number of cows the user has by calling the 'countIntersect' method from the 'NumberUtils' class with 'mysteryNumber' and 'guessNumber' given as parameters
        int cows = NumberUtils.countIntersect(mysteryNumber, guessNumber) - bulls;
        // Set 'result' to a new instance of the 'Result' class with 'cows' and 'bulls' given as parameters
        result = new Result(cows,bulls);
        // Decrement the guesses remaining for the user
        guessesLeft--;
        // Return result
        return result;
    }

    // Public method 'giveUp' which ends the game and returns the mystery number
    public int giveUp() {
        // Set the number of guesses left to 0
        guessesLeft = 0;
        // Return the mystery number
        return mysteryNumber;
    }

    // Public method 'gameOver' which returns true if the secret number has been guessed or there are no more guesses otherwise it returns false
    public boolean gameOver() {
        // Check if an instance of 'result' has been created
        if (result != null) {
            // Check if the user got the correct number of cows and bulls or
            if (result.equals(new Result(0, 4)) ||
                    // check if there are no more guesses
                    (guessesRemaining() == 0)
            ) {
                return true;
            }
        }
        return false;
    }
}
