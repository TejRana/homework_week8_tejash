package javahomeworkweek8_tejash;

import static java.lang.Math.PI;

public class Circle {
    // Instance variable
    private double radius;

    // Constructor
    public Circle (double r){
        if ((r<0)){
            r = 0;
        }
        radius = r;
    }
    // instance method

    public double getRadius() {
        return radius;

    }
    public double getArea(){
        return  (radius * radius * PI);
    }
}
