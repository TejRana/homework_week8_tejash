package javahomeworkweek8_tejash;

import java.util.Scanner;

public class Triangle_Q6 {
    public static void main(String[] args) {
        // creat scanner class to declare row
        Scanner obj = new Scanner(System.in);
        int row;
        System.out.println("Enter size of Triangle : ");
        row = obj.nextInt(); // object
         for (int i = 1 ; i <= row ; i++){ // declare value of row
             for (int a = 1 ; a <=  i ; a++){ //column
                 System.out.print(a); // to print in separate row to make triangle
             }
             System.out.println();
         }
    }
}
