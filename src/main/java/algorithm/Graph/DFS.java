package algorithm.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// 1. DFS 복습
// 2. 리스트로 구현
public class DFS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v = scan.nextInt(); // 정점(vertex)의 개수
        int e = scan.nextInt(); // 간선(Edge)의 개수
        int n = scan.nextInt(); // 탐색을 시작한 정점(= 노드)의 번호

        boolean[] visited = new boolean[v + 1]; // 방문여부 확인용 배열

        LinkedList<Integer>[] adjList = new LinkedList[v + 1];

        for (int i = 0; i <= v; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
    }
    // 재귀로 구현
    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		visited[v] = true; // 정점 방문 표시
		System.out.print(v + " "); // 정점 출력

		Iterator<Integer> iter = adjList[v].listIterator(); // 정점 인접리스트 순회
		while (iter.hasNext()) {
			int w = iter.next();
			if (!visited[w]) // 방문하지 않은 정점이라면 
				dfs_list(w, adjList, visited); // 다시 DFS
		}
	}
    
}
