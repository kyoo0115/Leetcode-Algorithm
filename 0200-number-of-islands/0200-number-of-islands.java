class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    callDFS(grid, i, j);
                }
            }
        }
        return count;
    }
    public void callDFS(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        callDFS(grid, i + 1, j);
        callDFS(grid, i - 1, j);
        callDFS(grid, i, j - 1);
        callDFS(grid, i, j + 1);
    }
}