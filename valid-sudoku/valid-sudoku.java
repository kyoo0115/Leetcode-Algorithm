class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char currentChar = board[i][j];
                if(currentChar != '.') {
                    if (!seen.add(currentChar + " row " + i) || !seen.add(currentChar + " column " + j) ||
                            !seen.add(currentChar + "box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}