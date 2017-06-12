public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        // Use StringBuilder, much faster than String
        StringBuilder res = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            res = getNext(res);
        }
        return res.toString();
    }
    private StringBuilder getNext(StringBuilder pre) {
        StringBuilder next = new StringBuilder();
        int l = pre.length();
        int count = 0;
        for (int i = 0; i < l; i += count) {
            count = 0;
            char key = pre.charAt(i);
            int j = i;
            while (j < l && pre.charAt(j) == key) {
                count++;
                j++;
            }
            next.append(count).append(key);
        }
        return next;
    }
}