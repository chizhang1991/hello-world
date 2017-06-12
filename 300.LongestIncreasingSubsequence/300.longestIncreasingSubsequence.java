public class Solution {
    public int lengthOfLIS(int[] nums) {
        // dp
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //
        int[] length = new int[nums.length];
        // length[0] = 1;
        Arrays.fill(length, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    length[i] = Math.max(length[i], length[j] + 1);
                }
            }
        }
        Arrays.sort(length);
        return length[nums.length - 1];
    }
}