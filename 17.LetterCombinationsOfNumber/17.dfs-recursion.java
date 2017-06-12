public class Solution {
    
    public List<String> letterCombinations(String digits) {
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new LinkedList<String>();
        if(digits == null || digits.length() == 0) {
            return res;
        }
        StringBuilder temp = new StringBuilder();
        dfs(digits, map, 0, temp, res);
        return res;
    }
    
    private void dfs(String digits, String[] map, int deep, StringBuilder temp, List<String> res) {
        if (deep == digits.length()) {
            res.add(temp.toString());
            return;
        } else {
            for (int i = 0; i < map[digits.charAt(deep) - '0'].length(); i++) {
                temp.append(map[digits.charAt(deep) - '0'].charAt(i));
                dfs(digits, map, deep+1, temp, res);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}