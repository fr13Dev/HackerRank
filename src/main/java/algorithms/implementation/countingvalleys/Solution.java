package algorithms.implementation.countingvalleys;

public class Solution {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        //System.out.println(countingValleys(8, "DDUUDDUDUUUD"));
    }

    static int countingValleys(int n, String s) {
        final long[] steps = s.chars().mapToLong(i -> i == 85 ? 1 : -1).toArray();
        int result = 0;
        int currentLevel = 0;
        for (int i = 0; i < steps.length; i++) {
            if (currentLevel == 0 && steps[i] == -1) {
                result++;
            }
            currentLevel += steps[i];
        }
        return result;
    }
}
