public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0 || k == 0) {
            return res;
        }
        backtrack(res, new ArrayList(), n, 1, k);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int remain, int start, int k) {
        if(remain < 0) {
            return;
        }
        if(remain == 0 && tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
        } else {
            for(int i = start; i < 10; i++) {
                tempList.add(i);
                backtrack(res, tempList, remain-i, i+1, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}