package baekjoon.silver.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 회의실 배정
 * https://www.acmicpc.net/problem/1931
 */
public class Main_1931 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            arr[i][0] = startTime;
            arr[i][1] = endTime;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) 
                return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        // System.out.println(Arrays.deepToString(arr));

        int answer = 0;
        int lastTime = 0;

        for (int i = 0; i < N; i++) {
            // 회의실 시작 시작이 마지막 사용시간 보다 큰 경우.
            if(arr[i][0] >= lastTime) {
                lastTime = arr[i][1];
                answer++;
            }
        }

        System.out.println(answer);

    }   
}