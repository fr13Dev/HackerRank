package algorithms.implementation.hurdlerace;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
        System.out.println(hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
    }

    static int hurdleRace(int k, int[] height) {
        final int maxHeight = Arrays.stream(height).max().orElse(0);
        return maxHeight <= k ? 0 : maxHeight - k;
    }
}
