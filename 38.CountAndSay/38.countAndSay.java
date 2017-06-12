public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        char temp;
        int i = 0;
        int l = countAndSay(n - 1).length();
        while (i < l) {
            int count = 0;
            temp = countAndSay(n - 1).charAt(i);
            while (i < l && temp == countAndSay(n-1).charAt(i)) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(temp);
        }
        return sb.toString();
    }
}