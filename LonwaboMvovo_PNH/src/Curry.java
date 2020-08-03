// More Objects and Classes: Assignment 5: Question 2
// 17/07/2020
// Lonwabo Mvovo

public class Curry extends MenuItem{

    // Fields:
    String curryType;

    // Constructor:
    public Curry(int itemNumber, String size, String curryType) {
        super(itemNumber, size);
        this.curryType = curryType;
    }

    // Method:
    @Override
    public String toString() {
        return super.toString() + ", " + curryType;
    }
}
