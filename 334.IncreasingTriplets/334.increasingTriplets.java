public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int smallest = Integer.MAX_VALUE;
        int bigger = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= smallest) {
                smallest = n;
            } else if (n <= bigger) {
                bigger = n;
            } else {
                return true;
            }
        }
        return false;
    }
}




// dynamic programming 
// do not satisfy time complexity
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int l = nums.length;
        int[] dp = new int[l];
        Arrays.fill(dp, 1);
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                } 
                if (dp[i] >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}