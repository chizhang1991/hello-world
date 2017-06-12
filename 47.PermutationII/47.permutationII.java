public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) {
            return res;
        }
        backTrack(res, new ArrayList(), nums, new boolean[nums.length]);
        return res;
    }
    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, boolean[] used) {
        if(tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1])) {
                    continue;
                }
                used[i] = true;
                tempList.add(nums[i]);
                backTrack(res, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size()-1);
            }
        }
    }
}