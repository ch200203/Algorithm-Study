package Algorithm.Graph;

public class DfsGraph {
	private static int nE;
	private static int nV; // 정점의 개수
	private static int [][] ad;
	private static boolean[] visit; // 방문한 노드 체크
	
	public static void main(String[] args) {
		
	}
	
	// 그래프(인접행렬)
	public static void dfs1(int i) {
		visit[i] = true; // 함수를 호출 했을 시, 방문함을 체크
		System.out.println(i + " ");
		
		for (int j = 0; j < ad.length; j++) {
			if(ad[i][j] == 1 && visit[j] == false){
				// j 가 visit이 false 일 시 j노드를 방문
				
			}
		}
		
		
	}
	
	// 그래프 (인접 리스트)
	public static void dfs2(){
		
	}
}
