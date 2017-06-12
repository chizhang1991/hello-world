public class Solution {
    private int[] nums;
    private Random rdm;

    public Solution(int[] nums) {
        this.nums = nums;
        this.rdm = new Random();
    }
    
    public int pick(int target) {
        int res = -1;
        int upbound = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                continue;
            }
            if (rdm.nextInt(++upbound) == 0) {
                res = i;
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */