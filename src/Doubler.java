package src;

//import java.util.Arrays;

public class Doubler {
    public static int doubleResult(int b, final int[] numbers) {
        if (numbers != null) {
            // Arrays.sort(numbers);
            sortAsc(numbers);
            for (int i = 0; i < numbers.length; i++) {
                if (b == numbers[i]) {
                    b *= 2;
                }
            }
        }
        return b;
    }

    /**
     * Sorts an array of numbers in ascending order
     * 
     * @param numbers
     * @return sorted array in ascending order
     */
    public static int[] sortAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[i] ^ numbers[j];
                    numbers[j] = numbers[i] ^ numbers[j];
                    numbers[i] = numbers[i] ^ numbers[j];
                }
            }
        }

        return numbers;
    }
}