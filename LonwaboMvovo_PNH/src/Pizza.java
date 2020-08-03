// More Objects and Classes: Assignment 5: Question 2
// 17/07/2020
// Lonwabo Mvovo

public class Pizza extends MenuItem{

    // Fields:
    String base;
    String extraCheese;
    String extraGarlic;

    // Constructor:
    public Pizza(int itemNumber, String size, String base, String extraCheese, String extraGarlic) {
        super(itemNumber, size);
        this.base = base;
        this.extraCheese = extraCheese;
        this.extraGarlic = extraGarlic;
    }

    // Methods:
    @Override
    public String toString() {
        return super.toString() + ", " + base + ", " + extraCheese + ", " + extraGarlic;
    }


}
