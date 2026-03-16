class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char ch = board[i][j];
                if(ch != '.'){
                    String row = ch + " in row " + i;
                    String col = ch + " in column " + j;
                    String box = ch + " in boxes " + (i/3*3 + j/3);
                    if(set.contains(row) || set.contains(col) || set.contains(box))
                    return false;
                    set.add(row);
                    set.add(col);
                    set.add(box);
                }
            }
        }
        return true;
    }
}