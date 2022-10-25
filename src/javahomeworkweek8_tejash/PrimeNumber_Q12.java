package javahomeworkweek8_tejash;

import java.util.Scanner;

public class PrimeNumber_Q12 {


    public static void main(String[] args) {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " Is a Prime Number");
        else
            System.out.println(num + " Is not a Prime Number");
    }

}

