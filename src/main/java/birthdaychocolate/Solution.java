package birthdaychocolate;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //final int birthday = birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
        //final int birthday = birthday(Arrays.asList(1, 1, 1, 1, 1), 3, 2);
        final int birthday = birthday(Collections.singletonList(4), 4, 1);
        System.out.println(birthday);
    }

    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            if (i <= (s.size() - m)) {
                for (int j = 0; j < m; j++) {
                    sum += s.get(i + j);
                }
                if (sum == d) {
                    result++;
                }
                sum = 0;
            }
        }
        return result;
    }
}
