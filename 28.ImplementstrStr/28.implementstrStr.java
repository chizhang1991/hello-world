public class Solution {
    public int strStr(String haystack, String needle) {
        int occur = -1;
        int shs  = haystack.length();
        int sn = needle.length();
        // needle ""
        if (needle == null || sn == 0) {
            return 0;
        }
        // needle longer than hay
        if (haystack == null || shs < sn) {
            return -1;
        }
        
        for (int i = 0; i < shs; i++) {
            char temp = haystack.charAt(i);
            int j = 0;
            if (temp == needle.charAt(j)) {
                occur = i;
                //needle longer than rest hay
                if (sn > (shs - i)) {
                    return -1;
                }
                //needle shorter than rest part of hay
                for (j = 0; j < sn; j++) {
                    if (haystack.charAt(i) != needle.charAt(j)) {
                        i = occur;
                        occur = -1;
                        break;
                    }
                    i++;
                }
                if (j == sn) {
                    return occur;
                }
            }
        }
        return occur;
    }
}