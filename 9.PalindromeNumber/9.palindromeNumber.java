public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return x == reverse(x);
    }
    private int reverse(int x) {
        int res = 0;
        int fact = 10;
        while(x > 0) {
            res = res * fact + x % fact;
            x = x / fact;
        }
        return res;
    }
}