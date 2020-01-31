package algorithms.implementation.divisiblesumpairs;

public class Solution {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (i < j && (ar[i] + ar[j]) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }

}
