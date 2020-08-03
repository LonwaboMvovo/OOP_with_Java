// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// 'Cat' class which implements the 'MakesSound' interface
public class Cat implements MakesSound {

    // Field:
    // Declare 'sound' which will represent the sound that cats make
    private String sound;

    // Constructor:
    // 'Cat' constructor which takes no parameters
    public Cat() {
        // Set the field 'sound' to the given sound that cats make
        sound = "Meeow";
    }

    // Method:
    // Overrode method 'makeNoise' which returns the sound a cat makes
    @Override
    public String makeNoise() {
        // Return the cats sound
        return sound;
    }
}
