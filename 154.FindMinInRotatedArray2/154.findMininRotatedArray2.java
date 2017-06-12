public class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}

// Binary Search -- worst case not really more efficiency
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[right]) {
                right--;
            } else if (nums[mid] > nums[right]) {
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