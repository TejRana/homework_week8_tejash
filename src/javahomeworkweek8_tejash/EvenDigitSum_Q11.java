package javahomeworkweek8_tejash;

import java.util.Scanner;

public class EvenDigitSum_Q11 {

    public static int getEvenDigitSum(int number) {
        int sum, lastDigit;
        for(sum=0; number!=0; number/=10){
            lastDigit = number%10;
            if(lastDigit % 2 == 0)
                sum += lastDigit;
        }
        return sum;
    }


    public static void main(String[] args) {

        // declare variables
        int number = 0;
        int sumOfEvenDigits = 0;

        // create Scanner class object
        // for reading the values
        Scanner scan = new Scanner(System.in);

        // read inputs
        System.out.print("Enter an integer number: ");
        number = scan.nextInt();

        // find sum of digits of number
        sumOfEvenDigits = getEvenDigitSum(number);

        // display result
        System.out.println("The sum of even digits of" +
                " the number " + number + " = " + sumOfEvenDigits);

        // close Scanner class object
        scan.close();
    }
}



