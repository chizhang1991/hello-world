public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int val = nums[0];
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
                val = nums[i];
            }
        }
        return j;
    }
}