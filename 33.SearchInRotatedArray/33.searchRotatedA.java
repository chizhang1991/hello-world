public class Solution {
    public int search(int[] nums, int target) {
        // use binary search
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // pivot is behind mid
            if (nums[lo] <= nums[mid]) {
                // target is in the sorted part, aka, first half array
                if (nums[lo] <= target && target <= nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[0]) {
                // 1. mid in upper half
                if (nums[0] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid;
                }
            } else {
                // 2. mid in lower half
                if (nums[mid] <= target && target <= nums[nums.length - 1]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
        }
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}