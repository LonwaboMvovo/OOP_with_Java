// More Objects and Classes: LongJump
// 17/07/2020
// Lonwabo Mvovo

/* A ClockDisplay object is a holder for the current time in hours and minutes. It provides methods for
advancing the current time and for obtaining the value as a formatted string.*/
public class ClockDisplay {

    // Fields:
    // Declare private object 'hours' from the 'CounterDisplay' class
    private CounterDisplay hours;
    // Declare private object 'minutes' from the 'CounterDisplay' class
    private CounterDisplay minutes;

    // Constructor:
    // The 'ClockDisplay' constructor takes two parameters 'pHours' which is what the hour of the new 'ClockDisplay' object should be and 'pMinutes' which is what the minutes of the new 'ClockDisplay' object should be
    public ClockDisplay(int pHours, int pMinutes) {
        // Initialize 'hours' to a new object of the 'CounterDisplay' class giving 24 as an argument since there are only 24 hours in a day (Unless you ate a Bar One #NOTSPONSORED)
        hours = new CounterDisplay(24);
        // Initialize 'minutes' to a new object of the 'CounterDisplay' class giving 60 as an argument since there are only 60 minutes in an hour
        minutes = new CounterDisplay(60);

        // Initially set the counter value of the 'hours' object to the given 'pHours' using the 'setValue' method from the 'CounterDisplay' class
        hours.setValue(pHours);
        // Initially set the counter value of the 'minutes' object to the given 'pMinutes' using the 'setValue' method from the 'CounterDisplay' class
        minutes.setValue(pMinutes);
    }

    // Methods:
    // Create method 'setTime' whit parameters 'pHours' and 'pMinutes' which is used to set the display value to 'pHours' and 'pMinutes'
    public void setTime(int pHours, int pMinutes) {
        // Set the current display value of the hours using the 'setValue' method from the 'CounterDisplay' class
        hours.setValue(pHours);
        // Set the current display value of the minutes using the 'setValue' method from the 'CounterDisplay' class
        minutes.setValue(pMinutes);
    }

    // Create method 'tick' which advances the display time one minute
    public void tick() {
        // Check if the current minutes are equal to 59 because this means that the hour needs to increment as well
        if (minutes.getValue() == 59) {
            // Increment the hour using the 'increment' method from the 'CounterDisplay' class
            hours.increment();
        }
        // Increment the minutes using the 'increment' method from the 'CounterDisplay' class
        minutes.increment();
    }

    // Create method 'getDisplayValue' which returns the display of the time
    public String getDisplayValue() {
        // Return the time formatted correctly with the colon
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
