public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        backTrack(res, new ArrayList(), nums, 0);
        return res;
    }
    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) {
        if(tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(tempList.contains(nums[i])) {
                    continue;
                }
                tempList.add(nums[i]);
                backTrack(res, tempList, nums, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}