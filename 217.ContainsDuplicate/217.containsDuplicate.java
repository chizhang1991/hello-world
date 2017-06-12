public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if(hs.contains(nums[i])) {
                return true;
            }
            else {
                hs.add(nums[i]);
            }
        }
        return false;
    }
}