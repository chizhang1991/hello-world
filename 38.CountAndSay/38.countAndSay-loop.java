public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String base = "1";
        String cur = "";
        String pre = base;
        for (int i = 2; i <= n; i++) {
            cur = moveNext(pre);
            pre = cur;
        }
        return cur;
    }
    
    private String moveNext(String key) {
        int l = key.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        
        while (i < l) {
            int count = 0;
            char temp = key.charAt(i);
            while (i < l && temp == key.charAt(i)) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(temp);
        }
        return sb.toString();
    }
}