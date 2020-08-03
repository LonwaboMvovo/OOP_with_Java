// More Objects and Classes: Assignment 5: Question 2
// 17/07/2020
// Lonwabo Mvovo

public class SoftDrink extends MenuItem{

    // Fields:
    String flavour;
    String bottleOrCan;

    // Constructor:
    public SoftDrink(int itemNumber, String size, String flavour, String bottleOrCan) {
        super(itemNumber, size);
        this.flavour = flavour;
        this.bottleOrCan = bottleOrCan;
    }

    // Method:
    @Override
    public String toString() {
        return super.toString() + ", " + flavour + ", " + bottleOrCan;
    }
}
