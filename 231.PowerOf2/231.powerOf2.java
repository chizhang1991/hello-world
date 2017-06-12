public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        String temp = Integer.toBinaryString(n-1);
        int l = temp.length();
        for(int i = 0; i < l; i++) {
            if(temp.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
//----------------------------------

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) {
            return false;
        }
        else{
            return (n & (n - 1)) == 0;
        }
    }
}