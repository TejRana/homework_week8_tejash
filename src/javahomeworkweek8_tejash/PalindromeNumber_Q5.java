package javahomeworkweek8_tejash;

import java.util.Scanner;

public class PalindromeNumber_Q5 {


    public static void main(String[] args) {

        System.out.println("Please enter an Number : ");
        int input = new Scanner(System.in).nextInt();
        if (isPalindrome(input)){
            System.out.println("Number : " + input + " is a Palindrome");
        }
        else {
            System.out.println("Number : " + input + " is not a Palindrome ");
        }
    }

    public static int reverse(int number) {
        // missing return?
        int a;
        int b;
        for (a = 0; a <= number; a++) {
            // parameters
            a = number % 10; // remainder
            number = number / 10; // get rid of last digit
            b = a * 10 + a; // sets reverse value
           // return a; // returns reversed number

        }
        return a;
    }
    public static boolean isPalindrome(int number) {
        int input  = (number); // copied number into a variable
        int reverse = 0;

        while (input != 0){
            int remainder = input % 10;
            reverse = reverse * 10 + remainder;
            input = input / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}