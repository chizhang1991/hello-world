public class Solution {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        int[] plusDigit = new int[count + 1];
        int carry = 1;
        int temp;
        for (int i = count; i >= 0; i--) {
            if( i== 0) {
                temp = carry;
            }
            else {
                temp = digits[i-1] + carry;
            }
            if (temp == 10) {
                carry = 1;
                plusDigit[i] = 0;
            }
            else {
                carry = 0;
                plusDigit[i] = temp;
            }
        }
        if(plusDigit[0] == 0) {
            int[] plusDigitN = new int[count];
            for (int i = 0; i < count; i++) {
                plusDigitN[i] = plusDigit[i+1];
            }
            return plusDigitN;
        }
        return plusDigit;
    }
}