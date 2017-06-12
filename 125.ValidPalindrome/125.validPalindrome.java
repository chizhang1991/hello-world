public class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        if (s == null || l == 0) {
            return true;
        }
        int front = 0;
        int back = l-1;
        while (front < back) {
            char f = s.charAt(front);
            char b = s.charAt(back);
            while (!isLetterNumber(f) && (front < back)) {
                front++;
                f = s.charAt(front);
            }
            while (!isLetterNumber(b) && (back > front)) {
                back--;
                b = s.charAt(back);
            }
            if(!isSame(f, b)) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    
    private boolean isLetterNumber(char key) {
        return ((key >= 'a') && (key <= 'z')) || ((key >= 'A') && (key <= 'Z')) || ((key >= '0') && (key <= '9'));
    }
    private boolean isCapital(char key) {
        return (key >= 'A') && (key <= 'Z');
    }
    private boolean isSame(char a, char b) {
        if (isCapital(a)) {
            a = (char) (a - 'A' + 'a');
        }
        if (isCapital(b)) {
            b = (char) (b - 'A' + 'a');
        }
        return a == b;
    }
}