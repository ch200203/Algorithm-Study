package inflearn.chapter8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class dfs_5 {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] coins;

    public static void DFS(int counts, int sum) {
        // 현재 사용된 동전의 갯수보다 더 많은 코인을 사용한 경우 return
        if(sum > m) return;
        if(counts >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, counts);
        } else {
            for(int i = 0; i < n; i++) {
                DFS(counts + 1, sum + coins[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        coins = new Integer[n]; // ReverseOrder를 사용하기 위해서는 'Intger'를 사용해야함
        for (int i = 0; i < n; i++) coins[i] = scan.nextInt();
        m = scan.nextInt();

        // 큰 숫자부터 탐색하여 탐색 시간을 줄임
        Arrays.sort(coins, Collections.reverseOrder());
        DFS(0, 0);

        System.out.println(answer);

        scan.close();
    }
}