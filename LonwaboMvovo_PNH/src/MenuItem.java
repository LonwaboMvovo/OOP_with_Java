// More Objects and Classes: Assignment 5: Question 2
// 17/07/2020
// Lonwabo Mvovo

public class MenuItem {

    // Fields:
    private int itemNumber;
    private String size;

    // Constructor:
    public MenuItem(int itemNumber, String size) {
        this.itemNumber = itemNumber;
        this.size = size;
    }

    // Methods:
    @Override
    public String toString() {
        return this.getClass().getName() + ": " + itemNumber + ", " + size;
    }

    public int getItemNumber() {
        return itemNumber;
    }
}
