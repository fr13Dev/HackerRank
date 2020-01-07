package implementation.breakingrecords;

public class Solution {

    public static void main(String[] args) {
        int[] records = breakingRecords(new int[]{0, 5, 20, 20, 4, 5, 2, 25, 1});
        System.out.println(records[0]);
        System.out.println(records[1]);
    }

    static int[] breakingRecords(int[] scores) {
        int currentBest = 0;
        int currentWorst = 0;
        int bestCounter = 0;
        int worstCounter = 0;

        for (int i = 0; i < scores.length; i++) {
            int currentScore = scores[i];
            if (i == 0) {
                currentBest = currentScore;
                currentWorst = currentScore;
            }
            if (currentBest < currentScore) {
                currentBest = currentScore;
                if (i != 0) {
                    bestCounter++;
                }
            }
            if (currentWorst > currentScore) {
                currentWorst = currentScore;
                if (i != 0) {
                    worstCounter++;
                }
            }
        }
        return new int[]{bestCounter, worstCounter};

    }
}
