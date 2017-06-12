public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        backtrack(res, new ArrayList(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain, int start) {
        if(remain == 0) {
            res.add(new ArrayList<>(tempList));
        }
        if(remain < 0) {
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(res, tempList, candidates, remain - candidates[i], i); // why start becomes i, not 0, remove duplicates
            tempList.remove(tempList.size() - 1);
        }
    }
}