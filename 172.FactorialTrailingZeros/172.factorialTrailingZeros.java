public class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        if(n < 0) {
            return res;
        }
        long fact = 5;
        while(n >= fact) {
            res += (n / fact);
            fact *= 5;
        }
        return res;
    }
}