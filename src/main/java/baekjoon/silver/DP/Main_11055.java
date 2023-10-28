package baekjoon.silver.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11055 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i]  = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(N, arr));

    }

    private static int solution(int n, int[] arr) {
        int[] dp = new int[n];
        int max = 1;

        for(int i = 0; i < n    ; i++) {
            dp[i] = arr[i];
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            
            max = Math.max(max, dp[i]);
        }

        return max;
    }    
}
