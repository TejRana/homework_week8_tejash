package javahomeworkweek8_tejash;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
       Carpet carpet = new Carpet(3.5);
       Floor_Q17 floor_q17 = new Floor_Q17(2.75,4.0);
       Calculator calculator = new Calculator(floor_q17,carpet);
       System.out.println("total = " + calculator.getTotalCost());
       carpet = new Carpet(1.5);
       floor_q17 = new Floor_Q17(5.4,4.5);
       calculator = new Calculator(floor_q17,carpet);
        System.out.println("total = " + calculator.getTotalCost());
    }
}
