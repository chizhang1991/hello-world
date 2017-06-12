public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        String temp = Integer.toBinaryString(n);
        int l = temp.length();
        for(int i = 0; i < l; i++) {
            if(temp.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }
}

//----------------------------------

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += (n & 1);
            n >>>= 1;
        }
        return res;
    }
}