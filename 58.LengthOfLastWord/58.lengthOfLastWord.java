public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] sArray = s.split(" ");
        int l = sArray.length;
        if(l==0) {
            return 0;
        }
        else {
            return sArray[l-1].length();
        }
    }
}