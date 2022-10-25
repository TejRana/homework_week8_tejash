package javahomeworkweek8_tejash;

import java.util.Scanner;

public class AngleTriangle_Q15 {


        private static final int row = 5;

        public static void main(String... strings) {
        LeftAngleTriangle();
        System.out.println();
        }
        // Pattern will be
        // *
        // **
        // ***
        public static void LeftAngleTriangle() {
        for (int y = 1; y <= row; y++) {
            for (int x = 1; x <= y; x++)
                System.out.print("*");
            System.out.println();
        }
    }
}
