package implementation.minimaxsum;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        miniMaxSum(new int[]{
                1, 2, 3, 4, 5
        });
    }

    static void miniMaxSum(int[] arr) {
        final List<Integer> list = new LinkedList<>();
        for (int value : arr) {
            list.add(value);
        }
        list.sort(Integer::compareTo);
        long minSum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            minSum += list.get(i);
        }
        long maxSum = 0;
        for (int i = list.size() - 1; i > 0; i--) {
            maxSum += list.get(i);
        }
        System.out.print(minSum + "  " + maxSum);
    }
}
