package baekjoon.silver;

import java.util.Scanner;

/**
 * 자연수 N과 M이 주어졌을 때, 
 * 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 고른 수열은 오름차순이어야 한다.
 */
public class Main_15650 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        
        arr = new int[m];
        visit = new boolean[n];
    }

    public static void solution(int n, int m) {
        dfs(1, 0);
    }
    public static void dfs(int at, int depth) {

        // 깊이가 M 이랑 같을 경우 출력
        if(depth == m) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        /*
         * 재귀하면서 백트래킹 할 반복문 구현
         */
        for(int i = at; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}