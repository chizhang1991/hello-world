public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int temp = n;
        while(true) {
            temp = getSquare(temp);
            if(temp == 1) {
                return true;
            }
            else if(hs.contains(temp)) {
                return false;
            }
            else {
                hs.add(temp);
            }
        }
    }
    public int getSquare(int n) {
        int res = 0;
        while (n != 0) {
            int d = n % 10;
            res += d * d;
            n /= 10;
        }
        return res;
    }
}