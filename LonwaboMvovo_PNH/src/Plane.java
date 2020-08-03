// More Objects and Classes: Assignment 5: Question 1
// 17/07/2020
// Lonwabo Mvovo

// Plane class which is a subclass of the 'Vehicle' class
public class Plane extends Vehicle{

    // Field:
    // Declare string 'manufacturer' which represents the manufacturer of the plane
    private String manufacturer;
    // Declare int 'modelNumber' which represents the model number of the plane
    private int modelNumber;

    // Constructor:
    // The Plane constructor takes four parameters 'colour', 'passengers', 'manufacturer' and 'modelNumber'
    public Plane(String colour, int passengers, String manufacturer, int modelNumber) {
        // Super statement calls the super class's constructor with 'colour' and 'passengers' set as the arguments
        super(passengers, colour);
        // Set the field 'manufacturer' to the parameter 'manufacturer'
        this.manufacturer = manufacturer;
        // Set the field 'modelNumber' to the parameter 'modelNumber'
        this.modelNumber = modelNumber;
    }

    // Method:
    // Override the method 'info'
    @Override
    public String toString() {
        // Return Plane message
        return super.toString() + " " + manufacturer + " " + modelNumber;
    }
}
