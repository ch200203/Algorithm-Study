package inflearn.chapter2;

import java.util.Scanner;


public class Array_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n+1][6];
        
        // i : 학생 번호
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        solution(n,arr);
    }

    public static void solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++; 
                        break;  // 값이 같으면 탈출.
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        
        System.out.println(answer);
    }
}
