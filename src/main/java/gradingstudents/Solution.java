package gradingstudents;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        final List<Integer> list = gradingStudents(Arrays.asList(73, 67, 38, 33));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        final List<Integer> result = new LinkedList<>();
        grades.forEach(i -> {
            if (i < 38) {
                result.add(i);
            } else {
                final int remain = i % 5;
                if (remain > 2) {
                    result.add((i - remain) + 5);
                } else {
                    result.add(i);
                }
            }
        });
        return result;
    }
}
