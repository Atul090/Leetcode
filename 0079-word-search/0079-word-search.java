class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, word, i, j, row, col, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int r, int c, int row, int col, int index) {
        if (index == word.length())
            return true;
        if (index > word.length() || r < 0 || c < 0 || r >= row || c >= col || board[r][c] != word.charAt(index)) {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = ' ';
        boolean found = dfs(board, word, r + 1, c, row, col, index + 1)
                || dfs(board, word, r - 1, c, row, col, index + 1)
                || dfs(board, word, r , c+1, row, col, index + 1)
                || dfs(board, word, r , c-1, row, col, index + 1);
        board[r][c]=temp;
        return found;
    }
}