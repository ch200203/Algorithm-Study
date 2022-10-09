package inflearn.chapter2;

import java.util.Arrays;
import java.util.Scanner;


public class Array_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        solution(n, m, arr);
    }

    public static void solution(int n, int m, int[][] arr) {
        int answer = 0;
        System.out.println(Arrays.deepToString(arr));

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        // k 회차 시험의 i번, j번 학생의 등수 확인
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    
                    // 학생수 확인
                    if(pi < pj) cnt++;
                }

                if(cnt == m) answer++;
            }
        }
        System.out.println(answer);
    }
}

