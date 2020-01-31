package algorithms.implementation.plusminus;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
    }

    static void plusMinus(int[] arr) {
        final double length = arr.length;
        final double zeroSum = Arrays.stream(arr)
                .filter(i -> i == 0)
                .count();
        final double positiveSum = Arrays.stream(arr)
                .filter(i -> i > 0)
                .count();
        final double negativeSum = Arrays.stream(arr)
                .filter(i -> i < 0)
                .count();

        System.out.printf("%1$.6f", positiveSum / length);
        System.out.printf("\n%1$.6f", negativeSum / length);
        System.out.printf("\n%1$.6f", zeroSum / length);
    }
}