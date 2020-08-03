// More Objects and Classes: Assignment 5: Question 1
// 17/07/2020
// Lonwabo Mvovo

// Car class which is a subclass of the 'Vehicle' class
public class Car extends Vehicle{

    // Field:
    // Declare private int 'doors' which represents the amount of doors on the car
    private int doors;

    // Constructor:
    // The Car constructor takes 3 parameters 'colour', 'passengers' and 'doors'
    public Car(String colour, int passengers, int doors) {
        // Super statement calls the super class's constructor with 'colour' and 'passengers' set as the arguments
        super(passengers, colour);
        // Set field 'door' to the parameter 'door'
        this.doors = doors;
    }

    // Method:
    // Override the method 'toString'
    @Override
    public String toString() {
        // Return car message
        return super.toString() + " " + doors + " doors";
    }
}
