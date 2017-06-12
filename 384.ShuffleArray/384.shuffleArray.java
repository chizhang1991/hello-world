public class Solution {
    private int[] nums;
    private Random rdm;

    public Solution(int[] nums) {
        this.nums = nums;
        this.rdm = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int l = nums.length;
        int[] a = nums.clone();
        for (int j = 1; j < l; j++) {
            int i = rdm.nextInt(j + 1); // upbound = j + 1
            swap(a, i, j);
        }
        return a;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */