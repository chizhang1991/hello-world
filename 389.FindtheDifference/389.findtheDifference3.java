public class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        int i = 0;
        for(i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        res ^= t.charAt(i);
        return (char)res;
    }
}