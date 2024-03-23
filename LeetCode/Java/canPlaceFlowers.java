public class canPlaceFlowers {

    /**
     * 605. Can Place Flowers
     * You have a long flowerbed in which some of the plots are planted, and some
     * are not. However, flowers cannot be planted in adjacent plots.
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
     * and 1 means not empty, and an integer n, return true if n new flowers can be
     * planted in the flowerbed without violating the no-adjacent-flowers rule and
     * false otherwise.
     */
    public static boolean canPlaceFlowersMethod(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + canPlaceFlowersMethod(new int[]{1,0,0,0,1}, 1) + " = true");
        System.out.println("Example 1: " + canPlaceFlowersMethod(new int[]{1,0,0,0,1}, 2) + " = false");
        System.out.println("Example 3: " + canPlaceFlowersMethod(new int[]{1,0,0,0,0,1}, 2) + " = false");
        System.out.println("Example 4: " + canPlaceFlowersMethod(new int[]{1,0,0,0,1,0,0}, 2) + " = true");
        System.out.println("Example 4: " + canPlaceFlowersMethod(new int[]{0,0,0}, 2) + " = true");
    }

}
