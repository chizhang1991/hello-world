public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows <= 0) {
            return res;
        }
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j = 1; j < i; j++) {
                List<Integer> prev = res.get(i - 1);
                row.add(prev.get(j-1) + prev.get(j));
            }
            if(i != 0) {
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}