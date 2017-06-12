public class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.equals("")) {
            return 0;
        }
        int[] count = new int[26 * 2];
        for(int i = 0; i < s.length(); i++) {
            count[num(s.charAt(i))]++;
        }
        for(int i = 0; i < 52; i++) {
            System.out.print(count[i] + " ");
        }
        int res = 0;
        int odd = 0;
        for(int i = 0; i < (26 * 2); i++) {
            if(count[i] % 2 == 0) {
                res += count[i];
            }
            else {
                odd = 1;
                res += count[i] - 1;
            }
        }
        return res + odd;
    }
    private int num (char c) {
        if(c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        else {
            return c - 'A' + 26;
        }
    }
}