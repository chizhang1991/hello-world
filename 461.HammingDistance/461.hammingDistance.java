public class Solution {
    public int hammingDistance(int x, int y) {
        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);
        int i = 0;
        int lx = strX.length() - 1;
        int ly = strY.length() - 1;
        while (lx >= 0 || ly >= 0) {
            if (lx < 0) {
                if (strY.charAt(ly--) == '1') {
                    i++;
                }
            } else if (ly < 0) {
                if (strX.charAt(lx--) == '1') {
                    i++;
                }
            } else {
                if (strX.charAt(lx--) != strY.charAt(ly--)) {
                    i++;
                } 
            }
        }
        return i;
    }
}