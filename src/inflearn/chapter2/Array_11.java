package inflearn.chapter2;

import java.util.Scanner;

public class Array_11 {
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
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                // arr[i][j]
            }
        }
    }
}
