package baekjoon.Bronze;

import java.util.Scanner;

public class Main_9095 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 테스트 케이스 갯수

        int [] dp = new int [11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            for (int j = 4; j <= num; j++) {
                dp[j] = dp[j-1] + dp[j -2] + dp [j-3];
            }
            System.out.println(dp[num]);
        }

        // 점화식 N의 경우의 수 = nums[N - 1] + nums[N - 2] + nums[N - 3];
        
        scan.close();
    }
}
