
package baekjoon.silver.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2491 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arr));
    }

    private static int solution(int n, int[] arr) {
        int max = 1, in_count = 1, de_count = 1;
        
        // 증가하는 수열 
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] <= arr[i + 1]) in_count++;
            else in_count = 1;
            
            max = Math.max(max, in_count);
        }

        // 감소하는 수열의 경우
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] >= arr[i+1]) de_count++;
            else de_count = 1;
            max = Math.max(max, de_count);
        }

        return max;
    }
}
