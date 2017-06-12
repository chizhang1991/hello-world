public class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        char[] cArray = new char[l];
        int lo = 0;
        int hi = l-1;
        // lo == hi -> for the case that the string length is 1
        while (lo <= hi) {
            // find the first lo
            while(lo < hi && !isVowel(s.charAt(lo))) {
                cArray[lo] = s.charAt(lo);
                lo++;
            }
            // find the first hi
            while(lo < hi && !isVowel(s.charAt(hi))) {
                cArray[hi] = s.charAt(hi);
                hi--;
            }
            cArray[lo] = s.charAt(hi);
            cArray[hi] = s.charAt(lo);
            lo++;
            hi--;
        }
        return new String(cArray);
    }
    private Boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}