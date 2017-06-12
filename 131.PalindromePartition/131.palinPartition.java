public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        getPartition(s, 0, new ArrayList<String>(), res);
        return res;
    }
    
    private void getPartition(String s, int startAt, List<String> oneAns, List<List<String>> res) {
        // find one, add to result
        if (startAt == s.length()) {
            res.add(new ArrayList<String>(oneAns));
            return;
        }
        for (int i = startAt; i < s.length(); i++) {
            String sub = s.substring(startAt, i + 1);
            // System.out.println(sub);
            if (!isPalin(sub)) {
                continue;
            }
            oneAns.add(sub);
            // find all possible answers after this one
            getPartition(s, i + 1, oneAns, res);
            // done with this one, delete it
            oneAns.remove(oneAns.size() - 1);
        }
    }
    
    private boolean isPalin(String s) {
        int length = s.length();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++; r--;
        }
        return true;
    }
}