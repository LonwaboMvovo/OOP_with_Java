// More Objects and Classes: LongJump
// 16/07/2020
// Lonwabo Mvovo

public class Jump2 {

    // Fields:
    // Declare private double 'jumpDistance' which will represent the distance of the second jump
    private double jumpDistance;
    // Declare private double 'isFoul' which will be used to determine is the second jump was a foul or not
    private boolean isFoul;

    // Constructor:
    public Jump2() {
        // Initialize 'jumpDistance' to '0.0'
        jumpDistance = 0.0;
        // Initialize 'isFoul' to 'false'
        isFoul = false;
    }

    // Setters:
    // Create public method 'setJumpDistance' with parameter 'jumpDistance' which is used to set the distance of the second jump
    public void setJumpDistance(double jumpDistance) {
        // Set the field 'jumpDistance' to the value of the parameter 'jumpDistance'
        this.jumpDistance = jumpDistance;
    }

    // Create public method 'setFoul' which is used to set 'isFoul' to a boolean depending on if the second jump was a foul or not
    public void setFoul() {
        // Set the field 'isFoul' to 'true'
        isFoul = true;
    }

    // Getters:
    // Create public method 'getJumpDistance' which is used to return the distance of the second jump
    public double getJumpDistance() {
        // Return the distance of the second jump
        return jumpDistance;
    }

    // Create public method 'getIsFoul' which is used to determine if the second jump is a foul or not
    public boolean getIsFoul() {
        // Return the value of 'isFoul' which will be true or false depending on if the second jump is a foul or not
        return isFoul;
    }
}
