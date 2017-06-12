public class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        int size = nums.length;
        for (int i = 0 ; i < size; i++) {
            if(nums[i] != 0) {
                if(p != i) {
                    nums[p] = nums[i];
                }
                p++;
            }
        }
        for (int i = p; i < size; i++) {
            nums[i] = 0;
        }
    }
}