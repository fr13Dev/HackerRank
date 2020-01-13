package implementation.encryption;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(encryption("If man were meant to fly he would have been born with wings"));
        //System.out.println(encryption("haveaniceday"));
        //System.out.println(encryption("chillout"));
        System.out.println(encryption("feedthedog"));
    }

    static String encryption(String s) {
        final String noSpaces = s.replaceAll("\\s+", "");
        final double sqrt = Math.sqrt(noSpaces.length());
        final int tempRows = (int) Math.floor(sqrt);
        final int columns = (int) Math.ceil(sqrt);
        final int rows = (tempRows * columns) < noSpaces.length() ? tempRows + 1 : tempRows;
        final char[][] table = new char[rows][columns];
        final char[] chars = noSpaces.toCharArray();
        int rowNumber = 0;
        int columnNumber = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != 0 && i % columns == 0) {
                rowNumber++;
                columnNumber = 0;
            }
            table[rowNumber][columnNumber] = chars[i];
            columnNumber++;
        }

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            boolean needSpace = false;
            for (int j = 0; j < rows; j++) {
                final char c = table[j][i];
                if (c != '\u0000') {
                    builder.append(c);
                }
                needSpace = true;
            }
            if (needSpace && i < columns - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
