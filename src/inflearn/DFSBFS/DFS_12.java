package inflearn.DFSBFS;

import java.util.Scanner;

// 방향 그래프의 경로 탐색(인접행렬 풀이)
public class DFS_12 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] visit;

    private static void DFS(int v) {
        if(v == n) answer++;
        else {
            for(int i = 1; i <= n; i++) {
                // 선택한 정점에서 다른 정점으로 이동가능한 경로 확인 + 방문여부 확인
                if(graph[v][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    DFS(i);
                    visit[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); // 정점의 갯수
        m = scan.nextInt(); // 간선의 갯수수

        graph = new int[n+1][n+1]; // 1번 인덱스 부터  n번까지 생성되야 하기 떄문에 n + 1로 생성
        visit = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b] = 1; // 방향그래프 생성
        }
        
        visit[1] = 1;
        DFS(1);
        System.out.println(answer);

        scan.close();
    }

}
