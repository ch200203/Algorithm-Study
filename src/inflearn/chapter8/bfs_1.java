package inflearn.chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 최단거리 구하기
 * BFS
 */
public class bfs_1 {
    static int[][] dis, board;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int answer = 0;

    private static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        
        // 출발점 체크
        board[x][y] = 1;
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        BFS(1, 1);
        // 갈 수 있는 방법이 없는 경우 -1
        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);

        scan.close();
    }
}

class Point2 {
    int x;
    int y;
    
    public Point2(int x, int y ) {
        this.x = x;
        this.y = y;
    }

}
