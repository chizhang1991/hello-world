public class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        String res = "";
        while(l1 >= 0 || l2 >= 0) {
            int temp = 0;
            if(l1 >= 0) {
                temp = temp + carry + (num1.charAt(l1--) - '0');
                carry = 0;
            }
            if(l2 >= 0) {
                temp = temp + carry + (num2.charAt(l2--) - '0');
            }
            carry = temp / 10;
            res = String.valueOf(temp%10) + res;
        }
        if(carry == 1) {
            return "1" + res;
        }
        return res;
    }
}