// More Objects and Classes: LongJump
// 17/07/2020
// Lonwabo Mvovo

/* A CounterDisplay object is a counter that cycles over a fixed range. It contains a current value and an upper
limit, and it provides methods for setting the current value, advancing it, examining it, and obtaining it in
the form of a 2 digit String.
*/
public class CounterDisplay {

    // Fields:
    // Declare private int 'value' which will represent the current value of the item being counted
    private int value;
    // Declare private int 'limit' which will represent the limit that the counter should count to for the item being counted
    private int limit;

    // Constructor:
    // The 'CounterDisplay' constructor takes one parameter 'pLimit' which is what 'limit' will be set to
    public  CounterDisplay(int pLimit) {
        // Initially set 'value' to 0
        value = 0;
        // Initially set 'limit' to 'pLimit'
        limit = pLimit;
    }

    // Methods:
    // Create method 'setValue' with parameter 'pValue' which sets the current counter value to 'pValue'
    public void setValue(int pValue) {
        // Update 'value' to 'pValue'
        value = pValue;
    }

    // Create method 'getValue' which returns the current counter value
    public int getValue() {
        return value;
    }

    // Create method 'increment' which advances the counter by 1, rolling over to 0 if the limit is reached
    public void increment() {
        // Increment the value by 1
        value++;
        // Check if the limit has been reached
        if (value == limit) {
            // Set 'value' to 0
            value = 0;
        }
    }

    // Create method 'getDisplayValue' which returns the display value in the form of a 2 digit string
    public String getDisplayValue() {
        // Return the display value in the form of a 2 digit string
        return String.format("%02d", value);
    }
}
