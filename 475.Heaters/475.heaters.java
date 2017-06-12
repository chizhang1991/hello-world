public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = 0;
        for (int h : houses) {
            int r = 0;
            int index = Arrays.binarySearch(heaters, h);
            if (index < 0) {
                index = -index - 1;
                // whether no heater in the right of the house
                int left = index > 0 ? h - heaters[index - 1] : Integer.MAX_VALUE;
                // whether no heater on left
                int right = index < heaters.length ? heaters[index] - h : Integer.MAX_VALUE;
                r = Math.min(left, right);
            }
            if (res < r) {
                res = r;
            }
        }
        return res;
    }
}