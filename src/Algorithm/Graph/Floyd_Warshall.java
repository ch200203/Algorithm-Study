package Algorithm.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 참고 : https://pangsblog.tistory.com/90
// https://www.acmicpc.net/problem/11404

// 플로이드 와셜 알고리즘

public class Floyd_Warshall {
	public static int cityCount = 0;
	public static int[][] distance;
    public static final int INF = 1000000000;
    
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        cityCount = Integer.parseInt(br.readLine());
        
        int busCount = Integer.parseInt(br.readLine());
        
        distance = new int[cityCount+1][cityCount+1];
        
        for(int i=1; i <= cityCount; i++) {
            for(int j=1; j <= cityCount; j++) {
                if(i == j) continue;
                distance[i][j] = INF;
            }
        }
        
        while(busCount-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            
            distance[start][end] = Math.min(distance[start][end], time);    
        }
 
        floydWarshall();
        print();
		
		
		
	}

}
