public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int min = 0;
        int sum = 0;
        int size = nums.length;
        while(right < size) {
            if(sum < s) {
                sum += nums[right++];   
            }
            while(sum >= s) {
                if(min == 0 || min > right - left) {
                    min = right - left;
                }
                if(min == 1) {
                    return min;
                }
                sum-=nums[left];
                left++;
            }
        }
        return min;
    }
}