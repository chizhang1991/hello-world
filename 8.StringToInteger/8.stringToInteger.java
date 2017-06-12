public class Solution {
    public int myAtoi(String str) {
        double res = 0;
        int i = 0;
        
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        str = str.trim();
        
        boolean positive = true;
        if (str.charAt(0) == '+') {
            i++;
        }
        else if (str.charAt(0) == '-') {
            positive = false;
            i++;
        }
        
        while (i < str.length()) {
            int digit = str.charAt(i) - '0';
            
            // is not a digit
            if (digit < 0 || digit > 9) {
                break;
            }
            
            if (positive) {
                res = res * 10 + digit;
            }
            else {
                res = res * 10 - digit;
            }
            i++;
        }
        // out of range
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int)res;
    }
}