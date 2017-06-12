public class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.equals("")) {
            return 0;
        }
        HashSet<Character> hs = new HashSet<Character>();
        int res = 0;
        int l = s.length();
        for(int i = 0; i < l; i++) {
            if(hs.contains(s.charAt(i))) {
                res += 2;
                hs.remove(s.charAt(i));
            }
            else {
                hs.add(s.charAt(i));
            }
        }
        if(hs.size() != 0) {
            return ++res;
        }
        return res;
    }
}