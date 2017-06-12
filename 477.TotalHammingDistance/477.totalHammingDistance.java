public class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int j = 0; j < 32; j++) {
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                count1 += (nums[i] >> j) & 1;
            }
            res += count1 * (n - count1);
        }
        return res;
    }
}