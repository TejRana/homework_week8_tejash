package javahomeworkweek8_tejash;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class FirstAndLastDigitSum_Q7 {

    public static int sumFirstAndLastDigit(int num) {
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        return firstDigit + lastDigit;
    }
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
         // lastDigit we use % operator
        int lastDigit = number%10;
        int firstDigit = number;
       while (firstDigit>=10){
            firstDigit = firstDigit/10;
        }
        System.out.println("sumFirstAndLastDigit : " + firstDigit);
        System.out.println("sumFirstAndLastDigit : " + lastDigit);
        System.out.println("Total Sum = " + (firstDigit+lastDigit));
    }
}
