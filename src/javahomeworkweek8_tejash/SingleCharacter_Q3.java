package javahomeworkweek8_tejash;

import java.util.Scanner;

public class SingleCharacter_Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter single character from the alphabet: ");
        String letter = scan.next();


        if (!letter.matches("[A-Za-z]")) {
            System.out.println("Error");
        } else {
            letter = letter.toLowerCase();
            if (letter.matches("[letter]")) {
                System.out.println("Vowel of Consonant");
            } else {
                System.out.println(" Input letter is Consonant");
            }
        }
    }
}
