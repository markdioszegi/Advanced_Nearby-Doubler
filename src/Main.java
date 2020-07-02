package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        testNearbyElements(); // testing the first one
        printSeparator(15);
        testDoubler(); // testing the second one
        // System.out.println(Arrays.toString(Matrix.nearby(1, 2, 5)));
    }

    private void testNearbyElements() {
        System.out.println("Testing nearby elements with:");
        for (int[] arr : NearbyElements.multi) {
            System.out.println(Arrays.toString(arr));
        }
        printSeparator(15);

        System.out.println(Arrays.toString(NearbyElements.nearby(0, 2, 2)));
        System.out.println(Arrays.toString(NearbyElements.nearby(1, 0, 1)));
        System.out.println(Arrays.toString(NearbyElements.nearby(1, 3, 5)));
    }

    private void testDoubler() {
        System.out.println("Testing doubler with:");
        int[] numbers = new int[] { 1, 2, 4, 8, 11, 12, 13 };
        int b = 2;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Doubler.doubleResult(b, numbers));
    }

    private void printSeparator(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}