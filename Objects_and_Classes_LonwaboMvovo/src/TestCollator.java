// Objects and Classes: Exercise Three
// 15/07/2020
// Lonwabo Mvovo

public class TestCollator {

    public static void main(String[] args) {

        // Check Collator constructor and observers
        // Test 1: Check label() - so that it returns the given label
        System.out.println("Test 1");
        Collator collator = new Collator("Horizon table top collator");
        if (collator.label().equals("Horizon table top collator")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 2: Check numberOfReadings() - so that it returns 0 since the constructor should initially set this value to 0
        System.out.println("Test 2");
        if (collator.numberOfReadings() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 3: Check maximum() - so that it returns 0 since the constructor should initially set this value to 0
        System.out.println("Test 3");
        if (collator.maximum() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 4: Check minimum() - so that it returns 0 since the constructor should initially set this value to 0
        System.out.println("Test 4");
        if (collator.minimum() == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Check label(label)
        // Test 5: Check label(label) - so that it changes the collator's label
        System.out.println("Test 5");
        collator.label("Ultimate Horizon TT-collator");
        if (collator.label().equals("Ultimate Horizon TT-collator")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Check recordReading(reading) and observers
        // Test 6: Check recordReading(reading) - so that it updates the record due to the given reading
        System.out.println("Test 6");
        collator.recordReading(44);
        if (collator.numberOfReadings() == 1
            && collator.maximum() == 44
            && collator.minimum() == 44) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Check getMethods do not change anything.
        // Test 7: Check numberOfReading()
        System.out.println("Test 7");
        collator.recordReading(2);
        if (collator.numberOfReadings() == collator.numberOfReadings()
                && collator.maximum() == 44
                && collator.minimum() == 2) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 8: Check maximum()
        System.out.println("Test 8");
        collator.recordReading(16);
        if (collator.maximum() == collator.maximum()
                && collator.numberOfReadings() == 3
                && collator.minimum() == 2) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Test 9: Check minimum()
        System.out.println("Test 9");
        collator.recordReading(420);
        if (collator.minimum() == collator.minimum()
                && collator.numberOfReadings() == 4
                && collator.maximum() == 420) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Check average()
        // Test 10: Check average() - so that it correctly calculates and returns the average within a set tolerance
        System.out.println("Test 10");

        double EPSILON = 0.0000001;

        if (Math.abs(collator.average()-120.5)<EPSILON) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        // Test 11: Check average() - so that it only calculates and returns the average
        System.out.println("Test 10");
        collator.recordReading(84);

        if (Math.abs(collator.average()-collator.average())<EPSILON
            && collator.numberOfReadings() == 5
            && collator.maximum() == 420
            && collator.minimum() == 2) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
