package inflearn.DFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

// 방향그래프의 경로 탐색 인접 리스트
public class DFS_13 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int visit[];

    private static void DFS(int v) {
        if(v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if(visit[nv] == 0) {
                    visit[nv] = 1;
                    DFS(nv);
                    visit[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        visit = new int[n+1];
        
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }

        visit[1] = 1;
        DFS(1);
        System.out.println(answer);
        scan.close();
    }
}
