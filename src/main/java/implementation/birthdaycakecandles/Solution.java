package implementation.birthdaycakecandles;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    public static void main(String[] args) {
        birthdayCakeCandles(new int[]{3, 2, 1, 3});
    }

    static int birthdayCakeCandles(int[] ar) {
        final OptionalInt op = Arrays.stream(ar).max();
        if (op.isPresent()) {
            return (int) Arrays.stream(ar).filter(i -> i == op.getAsInt()).count();
        } else {
            return 0;
        }
    }
}
