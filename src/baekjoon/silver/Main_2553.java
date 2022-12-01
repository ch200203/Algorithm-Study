package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 풀이 참고링크
 * https://steady-coding.tistory.com/322
 */
public class Main_2553 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N, tmp, dp[];

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        /*
         * 
         * 15!
            = ( 1 x 2 x 3 x 4 x 5) x (6 x 7 x 8 x 9 x 10) x (11 x 12 x 13 x 14 x 15)

            5의 배수를 앞으로 모아줌
            = (5 x 10 x 15) x (1 x 2 x 3 x 4) x (6 x 7 x 8 x 9) x (11 x 12 x 13 x 14)
         * 
         * 
         */

        // 2^n digit : 2 4 6 8 ...
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 6;
        dp[4] = 4;

        for(int i = 5; i <= N; i++) {
            if(i % 5 == 0) {
                tmp = i / 5;
                dp[i] = (dp[tmp] * (int)Math.pow(2, tmp % 4)) % 10;
            } else {
                tmp = (i / 5) * 5;
                dp[i] = dp[tmp];
                
                for(int j = tmp + 1; j <= i; j++) {
                    dp[i] = dp[i] * j % 10;
                }
            }
        }

        System.out.println(dp[N]);
    }
}
