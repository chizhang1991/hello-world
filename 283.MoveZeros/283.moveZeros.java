public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int size = nums.length;
        int i = 0;
        int j = 0;
        while (i < (size - count)) {
            while ((j < size) && (nums[j] == 0)) {
                j++;
                count++;
            }
            if (j < size) {
            nums[i++] = nums[j++];
            }
        }
        while (i < size) {
            nums[i++] = 0;
        }
    }
}