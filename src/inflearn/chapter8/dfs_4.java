package inflearn.chapter8;

import java.util.Scanner;

/**
 * 중복순열 구하기
 * 1 ~ N 까지의 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아
 * 일렬로 나열하는 방법을 모두 출력합니다.
 */
public class dfs_4 {
    static int[] pm;
    static int n, m;
    public static void DFS(int level) {
        if(level == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pm = new int[m];

        DFS(0);

        scan.close();
    }
}
