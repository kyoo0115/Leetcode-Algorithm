class Solution {
public:
    void dfs(vector<vector<char>>& grid, int y, int x, vector<vector<bool>>& visited){
    int dy[4] = {-1, 0, 1, 0};
    int dx[4] = {0, 1, 0, -1};
    int ny, nx;
    visited[y][x] = true;

    for(int i = 0; i < 4; i++){
        ny = dy[i] + y;
        nx = dx[i] + x;
        if(ny < 0 || nx < 0 || nx >= grid[0].size() || ny >= grid.size()) continue;
        if(grid[ny][nx] == '1' && !visited[ny][nx]){
            dfs(grid, ny, nx, visited);
        }
    }
    return;
}

int numIslands(vector<vector<char>>& grid) {
    int count = 0;
    vector<vector<bool>> visited(grid.size(), vector<bool>(grid[0].size(), false));

        for(int i = 0; i < grid.size(); i++) {
            for(int j = 0; j < grid[i].size(); j++) {
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
};