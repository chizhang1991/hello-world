public class Solution {
    public String longestCommonPrefix(String[] strs) {
        char temp;
        int count = 0;
        StringBuilder res = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }
        int N = strs.length;
        if (N == 1) {
            return strs[0];
        }
        boolean common = true;
        while (count < strs[0].length()) {
            temp = strs[0].charAt(count);
            for (int i = 1; i < N; i++) {
                if(((strs[i].length() - 1) < count) || (strs[i].charAt(count) != temp)) {
                    common = false;
                    break;
                }
            }
            if (common == false) {
                break;
            }
            res = res.append(temp);
            count++;
        }
        return res.toString();
    }
}