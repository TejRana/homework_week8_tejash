package javahomeworkweek8_tejash;

import java.util.Scanner;

public class MinAndMaxInputChallenge_Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, max, min;
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter another number: ");
        num2 = input.nextInt();
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
        while (num2 != 0) {
            // declared minimum number is 0
            // and maximum as your wish
            System.out.print("Enter a number or 0 to stop: ");
            num2 = input.nextInt();
            if (num2 != 0) {
                max = Math.max(max, num2);
                min = Math.min(min, num2);
            }
        }
        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);
    }
}


