public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l = magazine.length();
        if(ransomNote == null || ransomNote.equals("")) {
            return true;
        }
        while (ransomNote != null && !ransomNote.equals("")) {
            char key = ransomNote.charAt(0);
            if(!find(key, magazine, l)) {
                return false;
            }
            else {
                return canConstruct(rest(ransomNote), getRest(key, magazine, l));
            }
        }
        return true;
    }

    private boolean find(char key, String str, int l) {
        int i;
        for (i = 0; i < l; i++) {
            if(key == str.charAt(i)) {
                break;
            }
        }
        if(i == l) {
            return false;
        }
        else {
            return true;
        }
    }
    private String getRest(char key, String str, int l) {
        int i = 0;
        while(i< l && key != str.charAt(i)) {
            i++;
        }
        if (i == 0) {
            return str.substring(1);
        }
        else if(i == l-1) {
            return str.substring(0, i-1);
        }
        else {
            String res = str.substring(0, i) + str.substring(i+1, l);
            return res;
        }
    }
    private String rest(String str) {
        return str.substring(1);
    }
}