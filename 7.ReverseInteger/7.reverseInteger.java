public class Solution {
    public int reverse(int x) {
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        boolean isPos = true;
        if(x < 0) {
            isPos = false;
            x = -x;
        }
        long res = 0;
        int fact = 10;
        while(x > 0) {
            res = res * fact + x % fact;
            x = x / fact;
        }
        if(res > Integer.MAX_VALUE) {
            return 0;
        }
        if(isPos == false) {
            return (int)(0-res);
        }
        return (int)res;
    }
}