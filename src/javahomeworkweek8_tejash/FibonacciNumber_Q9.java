package javahomeworkweek8_tejash;

public class FibonacciNumber_Q9 {

    public static void main(String[] args) {
        // declared int fibonacci value upto 20
        int n = 20, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
