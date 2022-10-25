package javahomeworkweek8_tejash;

import java.util.Scanner;

public class ReadingUserInputChallenge_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        while (i < 10) {
            System.out.println("Please enter a number: ");
            int i1 = input.nextInt();
            i++;

            sum = sum + i;
            i = i + 0;
        }
        System.out.println("The total sum is " + sum);

    }
}


