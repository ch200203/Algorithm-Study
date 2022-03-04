package programmers.level3.greedy;

import java.util.Arrays;

// 1. 기지국 설치
//https://programmers.co.kr/learn/courses/10302/lessons/62946

public class solution1 {
	public static void main(String[] args) {
		int n =  16; //11;
		int [] stations = {9}; //{4, 11};
		int w = 2; //1;
		solution(n, stations, w);
	}
	
	public static int solution(int n, int[] stations, int w) {
		boolean visited [] = new boolean[n];
		Arrays.fill(visited, false);
		int cnt = 0;
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < stations.length; j++) {
				if(i == stations[j]) {
					visited[i -1] = true;
					for (int k = 1; k <= w; k++) {
						if(i == 1 ) continue;
						visited[i - 1 - k] = true;
						if(i == n ) continue;
						visited[i - 1 + k] = true;
					}
				}
			}
		}
		System.out.println(Arrays.toString(visited));
		
		for (int i = 0; i < visited.length; i++) {
			if(visited[i] == false) {
				System.out.println("i :: " + i);
				visited[i] = true;
				for (int k = 1; k <= w; k++) {
					if(i + k == visited.length ) continue;
					visited[i + k] = true;
					if(i == 0) continue;
					visited[i - k] = true;
				}
				cnt++;
			}
			System.out.println(Arrays.toString(visited));
		}
	
		System.out.println(Arrays.toString(visited));
		System.out.println(cnt);
		
		return 0;
	}

}
