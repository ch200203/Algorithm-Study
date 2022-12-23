package inflearn.chapter8;

import java.util.Scanner;

/*
 * 순열 구하기
 * 10이하의 N개의 자연수가 주어 질 때, 이 중 M개를 뽑아 일렬로 
 * 나열하는 방법을 모두 출력하세요
 */
public class dfs_6 {
    static int n, m;
    static int[] pm, ch, arr;

    private static void DFS(int level) {
        if(level == m) {
            // 출력
            for(int i : pm) System.out.print(i + " ");
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1; // 사용여 arr의 부 체크배열의 i번째 원소를 사용해서 만들었다고 표기.
                    pm[level] = arr[i];
                    DFS(level + 1);
                    ch[i] = 0; // 사용후 해제
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        ch = new int[n];
        pm = new int[m];

        DFS(0);

        scan.close();
    }
}
