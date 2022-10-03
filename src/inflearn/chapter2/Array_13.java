package inflearn.chapter2;

import java.util.Scanner;

public class Array_13 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int m, n;
        n = scan.nextInt();
        m = scan.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        solution(n, m, arr);
    }
    
    public static void solution(int n, int m, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
            }
        }
    }
}
