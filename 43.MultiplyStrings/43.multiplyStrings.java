public class Solution {
    public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null) {
            return "";
        }
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String str = "";
        int length1 = num1.length();
        int length2 = num2.length();
        int[] res = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                add(res, i + j + 1, temp);
            }
        }
        for (int i = 0; i < length1 + length2; i++) {
            if (i == 0 && res[0] == 0) {
                continue;
            }
            str = str + String.valueOf(res[i]);
        }
        return str;
    }
    private void add(int[] res, int index, int delta) {
        int carry = 0;
        int temp = delta + res[index];
        res[index] = temp % 10;
        carry = temp / 10;
        while (carry != 0) {
            index--;
            temp = res[index] + carry;
            res[index] = temp % 10;
            carry = temp / 10;
        }
    }
}


// the length of num1 and num2 could be 110

// public class Solution {
//     public String multiply(String num1, String num2) {
//         return intToStr(strToInt(num1) * strToInt(num2));
//     }
//     private int strToInt(String str) {
//         if (str == null || str.length() == 0) {
//             return 0;
//         }
//         int fact = 10;
//         int res = 0;
//         for (char s : str.toCharArray()) {
//             res = res * fact + (s - '0');
//         }
//         return res;
//     }
//     private String intToStr(int num) {
//         if (num == 0) {
//             return "0";
//         }
//         String res = "";
//         while (num > 0) {
//             res = String.valueOf(num % 10) + res;
//             num = num / 10;
//         }
//         return res;
//     }
// }