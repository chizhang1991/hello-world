public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        int l = s.length();
        for(int i = 0; i < l; i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(cs)) {
                if(map.get(cs) != ct) {
                    return false;
                }
            }
            else {
                if(map.containsValue(ct)){
                    return false;
                }
            }
            map.put(cs, ct);
        }
        return true;
    }
}