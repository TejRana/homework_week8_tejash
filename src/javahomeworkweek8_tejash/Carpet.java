package javahomeworkweek8_tejash;

public class Carpet {
    // Instance variable
    private double cost;

    // constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // instance method
    public double getCost() {
        return this.cost;
    }
}