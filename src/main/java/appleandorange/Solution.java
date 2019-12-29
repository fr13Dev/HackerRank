package appleandorange;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
        }
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
        }

        System.out.println(Arrays.stream(apples).filter(i -> i >= s && i <= t).count());
        System.out.println(Arrays.stream(oranges).filter(i -> i >= s && i <= t).count());
    }
}
