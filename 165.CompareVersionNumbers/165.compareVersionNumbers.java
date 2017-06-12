public class Solution {
    public int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int s1 = version1.length();
        int s2 = version2.length();
        while (i < s1 && j < s2 && level(version1, i, s1) == level(version2, j, s2)) {
            while(i < s1 && version1.charAt(i) != '.') {
                i++;
            }
            while(j < s2 && version2.charAt(j) != '.') {
                j++;
            }
            i++;
            j++;
        }
        if (i < s1 && j < s2) {
            if (level(version1, i, s1) > level(version2, j, s2)) {
                return 1;
            }
            else {
                return -1;
            }
        }
        if (i >= s1 && j < s2) {
            while (j < s2 && (version2.charAt(j) == '0' || version2.charAt(j) == '.')) {
                j++;
            }
            if (j == s2) {
                return 0;
            }
            else {
                return -1;
            }
        }
        if (i < s1 && j >= s2) {
            while (i < s1 && (version1.charAt(i) == '0' || version1.charAt(i) == '.')) {
                i++;
            }
            if (i == s1) {
                return 0;
            }
            else {
                return 1;
            }
        }
        return 0;
    }
    
    private int level(String str, int i, int s) {
        int res = 0;
        int base = 10;
        while (i < s && str.charAt(i) != '.') {
            res = res * base + (str.charAt(i) - '0');
            i++;
        }
        return res;
    }
}