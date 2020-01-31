package algorithms.implementation.staircase;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        staircase(16);
    }

    static void staircase(int n) {
        final Stack<String> stack = new Stack<>();
        for (int i = n; i > 0; i--) {
            final StringBuilder builder = new StringBuilder();
            for (int j = n - i; j > 0; j--) {
                builder.append(" ");
            }
            for (int j = 0; j < i; j++) {
                builder.append("#");
            }
            stack.push(builder.toString());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }
    }
}
