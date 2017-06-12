public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            res ^= nums[i];
        }
        return res;
    }
}