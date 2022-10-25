package javahomeworkweek8_tejash;

public class Cylinder extends Circle {

    //Instance variable
    public double height;

    //constructor
    public Cylinder(double radius, double h) {
        super(radius);

        if (height < 0) {
            h = 0;
        }else {
        height = h;
    }
    }
    // Instance methods

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return  super.getArea() * getHeight();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius =" + circle.getRadius());
        System.out.println("circle.area =" + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder.radius =" + cylinder.getRadius());
        System.out.println("cylinder.height =" + cylinder.getHeight());
        System.out.println("cylinder.area =" + cylinder.getArea());
        System.out.println("cylinder.Volume =" + cylinder.getVolume());
    }
}