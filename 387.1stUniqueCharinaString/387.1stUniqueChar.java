public class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int l = s.length();
        for(int i = 0; i < l; i++) {
            char temp = s.charAt(i);
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }
            else {
                map.put(temp, 1);
            }
        }
        for(int i = 0; i < l; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}