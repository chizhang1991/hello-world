public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int j = 0;
        int k = 0;
        int[] res = new int[2];
        boolean find = false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < l; i++) {
            hs.add(nums[i]);
        }
        for(int i = 0; i < l; i++) {
            if(hs.contains(nums[i]) && hs.contains(target - nums[i]) && nums[i] != (target - nums[i])) {
                j = nums[i];
                find = true;
                break;
            }
        }
        if(find == false) {
            j = target / 2;
        }
        for(int i = 0; i < l; i++) {
            if(nums[i] == j || nums[i] == target - j) {
                res[k] = i;
                k++;
            }
            if(k == 2) {
                break;
            }
        }
        return res;
    }
}