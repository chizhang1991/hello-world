public class Solution {
    public int maxRotateFunction(int[] A) {
        // the size of A
        int n = A.length;
        /*while (A [n] != null) {
            n++;
        }
        */
       
        int i = 0;
        // int[] b = new int[n];
        
        int k = 0;
        int f = 0;
        int temp = 0;
        
        for (i = 0; i < n; i++) {
            temp += i * A[i];
        }
        
        for (k = 0; k < n; k++) {
            //tempf = f;
            //the value of fk
            f = 0;
            for (i = 0; i < n; i++) {
                if (k <= i){
                    // the value of Bk
                    f = f + i * A[i-k];
                }
                else {
                    f = f + i * A[n - k + i];
                }
            }
            if (temp < f) {
                temp = f;
            }
        }
        // the max fk
        return temp;
    }
}