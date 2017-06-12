public class Solution {
    public char findTheDifference(String s, String t) {
        if (s == null || s.length() == 0) {
            return t.charAt(0);
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(count[i] == -1) {
                return (char)('a' + i);
            }
        }
        return t.charAt(t.length()-1);
    }
}