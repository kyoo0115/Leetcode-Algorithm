class Solution {
    bool visited[50][50];
    int temp;
    int result = 0;
    int dy[4] = {-1, 0, 1, 0};
    int dx[4] = {0, 1, 0, -1};

    
public:
    int dfs(int y, int x, vector<vector<int>>& grid) {
    visited[y][x] = true;
    int count = 1;
    for(int i = 0; i < 4; i++){
        int ny = y + dy[i];
        int nx = x + dx[i];

        if(ny < 0 || nx < 0 || ny >= grid.size() || nx >= grid[0].size() || visited[ny][nx]) continue;
        if(grid[ny][nx] == 1){
            count += dfs(ny, nx, grid);
        }
    }
    return count;
}

int maxAreaOfIsland(vector<vector<int>>& grid) {
    if(grid.empty()) {
        return 0;
    }

    int n = grid.size();
    int m = grid[0].size();

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            if(grid[i][j] == 1 && !visited[i][j]){
                temp = dfs(i, j, grid);
                result = max(temp, result);
            }
        }
    }
    return result;
}

};