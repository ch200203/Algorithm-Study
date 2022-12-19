package inflearn.chapter8;

import java.util.Scanner;

public class dfs_3 {
    static int n, m, answer =0;
    static int[][] arr; // => 배열을 두개 사용해도 괜찮음
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        
        dfs(0, 0, 0);

        System.out.println(answer);

        scan.close();

    }

    private static void dfs(int time, int sum, int level) {
        if(time > m) return;
        if(level == n) answer = Math.max(answer, sum);
        else {
            dfs(time + arr[level][1], sum + arr[level][0], level + 1);
            dfs(time, sum, level + 1);
        }
    }
}
