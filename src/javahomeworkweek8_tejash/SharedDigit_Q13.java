package javahomeworkweek8_tejash;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SharedDigit_Q13 {

    public static void main(String[] args) {

            SharedDigit_Q13 obj = new SharedDigit_Q13();
            System.out.println(obj.hasShareDigits(12, 23));
    }
    private boolean hasShareDigits(int n1, int n2) {
        String n1String = Integer.toString(n1);
        String n2String = Integer.toString(n2);
        if (n1String.concat(n2String).contains("-")) {
            return false;
        }  // Return false for negative numbers, being out-of-range 10-99.
        if
        (
                (n1String.length() == 2)
                        &&
                        (n2String.length() == 2)
        ) {
            Set<Integer> n1CodePoints = n1String.codePoints().boxed().collect(Collectors.toSet());
            Set<Integer> n2CodePoints = n2String.codePoints().boxed().collect(Collectors.toSet());
            n1CodePoints.retainAll(n2CodePoints);
            boolean sharesDigit = (n1CodePoints.size() > 0);
            return sharesDigit;
        } else {
            return false;
        }
    }

}
