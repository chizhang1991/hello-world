public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int temp = nums[l-1];
        int max = 0;
        int count = 0;
        for(int i = l-1; i >= 0; i--) {
            if(count >= 3) {
                break;
            }
            if(max != nums[i]) {
                max = nums[i];
                count ++;
            }
        }
        if(count == 3) {
            return max;
        }
        else {
            return temp;
        }
    }
}