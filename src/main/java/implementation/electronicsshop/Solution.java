package implementation.electronicsshop;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        List<Integer> possiblePrices = new ArrayList<>();
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                possiblePrices.add(keyboard + drive);
            }
        }
        return possiblePrices.stream()
                .filter(i -> i <= b)
                .max(Integer::compareTo)
                .orElse(-1);
    }
}
