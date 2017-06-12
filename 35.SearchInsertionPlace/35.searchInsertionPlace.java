public class Solution {
    public int searchInsert(int[] nums, int target) {
        // find the first position in nums that is larger than or equal to target
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        // right begin at nums.length, for the case if the insertion place is the last position
        int right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (nums[left] >= target) {
            return left;
        }
        return right;
    }
}