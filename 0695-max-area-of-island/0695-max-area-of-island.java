class Solution {
   public  int maxAreaOfIsland(int[][] matrix) {
        if(matrix.length <= 0){
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int result = 0;
        boolean[][] visited = new boolean[50][50];
        int temp;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    temp = dfs(i,j, matrix, visited);
                    result = Math.max(result, temp);
                }
            }
        }
        return result;
    }

    public  int dfs(int y, int x, int[][] matrix, boolean[][] visited) {
        visited[y][x] = true;
        int count = 1;
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= matrix.length || nx >= matrix[0].length || visited[ny][nx]) continue;
            if (matrix[ny][nx] == 1){
                count += dfs(ny, nx, matrix, visited);
            }
        }
        return count;
    }
}