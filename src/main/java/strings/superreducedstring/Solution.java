package strings.superreducedstring;

public class Solution {

    public static void main(String[] args) {
        System.out.println(superReducedString("baab"));
    }

    static String superReducedString(String s) {
        String result;
        do {
            result = s;
            s = s.replaceAll("([a-z])\\1", "");
            s = s.isEmpty() ? "Empty String" : s;
        } while (!result.equals(s));
        return result;
    }
}
