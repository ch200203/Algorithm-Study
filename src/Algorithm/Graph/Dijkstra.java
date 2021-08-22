package Algorithm.Graph;

import java.util.Iterator;
import java.util.PriorityQueue;
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
		
		Dijkstra_Graph dg = new Dijkstra_Graph();
		dg.Graph(6); // 노드수만큼 그래프 생성

		// 시작, 끝 , 간선 가중치
		
		dg.input(0, 1, 7);
		dg.input(0, 2, 9);
		dg.input(0, 5, 14);
		dg.input(1, 2, 10);
		dg.input(1, 3, 15);
		dg.input(2, 3, 11);
		dg.input(2, 5, 2);
		dg.input(3, 4, 6);
		dg.input(4, 5, 9);
		// 1. 인접행렬 방식
		
		dg.dijkstra_solution(0);
	
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
			if(distance[i] == 2147483647) System.out.print("무한 ");
			else System.out.print(distance[i] + " ");
		}
		System.out.println("");
		
		// 연결노드 distance 갱신하기
		for (int i = 0; i < n; i++) {
			if(!check[i] && maps[v][i] != Integer.MAX_VALUE) {
				distance[i] = maps[v][i];
			}
		}
		
		// 결과 값 출력
		System.out.println(" 결과출력 2");
		for (int i = 0; i < n; i++) {
			if(distance[i] == 2147483647) System.out.print("무한 ");
			else System.out.print(distance[i] + " ");
		}
		System.out.println("");

		for (int a = 0; a < n-1; a++) {
			// 원래는 모든 노드가 true될때까지 인데 
			// 노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다. 
			// 원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
			
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			// Node의 최솟값
			for (int i = 0; i < n; i++) {
				if(!check[i]){
					if(distance[i] < min){
						min = distance[i];
						min_index = i;
					}
				}
			}
			
			// 다른 노드를 거쳣서 가는 것이 비용이 더적은지 검증
			
			check[min_index] = true;
			for (int i = 0; i < n; i++) {
				if(!check[i] && maps[min_index][i] != Integer.MAX_VALUE){
					if(distance[min_index] + maps[min_index][i] < distance[i]){
						distance[i]  = distance[min_index] + maps[min_index][i];
					}
				}
			}
			
			// 결과 값 출력
			System.out.println(" 결과출력 3");
			for (int i = 0; i < n; i++) {
				if(distance[i] == 2147483647) System.out.print("무한 ");
				else System.out.print(distance[i] + " ");
			}
			System.out.println("");

		}	
	}
}


// 2. 우선순위 큐 방식

// 노드 클래스 선언 및 노드까지의 가중치와 인덱스를 객체로 선언
// 가중치를 기준으로 Compareable을 선언하여 우선순위 큐를 판단

class Dijkstra_Graph2{
	private int n; // 노드 수
	private int maps[][]; // 노드들간의 가중치 저장할 변수
	
	public void Graph(int n){
		this.n = n;
		maps = new int [n][n];
		
		// 인접 행렬의 모든 값은 무한대로 초기화 시킴
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				maps[i][j] = Integer.MAX_VALUE;
			}
		}
	}
	
	class Node implements Comparable<Node> {
		private int weight;
		private int index;
		
		public Node(int weight, int index){
			this.weight = weight;
			this.index = index;
		}

		@Override
		public int compareTo(Node node) {
			return Integer.compare(this.weight, node.weight);
		}
	}
	
	public void input(int i, int j, int w){
		maps[i][j] = w;
		maps[j][i] = w;
	}
	
	public void dikstra__solution2(int v) {
		PriorityQueue<Node> que = new PriorityQueue<>(); // 노드까지의 거리를 저장할 우선순위 큐
		int distance[] = new int[n]; // 최단 거리를 저장할 변수
		boolean [] check = new boolean[n]; // 해당 노드를 방문했는지 체크 할 변수
		
		// distance 값 초기화, 무한대 = int의 최대값
		for (int i = 0; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		// 시작 노드값 초기화
		que.add(new Node(v, 0));
		distance[v] = 0;
		check[v] = true;
	}
}


