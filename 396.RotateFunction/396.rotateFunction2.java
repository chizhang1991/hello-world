public class Solution {
    public int maxRotateFunction(int[] A) {
        // the size of A
        int n = A.length;
        
        int f = 0;
        int f0 = 0;
        
        // f0
        for (int i = 0; i < n; i++) {
            f0 += i * A[i];
        }
        int temp = f0;
        
        for (int k = 1; k < n; k++) {
            f = f0;
            
            for (int i = 0; i < n - k; i++) {
                f += k * A[i];
            }
            for (int i = n - k; i < n; i++) {
                f -= (n - k) * A[i];
            }
            
            if (temp < f) {
                temp = f;
            }
        }
        // the max fk
        return temp;
    }
}