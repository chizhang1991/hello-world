public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // find the max subarray
        // subarray = prefixSum[i] - prefixSum[j] (j < i && prefixSum[j] is the min)
        int res = Integer.MIN_VALUE;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(res, sum - min);
            min = Math.min(min, sum);
        }
        return res;
    }
}