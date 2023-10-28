package inflearn.chapter8;

import java.util.Scanner;

/**
 * 조합수 구하기
 * 1 ~ N 까지의 번호가 적힌 구슬 있습니다
 * 이 중 M 개를 뽑는 정답의 수를 구하는 프로그램을 작성하세요
 * N(3<=N<=10), M(2<=M<=N)
 */
public class dfs_9 {
    static int[] combi;
    static int n, m;
    /**
     * @param L level
     * @param s start index
     */
    private static void DFS(int L, int s) {
        if(L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = s; i <= n; i ++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        combi = new int[m];
        
        DFS(0, 1);

        scan.close();
    }
}
