class Solution {

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int nearestExit(char[][] maze, int[] entrance) {

        int N = maze.length;
        int M = maze[0].length;

        boolean[][] visited = new boolean[N][M];
        visited[entrance[0]][entrance[1]] = true;

        return bfs(maze, visited, entrance[0], entrance[1]);
    }

    public int bfs(char[][] maze, boolean[][] visited, int x, int y) {

        int steps = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        while(!q.isEmpty()) {
            int size = q.size();
            steps++;

            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int cX = current[0];
                int cY = current[1];

                for (int j = 0; j < 4; j++) {
                    int nx = cX + dx[j];
                    int ny = cY + dy[j];

                    if(nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) {
                        continue;
                    }
                    
                    if(!visited[nx][ny] && maze[nx][ny] == '.') {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});

                        if (nx == 0 || nx == maze.length - 1 || ny == 0 || ny == maze[0].length - 1) {
                            return steps;
                        }
                    }
                }
            }
        }

        return -1;
    }
}