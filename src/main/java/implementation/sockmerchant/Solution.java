package implementation.sockmerchant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
        System.out.println(sockMerchant(9, new int[]{6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5}));
    }

    static int sockMerchant(int n, int[] ar) {
        List<Integer> result = new ArrayList<>();
        Arrays.stream(ar)
                .distinct()
                .mapToLong(i -> Arrays.stream(ar).filter(i1 -> i1 == i).count())
                .filter(i -> i > 1 || i % 2 == 0)
                .forEach(i -> {
                    result.add((int) (i - (i % 2)) / 2);
                });
        return result.stream().mapToInt(Integer::intValue).sum();
    }
}
