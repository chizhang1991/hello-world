public class Solution {
    public String convert(String s, int numRows) {
        int i = 0;
        int zag = numRows / 2;
        int even = numRows + zag;
        int odd = numRows - zag;
        
        for (int j = 0; j < numRows; j++) {
            int k = j;
            char current = s.charAt(k);
            if (j % 2 == 0) {
                 System.out.print(current);
                k += even;
                current = s.charAt(k);
                while (current != null) {
                    System.out.print("   " + current);
                    k += even;
                    current = s.charAt(k);
                }
            }
            else {
                System.out.print(s[j]);
                k += odd;
                current = s.charAt(k);
                while (s[k] != null) {
                    System.out.print(" " + current);
                    k += odd;
                    current = s.charAt(k);
                }
            }
            System.out.println();
        }
    }
}