public class Solution {
    public String reverseString(String s) {
        if (s == null) {
            return null;
        }
        int l = s.length();
        if (l == 0 || l == 1) { 
            return s;
        }
        char[] cArray = new char[l];
        for(int i = 0; i < l; i++) {
            cArray[i] = s.charAt(l-1-i);
        }
        return new String(cArray);
    }
}