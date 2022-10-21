package baekjoon.Bronze;

import java.util.Scanner;


// 이항 계수(Binomial coefficient)
// 파스칼의 삼각형 
// DP 메모제이션 **** 너무너무 중요함
public class Main_11050 {
    static int[][] memo;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        memo = new int[n + 1][n + 1];

        System.out.println(bonomial(n, k));
    }

    public static int bonomial(int n, int k) {
        if(k == 0 || n == k) return 1;
        return bonomial(n - 1, k - 1) + bonomial(n - 1, k);
    }

    public static int bonomial_memo(int n, int k) {
        if(memo[n][k] > 0) return memo[n][k];
        if(k == 0 || n == k) return 1;
        return bonomial(n - 1, k - 1) + bonomial(n - 1, k);
    }
}
