package inflearn.chapter8;

import java.util.Scanner;

/**
 * 조합의 경우수(조합수) - 메모제이션
 * 아래의 공식을 사용하여 재귀를 이용해 조합수를 구하시오
 * nCr = n-1Cr-1 + n-1Cr
 */
public class dfs_7 {
    static int[][] dy = new int[35][35];

    private static int DFS(int n, int r){
        if(dy[n][r] > 0 ) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n -1, r);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        System.out.println(DFS(n, r));

        scan.close();
    }
}
