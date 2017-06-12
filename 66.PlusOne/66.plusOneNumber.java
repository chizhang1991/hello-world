public class Solution {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        int number = 0;
        int factor = 1;
        for (int i = count-1; i >= 0; i--) {
            number += (digits[i] * factor);
            factor *= 10;
        }
        number++;
        int[] plusDigits = new int[count+1];
        for (int i = 0; i < count + 1; i++) {
            if(number < factor) {
                plusDigits[i] = 0;
            }
            else {
                plusDigits[i] = number/factor;
            }
            number -= (plusDigits[i] * factor);
            factor /= 10;
        }
        if (plusDigits[0] == 0) {
            int[] plusDigitsN = new int[count];
            for(int i = 0; i < count; i++) {
                plusDigitsN[i] = plusDigits[i+1];
            }
            return plusDigitsN;
        }
        return plusDigits;
    }
}