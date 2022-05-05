package baekjoon.silver;

import java.util.*;
import java.io.*;

public class Main_1003 {
    static Integer [][] dp = new Integer[41][2];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T --> 0) {
            int N = Integer.parseInt(br.readLine());
            fibo(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append("\n");
        }

        System.out.println(sb);

    }
    // 메모제이션 활용
    static Integer[] fibo(int N) {
        // N에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
        if(dp[N][0] == null || dp[N][1] == null) {
            // 각 N에 대한 0 호출 횟수와 1호출 횟수를 재귀호출.
            dp[N][0] = fibo(N - 1)[0] + fibo(N - 2)[0];
            dp[N][1] = fibo(N - 1)[1] + fibo(N - 2)[1];
        }

        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
		return dp[N];
    }
}
