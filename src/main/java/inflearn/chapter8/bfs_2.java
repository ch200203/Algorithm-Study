package inflearn.chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * 토마토 문제
 * BFS 풀이
 */
public class bfs_2 {
    static int[][] board, dis; // dis -> 걸리는 날 수
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int n, m;
    static Queue<Point> queue = new LinkedList<>(); // 미리 시작 지점을 넣어야 해서 전역으로 설정
    

    private static void BFS() {
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        m = scan.nextInt();
        n = scan.nextInt();
        
        board = new int[n][m];
        dis = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scan.nextInt();
                if(board[i][j] == 1) queue.offer(new Point(i, j));
                /**
                 * BFS가 돌기전에 시작지점을 먼저 Queue에 삽입
                 * BFS의 level -> 토마토가 익는 날의 수
                 * 
                 * 즉, 출발점이 여러개 일때는 미리 Queue에다가 넣는다.
                 */
            }
        }

        BFS();
        
        // 익지 않는 토마토가 남아 있다면. flag = false;
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 0) flag = false;
            }
        }

        if(flag) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
        
        scan.close();
    }
}

class Point {
    int x; 
    int y; 

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
