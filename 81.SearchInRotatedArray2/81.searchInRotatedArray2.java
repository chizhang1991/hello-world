public class Solution {
    public boolean search(int[] nums, int target) {
        // if (nums == null || nums.length == 0) {
        //     return false;
        // }
        // int left = 0;
        // int right = nums.length - 1;
        // int start = 0;
        // int end = 0;
        // int smallest = 0;
        // // containing duplicate, cannot decide the position of mid easily
        // // find the smallest element in the array first
        // int spliter = nums[right];
        // while (left + 1 < right) {
        //     int mid = left + (right - left) / 2;
        //     if (nums[mid] > spliter) {
        //         left = mid;
        //     } else {
        //         right = mid;
        //     }
        // }
        // if (nums[left] <= nums[right]) {
        //     smallest = left;
        // } else {
        //     smallest = right;
        // }
        // // decide target in which part
        // if (nums[smallest] <= target && target <= spliter) {
        //     start = smallest;
        //     end = nums.length - 1;
        // } else {
        //     start = 0;
        //     end = smallest - 1;
        // }
        // // binary search in half of the array
        // while (start + 1 < end) {
        //     int mid = start + (end - start) / 2;
        //     if (nums[mid] == target) {
        //         return true;
        //     }
        //     if (nums[mid] < target) {
        //         left = mid;
        //     } else {
        //         right = mid;
        //     }
        // }
        // if (nums[left] != target && nums[right] != target) {
        //     return false;
        // }
        // return true;
        for (int n : nums) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }
}