package javahomeworkweek8_tejash;

public class Calculator {

    // Instance variable
    private Floor_Q17 floor_q17;
    private Carpet carpet;
    // Constructor
    public Calculator (Floor_Q17 f ,Carpet c ){
        this.floor_q17 = f;
        this.carpet = c;
    }
    // Instance method
    public double getTotalCost(){
        return  floor_q17.getArea() * carpet.getCost();
    }



}
