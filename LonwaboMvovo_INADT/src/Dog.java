// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// 'Dog' class which implements the 'MakesSound' interface
public class Dog implements MakesSound {

    // Field:
    // Declare 'sound' which will represent the sound that dogs make
    private String sound;

    // Constructor:
    // 'Dog' constructor which takes no parameters
    public Dog() {
        // Set the field 'sound' to the given sound that dogs make
        sound = "Woof!";
    }

    // Method:
    // Overrode method 'makeNoise' which returns the sound a dog makes
    @Override
    public String makeNoise() {
        // Return the dogs sound
        return sound;
    }
}
