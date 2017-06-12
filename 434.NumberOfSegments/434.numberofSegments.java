public class Solution {
    public int countSegments(String s) {
        int i = 0;
        int c = 1;
        if(s == null || s.equals("")) {
            return 0;
        }
        int l = s.length();
        while(c < l) {
            if(s.charAt(c-1) != ' ' && s.charAt(c) == ' ') {
                i++;
            }
            c++;
        }
        if(s.charAt(l-1) != ' ') {
            i++;
        }
        return i;
    }
}