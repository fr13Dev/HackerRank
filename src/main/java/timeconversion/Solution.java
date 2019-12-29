package timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        timeConversion("07:05:45PM");
    }

    static String timeConversion(String s) {
        final SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssa");
        final SimpleDateFormat output = new SimpleDateFormat("HH:mm:ss");
        try {
            final Date date = df.parse(s);
            return output.format(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException();
        }
    }
}
