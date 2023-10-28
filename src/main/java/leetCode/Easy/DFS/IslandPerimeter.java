package leetCode.Easy.DFS;

import java.util.*;

/**
 * 463. Island Perimeter
 * https://leetcode.com/problems/island-perimeter/
 * RunTime :
 */
public class IslandPerimeter {

    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static boolean[][] visited;
    static int answer;

    public int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;

        visited = new boolean[height][width];
        answer = 0;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, i, j);
                    return answer;
                }
            }
        }

        return answer;
    }

    private static void dfs(int[][] grid, int y, int x) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            // 경계 검사 & 물만났을때
            if (ny < 0 || ny >= grid.length || nx < 0 || nx >= grid[0].length || grid[ny][nx] == 0) {
                answer++;
                continue;
            }

            // 미방문 육지를 만났을 때
            if (grid[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(grid, ny, nx);
            }
        }
    }
}



