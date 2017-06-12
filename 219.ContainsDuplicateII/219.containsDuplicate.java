public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int l = nums.length;
        if(l == 0) {
            return false;
        }
        for(int i = 0; i < l; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
                else {
                    map.put(nums[i], i);
                }
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}