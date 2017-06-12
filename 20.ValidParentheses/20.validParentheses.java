public class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        char[] c = new char[l];
        int top = 0;
        
        for(int i = 0; i < l; i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                c[top++] = temp;
            }
            else {
                if (top == 0) {
                    return false;
                }
                char pair = c[--top];
                if (pair == '(' && temp != ')') {
                    return false;
                }
                if (pair == '[' && temp != ']') {
                    return false;
                }
                if (pair == '{' && temp != '}') {
                    return false;
                }
            }
        }
        if (top == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}