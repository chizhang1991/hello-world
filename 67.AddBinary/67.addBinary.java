public class Solution {
    public String addBinary(String a, String b) {
        if (a == null && b == null) {
            return "0";
        }
        int carry = 0;
        int la = a.length();
        int lb = b.length();
        int pa = la-1;
        int pb = lb-1;
        int ls = la > lb ? la : lb;
        char[] res = new char[ls];
        ls--;
        while (pa >= 0 || pb >= 0) {
            int temp;
            if (pa >= 0 && pb >= 0) {
                temp = (a.charAt(pa) - '0') + (b.charAt(pb) - '0') + carry;
            }
            else if (pa >= 0) {
                temp = (a.charAt(pa) - '0') + carry;
            }
            else {
                temp = (b.charAt(pb) - '0') + carry;
            }
            if (temp == 3) {
                res[ls--] = '1';
                carry = 1;
            }
            else if (temp == 2) {
                res[ls--] = '0';
                carry = 1;
            }
            else if (temp == 1) {
                res[ls--] = '1';
                carry = 0;
            }
            else {
                res[ls--] = '0';
                carry = 0;
            }
            pa--;
            pb--;
        }
        if(carry == 1) {
            return "1" + new String(res);
        }
        return new String(res);
    }
}