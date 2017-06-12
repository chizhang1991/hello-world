public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i = 0;
        int j = 0;
        for (i = 0; i < 9; i++) {
            HashSet<Character> hs = new HashSet<Character>();
            for(j = 0; j < 9; j++) {
                if(board[i][j] != '.' && hs.contains(board[i][j])) {
                    return false;
                }
                else if(board[i][j] != '.') {
                    hs.add(board[i][j]);
                }
            }
        }
        for(j = 0; j < 9; j++) {
            HashSet<Character> hs = new HashSet<Character>();
            for(i = 0; i < 9; i++) {
                if(board[i][j] != '.' && hs.contains(board[i][j])) {
                    return false;
                }
                else if(board[i][j] != '.') {
                    hs.add(board[i][j]);
                }
            }
        }
        for(int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                HashSet<Character> hs = new HashSet<Character>();
                for(i = 0; i < 3; i++) {
                    for(j = 0; j < 3; j++) {
                        if(board[3*m+i][3*n+j]!='.' && hs.contains(board[3*m+i][3*n+j])) {
                            return false;
                        }
                        if(board[3*m+i][3*n+j]!='.') {
                            hs.add(board[3*m+i][3*n+j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}