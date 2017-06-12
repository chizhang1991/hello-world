public class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int next = 0;
        int cur = 0;
        int count = s.length();
        int i;
        
        if (count == 1) {
            return oneDigit(s.charAt(0));
        }
        
        for (i = 1; i < count; i++) {
            cur = oneDigit(s.charAt(i-1));
            next = oneDigit(s.charAt(i));
            if (cur >= next) {
                res += cur;
            }
            else {
                res += (next - cur);
                i++;
            }
        }
        
        if (cur >= next) {
            res += next;
        }
        
        else if (i == count) {
            res += oneDigit(s.charAt(count-1));
        }
        
        return res;
    }
    
    private int oneDigit (char c) {
        int digit;
        switch (c) {
            case 'I': 
                digit = 1; 
                break;
            case 'V': 
                digit = 5;
                break;
            case 'X':
                digit = 10;
                break;
            case 'L':
                digit = 50;
                break;
            case 'C':
                digit = 100;
                break;
            case 'D':
                digit = 500;
                break;
            case 'M':
                digit = 1000;
                break;
            default:
                digit = 0;
        }
        return digit;
    }
}