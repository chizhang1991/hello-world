public class Solution {
    public int titleToNumber(String s) {
        int l = s.length();
        int fact = 26;
        int res = 0;
        for(int i = 0; i < l; i++) {
            res = res * fact + (s.charAt(i) - 'A' + 1);
        }
        return res;
    }
}