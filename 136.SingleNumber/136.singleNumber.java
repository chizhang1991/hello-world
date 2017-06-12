public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if(hs.contains(nums[i])) {
                hs.remove(nums[i]);
            }
            else {
                hs.add(nums[i]);
            }
        }
        Iterator<Integer> it = hs.iterator();
        return it.next();
    }
}