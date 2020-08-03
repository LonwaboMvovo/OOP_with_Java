// Objects and Classes: Exercise Two
// 15/07/2020
// Lonwabo Mvovo

// An UberService object represents an Uber service from the point of view of price. (Services differ in characteristics such as luxury and capacity of the vehicle, and consequently, in price)
// Each service has a base fare, a cost per minute, cost per kilometre, and cancellation fee. The cost of a journey consists of the base fare + cost for minutes + cost for distance
public class UberService {

    // UberService Fields / Instance Variables:
    // Declare 'name'
    private String name;
    // Declare 'costPerMin'
    private int costPerMin;
    // Declare 'costPerKM'
    private int costPerKM;
    // Declare 'baseFee'
    private int baseFee;
    // Declare 'cancellationFee'
    private int cancellationFee;

    // UberService Details Setter:
    public void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee) {
        // Set 'name' to 'name' parameter which represents the service name
        this.name = name;
        // Set 'costPerMin' to 'costPerMin' parameter which represents cost per minute of the trip
        this.costPerMin = costPerMin;
        // Set 'costPerKM' to 'costPerKM' parameter which represents cost per kilometre of the trip
        this.costPerKM = costPerKM;
        // Set 'baseFee' to 'baseFee' parameter which represents base fare of the trip
        this.baseFee = baseFee;
        // Set 'cancellationFee' to 'cancellationFee' parameter which represents the cancellation fee of the trip
        this.cancellationFee = cancellationFee;
    }

    // Name getter:
    public String getName() {
        return name;
    }

    // Name setter:
    public void setName(String name) {
        this.name = name;
    }

    // CostPerMin getter:
    public int getCostPerMinute() {
        return costPerMin;
    }

    // CostPerMin setter:
    public void setCostPerMinute(int cents) {
        costPerMin = cents;
    }

    // CostPerKM getter:
    public int getCostPerKilometre() {
        return costPerKM;
    }

    // CostPerKM setter:
    public void setCostPerKilometre(int cents) {
        costPerKM = cents;
    }

    // BaseFee getter:
    public int getBaseFare() {
        return baseFee;
    }

    // BaseFee setter:
    public void setBaseFare(int cents) {
        baseFee = cents;
    }

    // CancellationFee getter:
    public int getCancellationFee() {
        return cancellationFee;
    }

    // CancellationFee setter:
    public void setCancellationFee(int n) {
        cancellationFee = n;
    }

    // Calculate Fare method:
    public double calculateFare(double minutes, double distance) {
        // Return the journey cost which consists of the the base fare + cost for the time + cost for the distance
        return baseFee + (costPerMin * minutes) + (costPerKM * distance);
    }
}
