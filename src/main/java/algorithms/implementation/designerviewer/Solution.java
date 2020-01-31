package algorithms.implementation.designerviewer;

public class Solution {

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(
                new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7},
                "zaba"));
    }

    static int designerPdfViewer(int[] h, String word) {
        int temp = 0;
        final int firstAscii = 97;
        for (int i = 0; i < word.length(); i++) {
            final int ascii = word.charAt(i);
            final int height = h[ascii - firstAscii];
            if (height > temp) {
                temp = height;
            }
        }
        return temp * word.length();
    }
}
