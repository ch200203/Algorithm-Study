package inflearn.DFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리 탐색 => BFS로 탐색이 효율적임
public class BFS_13 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] dis, visit;
    
    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visit[v] = 1;
        dis[v] = 0;
        queue.offer(v); // 1번 정점 할당
        while(!queue.isEmpty()) {
            // 가장 최근의 간선 
            int cv = queue.poll();
            for (int nv : graph.get(v)) {
                // 방문여부 확인
                if(visit[nv] == 0) {
                    visit[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        visit = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            graph.get(a).add(b);
        }

        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.print(i + " " + dis[i]);
        }

        scan.close();
        
    }
    
}
