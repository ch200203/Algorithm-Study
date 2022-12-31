package inflearn.chapter8;

import java.util.Scanner;

/*
 * 수열 추측하기
 * n 
 * n-1C0 + n-1C1 + n-1C2 ... n-1Cn-1 = f
 */
public class dfs_8 {
    static int[] b, p, ch;
    static int n, f;
    static boolean flag = false;
    int[][] dy = new int[35][35]; // 메모제이션 활용

    // 조합수 메모제이션으로 확인하는 방법
    private int combi(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
    private static void DFS(int level, int sum) {
        if(flag) return;
        if(level == n) {
            // 순열이 완성
            if(sum == f) {
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            // i는 순열을 만드는 숫자
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1; // i를 사용했는지 확인
                    p[level] = i;
                    DFS(level + 1, sum + (p[level]) * b[level]);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        dfs_8 T = new dfs_8();

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        f = scan.nextInt();

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; // ch 배열의 인덱스를 1부터 사용해야하기 때문에 크기가 n+1 임
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }
        
        DFS(0, 0);

        scan.close();
    }


}