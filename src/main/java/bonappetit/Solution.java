package bonappetit;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int paymentSeparately = 0;
        for (int i = 0; i < bill.size(); i++) {
            final Integer item = bill.get(i);
            if (i != k) {
                paymentSeparately += item;
            }
        }
        if ((paymentSeparately / 2) != b) {
            System.out.println(b - (paymentSeparately / 2));
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
