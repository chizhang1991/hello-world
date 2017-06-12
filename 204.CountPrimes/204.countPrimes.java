public class Solution {
    public int countPrimes(int n) {
        if(n < 2) {
            return 0;
        }
        int count = 0;
        boolean notprime[] = new boolean[n-2];
        for(int i = 2; i < n; i++) {
            int t = i+i;
            while(t < n) {
                notprime[t-2] = true;
                t += i;
            }
        }
        for(int i = 0; i < n-2; i++) {
            if(notprime[i] != true) {
                count++;
            }
        }
        return count;
    }
}