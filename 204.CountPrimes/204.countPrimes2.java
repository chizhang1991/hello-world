public class Solution {
    public int countPrimes(int n) {
        if(n < 2) {
            return 0;
        }
        int count = 0;
        boolean notprime[] = new boolean[n];
        notprime[0] = true;
        notprime[1] = true;
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(notprime[i]!=true) {
                for(int j = i+i; j < n; j+=i) {
                    notprime[j] = true;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(notprime[i] != true) {
                count++;
            }
        }
        return count;
    }
}