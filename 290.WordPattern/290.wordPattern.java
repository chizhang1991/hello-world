public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null && str != null) {
            return false;
        }
        String[] sArray = str.split(" ");
        if(pattern.length() != sArray.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(sArray[i])) {
                    return false;
                }
            }
            else {
                if(map.containsValue(sArray[i])){
                    return false;
                }
                map.put(pattern.charAt(i), sArray[i]);
            }
        }
        return true;
    }
}