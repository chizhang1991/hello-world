public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        if(str == null) {
            return false;
        }
        int l = str.length();
        if(l == 0 || l == 1) {
            return false;
        }
        int i = 1; // length of the substring
        int j = 0; 
        for (i = 1; i < l; i++) {
            if(l % i == 0) {
                String test = str.substring(0, i);
                for(j = i; j <= l; j+=i) {
                    if(!str.substring(j-i, j).equals(test)) {
                        break;
                    }
                }
                if(j == l + i) {
                    return true;
                }
            }
        }
        return false;
    }
}