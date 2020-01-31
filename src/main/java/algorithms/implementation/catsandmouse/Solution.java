package algorithms.implementation.catsandmouse;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }

    static String catAndMouse(int x, int y, int z) {
        final int distanceXToZ = Math.abs(z - x);
        final int distanceYToZ = Math.abs(z - y);
        if (distanceXToZ < distanceYToZ) {
            return "Cat A";
        } else if (distanceXToZ > distanceYToZ) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
