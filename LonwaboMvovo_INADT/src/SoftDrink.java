// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// 'SoftDrink' class for soft drink objects each have a colour (of the can), name and volume.
public class SoftDrink {

    // Fields:
    // Declare 'name' which represents the name of the brand name of the soft drink
    String name;
    // Declare 'colour' which represents the colour of the soft drink can
    String colour;
    // Declare 'volume' which represents teh volume the soft drink can can withhold
    int volume;

    // Constructor:
    // 'SoftDrink' constructor that takes 3 parameters: 'name', 'colour' and 'volume'
    public SoftDrink(String name, String colour, int volume) {
        // Set the field 'name' to the value of the parameter 'name'
        this.name = name;
        // Set the field 'colour' to the value of the parameter 'colour'
        this.colour = colour;
        // Set the field 'volume' to the value of the parameter 'volume'
        this.volume = volume;
    }

    // Method:
    // Overrode method 'toString' which prints a message for when an object is printed
    @ Override
    public String toString() {
        // Return message with the 'name', 'colour' and 'volume'
        return name + " " + colour + " " + volume;
    }

    // Getters:
    // 'name' getter
    public String getName() {
        return name;
    }

    // 'colour' getter
    public String getColour() {
        return colour;
    }

    // 'volume' getter
    public int getVolume() {
        return volume;
    }
}
