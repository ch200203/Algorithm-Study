package algorithm.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 너비우선 탐색
public class BfsGraph {
	static int nV; // 정점의 수
	static int nE; // 간선의 수
	static int [][] arr2d; // 정점간 연결관계 저장배열
	static boolean [] check; // 방문한 정점 체크
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		nV = Integer.parseInt(br.readLine());
		nE = Integer.parseInt(br.readLine());
		
		arr2d = new int[nV + 1][nE + 1];
		check = new boolean [nV + 1];
		
		for (int i = 0; i < nE; i++) {
			int tmp1 = Integer.parseInt(br.readLine());
			int tmp2 = Integer.parseInt(br.readLine());
			
			arr2d[tmp1][tmp2] = arr2d[tmp1][tmp2] = 1;
			
			// 간선 연결관계 양방향 체크	
		}
		
		
		System.out.println("start Num ::: ");
		int start = Integer.parseInt(br.readLine());
		
		bfs(start);
		
		// 입력예제
		// 4 4
		// 1 2
		// 1 4
		// 2 3
		// 3 4
		
		// 1
		
		
	}
	
	public static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(i); // 시작지점에 큐를 넣는다

		while (!queue.isEmpty()) {
			// 모든 정점에 방문할때까지 반복
			int tmp = queue.poll();
			// 방문한 정점은 빼줌

			System.out.println("방문한 정점은 ::: " + tmp + " 입니다.");

			for (int j = 0; j < nV; j++) {
				if (arr2d[tmp][j] == 1 && check[j] == false) {
					// 현재정점에서 다음 j에 정점과 연결 되었는지 확인
					// 연결되었다면, 기존에 방문한 정점인지 확인

					queue.offer(j); // 모두 참인경우에만 큐에 삽입

					check[j] = true;
					// 큐에 들어가면 확정 방문 정점
					// 방문배열 체크

				}

			}

		}

	}

}
