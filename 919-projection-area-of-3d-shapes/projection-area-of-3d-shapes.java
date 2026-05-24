class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0;
        int front = 0;
        int side = 0;
        for(int i = 0; i < n; i++){
            int rowmax = 0;
            int colmax = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] > 0){
                    top++;
                }
                rowmax = Math.max(rowmax, grid[i][j]);
                colmax = Math.max(colmax, grid[j][i]);
            }
            front += rowmax;
            side += colmax;
        }
        return top + front + side;
    }
}