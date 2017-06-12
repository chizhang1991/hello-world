public class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= (i + 1) ^ nums[i];
        }
        return res;
    }
}

// binary Search
public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int lo = 0;
        int hi = nums.length;
        int mid = 0;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] > mid) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}