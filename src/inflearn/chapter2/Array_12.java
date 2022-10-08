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
    }
}
