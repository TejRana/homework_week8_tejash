package javahomeworkweek8_tejash;

public class Rectangle {
    // Instance variable
    private double width;
    private double length;

    //Constructor
    public Rectangle( double width , double length){
        if (width < 0){
            width = 0;
        }
        if (length < 0){
            length = 0;
        }
        this.width = width;
        this.length = length;
    }
    //Instance Methods
    public double getArea(){
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
