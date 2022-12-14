package javahomeworkweek8_tejash;

import java.util.Scanner;

public class DigitSumChallenge_Q4 {
    public static int sumDigits(final int a) {
        int sum = 0;
        int b = a;
        do {
            sum += b % 10;
            b = b / 10;
        } while (b > 0);
        if (sum >= 10) {
            return sumDigits(sum);
        }
        return sum;
    }
    public static void main(final String[] args) {
        double sumDigit;
        int integer;

        try (final Scanner in = new Scanner(System.in)) {
            System.out.print("Enter integer number : ");
            integer = in.nextInt();
            sumDigit = sumDigits(integer);
            System.out.println("The sum of the digit is: " + sumDigit);
        }
    }
}

