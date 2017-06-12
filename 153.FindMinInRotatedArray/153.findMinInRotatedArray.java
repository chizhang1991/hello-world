public class Solution {
    public int findMin(int[] nums) {
        // find the first element that is less than spliter element
        // spliter element -> the last element in nums[]
        int left = 0;
        int right = nums.length - 1;
        int spliter = nums[right];
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > spliter) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (nums[right] < nums[left]) {
            return nums[right];
        }
        return nums[left];
    }
}