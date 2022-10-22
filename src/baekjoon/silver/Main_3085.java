package baekjoon.silver;

import java.util.Scanner;


// 완탐
public class Main_3085 {
    public static char[][] board;
    public static int N;
    public static int max = 0;
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        board = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = scan.next().charAt(0);
            }
        }

        System.out.println(solution(N, board));
    }

    private static int solution(int n, char[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < board.length; k++) {
                    int dx = i + x[k];
                    int dy = j + y[k];
                    if(dx < 0 || dy < 0 || dx > n || dy > n) continue;
                    
                }
            }
        }
        return 0;
    }
    

    // 문자 교환 메소드
    public static void swap(int x1, int x2, int y1, int y2) {
        char tmp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = tmp;
    }

    // 행 확인
    public static int chkRow(int x) {
        

    }
    // 열 확인
    public static int chkCol(int y) {

    }
}
