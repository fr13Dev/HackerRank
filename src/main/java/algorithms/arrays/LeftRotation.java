package algorithms.arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int d = 13;
        int[] result = rotLeft(a, d);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];
        int count = 0;
        for (int i = d; i < a.length; i++) {
            result[count] = a[i];
            count++;
        }

        int currentNumber = count;
        for (int i = 0; i < a.length - currentNumber; i++) {
            result[count] = a[i];
            count++;
        }

        return result;
    }
}
