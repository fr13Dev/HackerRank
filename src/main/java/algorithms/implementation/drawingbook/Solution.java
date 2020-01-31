package algorithms.implementation.drawingbook;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pageCount(10, 9));
    }

    static int pageCount(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }
}
