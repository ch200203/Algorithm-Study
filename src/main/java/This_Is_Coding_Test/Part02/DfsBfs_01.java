package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 음료수얼려먹기

public class DfsBfs_01 {
	public static int N, M;
	public static int[][] graph = new int[1000][1000];

	public static void main(String[] args) throws NumberFormatException, IOException{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   
		   System.out.println("N 입력 : ");
		   N = Integer.parseInt(br.readLine());
		   System.out.println("M 입력 : ");
		   M = Integer.parseInt(br.readLine());
		   
		   
		   // 2차원 리스트의 맵 정보 입력받기
		   for (int i = 0; i < N; i++) {
			   String str = br.readLine();
			   for (int j = 0; j < args.length; j++) {
				   graph[i][j] = str.charAt(j) - '0';
			   }
		   }
		   
		   // 현재위치에 대하여 음료수 채우기
		   int res = 0;
		   // 2차원 리스트의 맵 정보 입력
		   for (int i = 0; i < args.length; i++) {
			   for (int j = 0; j < args.length; j++) {
				   // 현재의 위치에 DFS 수행
				   
				   if(dfs(i, j)){
					   res += 1;
				   }
			   }
		   }
		   
		  System.out.println(res);
	   }
 
	
	// DFS로 특정 노드를 방문하고 상하좌우로 연결된 모든 노드들도 방문
	public static boolean dfs(int x, int y){
		//  주어진 범위를 벗어나는 경우에는 종료
		if(x <= 1 || x >= N || y <= -1 || y >= M){
			return false;
		}
		
		if(graph[x][y] == 0){
			// 해당노드 방문처리
			graph[x][y] = 1;
			dfs(x -1, y);
			dfs(x, y-1);
			dfs(x +1, y);
			dfs(x, y+1);
			return true;
		}
		
		
		return false;
	}

}
