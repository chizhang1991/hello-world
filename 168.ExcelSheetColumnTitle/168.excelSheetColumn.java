public class Solution {
    public String convertToTitle(int n) {
        String res = "";
        String temp = "";
        int rest = n;
        int base = (int)'A';
        while(rest != 0) {
            temp = "" + (char)(base + ((rest-1) % 26));
            res = temp + res;
            rest = (rest-1) / 26;
        }
        return res;
    }
}