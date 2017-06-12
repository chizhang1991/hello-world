public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        backTrack(res, new ArrayList(), candidates, target, 0);
        return res;
    }
    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain, int start) {
        if(remain < 0) {
            return;
        } else if(remain == 0) {
            res.add(new ArrayList<>(tempList));
        } else {
            for(int i = start; i < candidates.length; i++) {
                // remove duplicates
                // i > start VS i > 0, elements that has already added in tempList do not need to be test, for case when candidates has duplicate items
                if(i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                tempList.add(candidates[i]);
                backTrack(res, tempList, candidates, remain - candidates[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    } 