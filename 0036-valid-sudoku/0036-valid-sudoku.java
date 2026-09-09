class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int digit = board[i][j] - '1'; 
                
                int boxIdx = (i / 3) * 3 + (j / 3); 
                
                if (rows[i][digit] || cols[j][digit] || boxes[boxIdx][digit]) {
                    return false;
                }
                
                rows[i][digit] = true;
                cols[j][digit] = true;
                boxes[boxIdx][digit] = true;
            }
        }

        return true;
    }
}
