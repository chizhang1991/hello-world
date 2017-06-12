public class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        // left and right must be neighbors, the larger one is the peak
        if (nums[right] > nums[left]) {
            return right;
        } else {
            return left;
        }
    }
}