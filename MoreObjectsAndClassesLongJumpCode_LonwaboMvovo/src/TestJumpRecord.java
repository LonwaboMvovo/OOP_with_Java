// More Objects and Classes: LongJump
// 16/07/2020
// Lonwabo Mvovo

public class TestJumpRecord {

    public static void main(String[] args) {

        // Check JumpRecord constructor and observers
        JumpRecord jumpRecord = new JumpRecord();
        // Test 1: Check jumps() so that it returns 0 since the constructor should initially set the number of jumps to 0
        System.out.println("Test 1");
        if (jumpRecord.jumps() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 2: Check finished() and maxJump() so that it returns false since the number of jumps should not have reached the maximum yet
        System.out.println("Test 2");
        if (!jumpRecord.finished()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 3: Check foulJumps() so that it returns 0 since the constructor should initially set the number of foul jumps to 0
        System.out.println("Test 3");
        if (jumpRecord.foulJumps() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 4: Check getLongest() so that it returns 1 since the constructor should initially set the longest jump to 0.0 but the first jumps is also initially set to 0.0 so the first outcome shoule be true
        System.out.println("Test 4");
        if (jumpRecord.getLongest() == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 5: Check recordJump(double distance) - so that it records a jump distance depending on the jump
        // and Check jumps() - so that it returns the correct number of jumps given
        System.out.println("Test 5");
        jumpRecord.recordJump(16.5);
        if (jumpRecord.jumps() == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 6: Check finished() so that it returns false since the number of jumps should not have reached the maximum yet after only 1 jump
        System.out.println("Test 6");
        if (!jumpRecord.finished()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 7: Check foulJumps() so that it returns 0 since the first jump has not been recorded as a foul jump
        System.out.println("Test 7");
        if (jumpRecord.foulJumps() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 8: Check isFoulJump(1) so that it returns false since the first jump has not been recorded as a foul jump
        System.out.println("Test 8");
        if (!jumpRecord.isFoulJump(1)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 9: Check getJumpDistance(1) so that it return the given jump distance for the first jump
        System.out.println("Test 9");
        if (jumpRecord.getJumpDistance(1) == 16.5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 10: Check getLongest() so that it returns 1 since the first jump is the only jump recorded making it the longest
        System.out.println("Test 10");
        if (jumpRecord.getLongest() == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Check recordFoulJump() and observers
        // Test 11: Check foulJumps() so that it returns 1 after the second jump was recorded as a foul
        System.out.println("Test 11");
        jumpRecord.recordJump(13.3);
        jumpRecord.recordFoulJump();
        if (jumpRecord.foulJumps() == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 12: Check isFoulJump(2) so that it returns true since the second jump was recorded as a foul
        System.out.println("Test 12");
        if (jumpRecord.isFoulJump(2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 13: Check finished() so that when 3 jumps are recorded it returns true
        System.out.println("Test 13");
        jumpRecord.recordJump(16.3);
        if (jumpRecord.finished()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 14: Check getLongest() so that it returns 1 since the first jump is still the longest
        System.out.println("Test 14");
        if (jumpRecord.getLongest() == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
