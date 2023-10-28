package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 부분수열의 합
 * https://www.acmicpc.net/problem/1182
 * Silver2
 * 
 * 백트래킹
 */
public class Main_1182 {
    private static int[] arr;
    private static int N; // 배열의 원소 갯수
    private static int S; // 정수의 합
    private static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        arr = new int[N];

        for(int i=0 ; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }   

        dfs(0, 0);

        /**
         * 정수의 합이 0인 경우 공집합도 포함되므로 -1을 해주어야 합니다.
         */
        if(S == 0) System.out.println(answer - 1);
        else System.out.println(answer);
    }

    private static void dfs(int depth, int sum) {
        if(depth == N) { // 부분집합을 완성
            if(sum == S) answer++; // 완성한 합이 S에 부합하는지 확인
            return;
        }
        
        // 부분수열
        dfs(depth + 1, sum + arr[depth]); 
        dfs(depth + 1, sum);
    }
}
