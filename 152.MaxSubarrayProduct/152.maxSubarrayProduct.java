public class Solution {
    public int maxProduct(int[] nums) {
        // product can be positive or negative
        int l = nums.length;
        int[] max = new int[l];
        int[] min = new int[l];
        int maxValue = nums[0];
        max[0] = min[0] = nums[0];
        for (int i = 1; i < l; i++) {
            max[i] = min[i] = nums[i];
            if (nums[i] > 0) {
                max[i] = Math.max(max[i], max[i - 1] * nums[i]);
                min[i] = Math.min(min[i], min[i - 1] * nums[i]);
            } else {
                max[i] = Math.max(max[i], min[i - 1] * nums[i]);
                min[i] = Math.min(min[i], max[i - 1] * nums[i]);
            }
            // max subarray may not come to the last element of the array
            maxValue = Math.max(maxValue, max[i]);
        }
        return maxValue;
    }
}