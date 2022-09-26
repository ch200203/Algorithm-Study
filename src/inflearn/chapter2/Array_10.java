package inflearn.chapter2;

import java.util.Scanner;

// 10 봉우리
public class Array_10 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        solution(n, arr);
    }

    public static void solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                // 4방향 탐색
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // 행 좌표
                    int ny = j + dy[k]; // 열 좌표

                    // nx >= 0 && nx < n && ny >= 0 && ny < n 경계선 처리
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j] ) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        System.out.print(answer + " ");
    }
}
