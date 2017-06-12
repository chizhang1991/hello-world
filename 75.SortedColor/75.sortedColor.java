public class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int l = nums.length;
        int i;
        for (i = 0; i < l; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            }
        }
        for (i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for ( ; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for( ; i < l; i++) {
            nums[i] = 2;
        }
    }
}