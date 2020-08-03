// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// 'Cow' class which implements the 'MakesSound' interface
public class Cow implements MakesSound {

    // Field:
    // Declare 'sound' which will represent the sound that cows make
    private String sound;

    // Constructor:
    // 'Cow' constructor which takes no parameters
    public Cow() {
        // Set the field 'sound' to the given sound that cows make
        sound = "Moo!";
    }

    // Method:
    // Overrode method 'makeNoise' which returns the sound a cow makes
    @Override
    public String makeNoise() {
        // Return the cows sound
        return sound;
    }
}
