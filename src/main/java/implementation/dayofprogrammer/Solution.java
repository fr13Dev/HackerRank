package implementation.dayofprogrammer;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
    }

    static String dayOfProgrammer(int year) {
        int[] days = new int[8];
        days[0] = 31;
        if (year >= 1700 && year <= 1917) {
            days[1] = year % 4 == 0 ? 29 : 28;
        } else if (year == 1918) {
            days[1] = 15;
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    days[1] = 29;
                } else {
                    if (year % 400 == 0) {
                        days[1] = 29;
                    } else {
                        days[1] = 28;
                    }
                }
            } else {
                days[1] = 28;
            }
        }

        days[2] = 31;
        days[3] = 30;
        days[4] = 31;
        days[5] = 30;
        days[6] = 31;
        days[7] = 31;

        final int dayOfSeptember = 256 - Arrays.stream(days).sum();
        return dayOfSeptember + ".09." + year;
    }
}
