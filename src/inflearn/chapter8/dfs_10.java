package inflearn.chapter8;

import java.util.Scanner;

/**
 * 미로탐색
 */
public class dfs_10 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] board;
    static int answer = 0;

    /**
     * 
     * @param x x좌표
     * @param y y좌표
     */
    private static void DFS(int x, int y) {
        if(x == 7 && y == 7) answer ++;
        else {
            // 4방향 검사하기
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 경계선 검사하기
                if(nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    // POP해서 BACK하는 시점
                    board[nx][ny] = 0;
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

        // 시작 위치를 세팅
        board[1][1] = 1;
        DFS(1, 1);

        System.out.println(answer);

        scan.close();
    }
}
