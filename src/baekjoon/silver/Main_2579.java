package baekjoon.silver;

import java.util.Scanner;


// 참고 https://st-lab.tistory.com/132
// 재귀(Top - Down 방식)
public class Main_2579 {
    static Integer dp [];
    static int arr[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        
        dp = new Integer[N + 1];
        arr = new int[N + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        dp[0] = arr[0]; // 디폴트값이 null이므로 0으로 초기화 해주어야한다.
        dp[1] = arr[1];

        if( N >= 2){
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(N));
    }   

    public static int find(int N) {
        if(dp[N] == null) {
			dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
		}
		
		return dp[N];
    }
}
