public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 0; i <= num; i++) {
            int temp = i;
            res[i] = 0;
            while(temp > 0) {
                res[i] += (temp) & 1;
                temp >>= 1;
            }
        }
        return res;
    }
}