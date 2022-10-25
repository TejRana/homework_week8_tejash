package javahomeworkweek8_tejash;

public class SimpleCalculator {
    // variable
    private double firstNumber;
    private double secondNumber;

    //Getters
    public double getFirstNumber (){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }
    public double getSubtractionResult(){
        double result = getFirstNumber() - getSecondNumber();
        return result;
    }
    public double getMultiplicationResult(){
        double result = getFirstNumber() * getSecondNumber();
        return result;
    }
    public double getDivisionResult(){
        double result = getFirstNumber() / getSecondNumber();

        // cant divided 0
        if (secondNumber == 0 || firstNumber == 0){
            return 0;
        }
        return getSecondNumber() / getFirstNumber();
    }

    // Setters

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("divided = " + simpleCalculator.getDivisionResult());
    }
}
