// More Objects and Classes: LongJump
// 16/07/2020
// Lonwabo Mvovo

// A JumpRecord records the jumps attempted by an athlete in a long jump competition. In a long jump competition, the
// athlete sprints along a 'runway' and jumps as far as possible form a 'take-off' board at its end.
// An athlete is permitted three jumps. A foul is committed if an athlete steps beyond the take-off board.
public class JumpRecord {

    // Fields:
    // Declare private object from Jump1 class
    private Jump1 jump1;
    // Declare private object from Jump2 class
    private Jump2 jump2;
    // Declare private object from Jump3 class
    private Jump3 jump3;
    // Declare private double 'longestJump' which will represent the value of the longest jump
    private double longestJump;
    // Declare private int 'totalJumps' which will represent the number of jumps that the athlete has made
    private int totalJumps;
    // Declare private int 'totalJumps' which will represent the number of foul jumps that the athlete has made
    private int foulJumps;

    // Constructor:
    public JumpRecord() {
        // Initialize 'jump1' to a new object of the 'Jump1' class
        jump1 = new Jump1();
        // Initialize 'jump2' to a new object of the 'Jump2' class
        jump2 = new Jump2();
        // Initialize 'jump3' to a new object of the 'Jump3' class
        jump3 = new Jump3();
        // Initialize the distance of the longest jump to '0.0'
        longestJump = 0.0;
        // Initialize the number of jumps the athlete has done to '0'
        totalJumps = 0;
        // Initialize the number of foul jumps the athlete has done to '0'
        foulJumps = 0;
    }

    // Methods:
    // Create public method 'recordJump' with parameter 'distance' which updates record with jump of the given distance
    public void recordJump(double distance) {
        // Switch statement with 'totalJumps' as the expression
        switch (totalJumps) {
            // If 'totalJumps' is equal to 0
            case 0:
                // Using the 'jump1' object and its setter, set the distance given to its distance
                jump1.setJumpDistance(distance);
                // Since this is the first jump to take place, set 'longestJump' to the value of the distance given
                longestJump = distance;
                // Increment the number of 'totalJumps' by 1
                totalJumps++;
                // Break from the switch statement
                break;
            // If 'totalJumps' is equal to 1
            case 1:
                // Using the 'jump2' object and its setter, set the distance given to its distance
                jump2.setJumpDistance(distance);
                // If the distance given is greater than the 'longestJump', set 'longestJump' to the value of the distance given
                if (distance > longestJump) {
                    longestJump = distance;
                }
                // Increment the number of 'totalJumps' by 1
                totalJumps++;
                // Break from the switch statement
                break;
            // If 'totalJumps' is equal to any other integer which should be 3 if the assumptions are met
            default:
                // Using the 'jump3' object and its setter, set the distance given to its distance
                jump3.setJumpDistance(distance);
                // If the distance given is greater than the 'longestJump', set 'longestJump' to the value of the distance given
                if (distance > longestJump) {
                    longestJump = distance;
                }
                // Increment the number of 'totalJumps' by 1
                totalJumps++;
                // Break from the switch statement
                break;
        }
    }

    // Create method 'recordFoulJump' which is used to record the latest jump as a foul
    public void recordFoulJump() {
        // Start a switch statement with 'totalJumps' as the expression
        switch (totalJumps) {
            // If 'totalJumps is equal to 1
            case 1:
                // Using the 'jump1' object call method 'setFoul' to set the first jump as a foul
                jump1.setFoul();
                // Break from the switch statement
                break;
            // If 'totalJumps is equal to 2
            case 2:
                // Using the 'jump2' object call method 'setFoul' to set the second jump as a foul
                jump2.setFoul();
                // Break from the switch statement
                break;
            // If 'totalJumps is equal to any other integer which should be 3 if the assumptions are met
            default:
                // Using the 'jump3' object call method 'setFoul' to set the third jump as a foul
                jump3.setFoul();
                // Break from the switch statement
                break;
        }
        // Increment the number of 'foulJumps' by 1
        foulJumps++;
    }

    // Create method 'jumps' which when called returns the number of jumps recorded so far
    public int jumps() {
        return totalJumps;
    }

    // Create method 'finished' which when called returns a boolean determining whether jumps == maxJumps() meaning that the athlete has completed all three of their jumps
    public boolean finished() {
        // Check if 'totalJumps' is equal to the value returned by calling 'maxJumps' and return the outcome of that expression
        return totalJumps == maxJumps();
    }

    // Create method 'maxJumps' which unlike other methods in this class is private because it only needs to accessed within the class. This method returns the number of jumps the athlete is permitted
    private int maxJumps() {
        return 3;
    }

    // Create method 'foulJumps' which returns the number of foul jumps committed by the athlete so far
    public int foulJumps() {
        return foulJumps;
    }

    // Create method 'isFoulJump' with parameter 'n' which is used to determine whether jump 'n' is a foul jump
    public boolean isFoulJump(int n) {
        // Start a switch statement with 'n' as the expression
        switch (n) {
            // If n is equal to 1
            case 1:
                // Using the 'jump1' object call method 'getIsFoul' to return value of that boolean representing if the first jump was a foul
                return jump1.getIsFoul();
            // If n is equal to 2
            case 2:
                // Using the 'jump2' object call method 'getIsFoul' to return value of that boolean representing if the second jump was a foul
                return jump2.getIsFoul();
            // If n is equal to any other integer which should be 3 is assumptions are met
            default:
                // Using the 'jump3' object call method 'getIsFoul' to return value of that boolean representing if the third jump was a foul
                return jump3.getIsFoul();

        }
    }

    // Create method 'getJumpDistance' with parameter 'n' which is used to return the distance achieved for jump number 'n'
    public double getJumpDistance(int n) {
        // Start a switch statement with 'n' as the expression
        switch (n) {
            // If 'n' is equal to 1
            case 1:
                // Using the 'jump1' object call method 'getJumpDistance' to return the distance achieved for the first jump
                return jump1.getJumpDistance();
            // If 'n' is equal to 2
            case 2:
                // Using the 'jump2' object call method 'getJumpDistance' to return the distance achieved for the second jump
                return jump2.getJumpDistance();
            // If 'n' is equal to any other integer which should be 3 if assumptions are met
            default:
                // Using the 'jump3' object call method 'getJumpDistance' to return the distance achieved for the third jump
                return jump3.getJumpDistance();
        }
    }

    // Create method 'getLongest' which is used to return the number of the longest jump achieved by the athlete so far
    public int getLongest() {
        // Check if 'longestJump' is equal to the first jump
        if (longestJump == jump1.getJumpDistance()) {
            return 1;
        // Otherwise check if 'longestJump' is equal to the first jump
        } else if (longestJump == jump2.getJumpDistance()) {
            return 2;
        // Otherwise this should mean that the third jump was the longest
        } else {
            return 3;
        }
    }
}
