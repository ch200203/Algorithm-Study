package Algorithm.Graph;

import java.util.Iterator;
import java.util.Scanner;

// 다익스트라 알고리즘
// 참고 : https://blog.naver.com/PostView.naver?blogId=ndb796&logNo=221234424646&redirect=Dlog&widgetTypeCall=true&directAccess=false
// 참고 2 : https://gaybee.tistory.com/34
// 참고 3 : https://gomgomkim.tistory.com/19

/*
 * 노드의 개수를 V라고 할 때 인접 행렬 방식은 O( V^2 ) 우선순위 큐 방식은 O( V log V ) 의 시간 복잡도를 가짐
*/
public class Dijkstra {
	public static void main(String[] args) {
		// 1. 인접행렬 방식
		
		
		
	}
}

class Dijkstra_Graph {
	private int n; // 노드의 수
	private int maps [][]; // 노드들간의 가중치 저장 변수
	
	public void Graph(int n) {
		this.n = n;
		maps = new int [n][n];

		// 인접행렬 값을 무한대로 초기화
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				maps[i][j] = Integer.MAX_VALUE;
			}
		}
	}
	
	
	// 인접행렬에 가중치 넣기
	public void input(int i, int j, int w) {
		maps[i][j] = w;
		maps[j][i] = w;
	}

	// 다익스트라 알고리즘 구현
	public void dijkstra_solution(int v) {
		int distance[] = new int [n]; // 최단거리를 저장할 변수
		boolean[] check = new boolean[n]; // 해당노드를 방문했는지 체크할 변수
		
		// distance 값 초기화, 무한대를 int 자료형의 최대값으로 구현
		for (int i = 0; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		// 시작노드값 초기화
		distance[v] = 0;
		check[v] = true;
		
		// 결과값 출력
		for (int i = 0; i < n; i++) {
			if(distance[i] == 2147483647) System.out.println("무한");
			else System.out.println(distance[i] + " ");
		}
		System.out.println("");
		
		// 연결노드 distance 갱신하기
		for (int i = 0; i < n; i++) {
			if(!check[i] && maps[v][i] != Integer.MAX_VALUE) {
				distance[i] = maps[v][i];
			}
		}
		
		// 결과 값 출력
	
	}

		
}