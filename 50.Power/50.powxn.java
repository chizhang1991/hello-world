// recursive
public class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return power(x, n);
        }
    }
    private double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        } else {
            return x * power(x * x, n / 2);
        }
    }
}



//硬算超时
public class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        boolean isNeg = n < 0;
        int pow = Math.abs(n);
        for (int i = 0; i < pow; i++) {
            res *= x;
        }
        return isNeg ? 1 / res : res;
    }
}