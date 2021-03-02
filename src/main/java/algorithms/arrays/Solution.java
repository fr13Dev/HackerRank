package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        System.out.println(getMaxHourglassesSum(arr));
    }

    public static int getMaxHourglassesSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>(16);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (k == i + 1 && (l == j || l == j + 2)) {
                            continue;
                        }
                        sum += arr[k][l];
                    }
                }
                sums.add(sum);
            }
        }
        return sums.stream().max(Integer::compareTo).orElse(0);
    }
}
