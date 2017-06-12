public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0 || n < k) {
            return res;
        }
        getOne(n, k, 1, new ArrayList<>(), res);
        return res;
    }
    private void getOne(int n, int k, int startAt, List<Integer> temp, List<List<Integer>> res) {
        // if temp is one possible answer, add it
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
        }
        // other number need in the temp, add one
        for (int i = startAt; i <= n; i++) {
            temp.add(i);
            // get all possible answers starting with i
            getOne(n, k, i + 1, temp, res);
            // done with i, remove it
            temp.remove(temp.size() - 1);
        }
    }
}