package baekjoon.silver.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Combination and DP Solve
public class Main_1010 {

        // Memozation 메모제이션
        static int[][] dp = new int[30][30];
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
    
            
    
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();
    
            for (int i = 0; i < t; i++) {
                st = new StringTokenizer(br.readLine());
                // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
                int n = Integer.parseInt(st.nextToken()); // r
                int m = Integer.parseInt(st.nextToken()); // n
    
                sb.append(combi(m, n)).append("\n");
            }
    
            System.out.println(sb.toString());
        }
    
        // recursion 재귀
        private static int combi(int n, int r) {
            
            if(dp[n][r] > 0) return dp[n][r];
    
            if(n == r || r == 0) return dp[n][r] = 1;
    
            // n+1Cr+1 = nCr + nCr+1;
            return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
}
