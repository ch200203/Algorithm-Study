package programmers.level3.greedy;

import java.util.LinkedList;
import java.util.Queue;

public class solution1_1 {
	public static void main(String[] args) {
		int n =  16; //11;
		int [] stations = {9}; //{4, 11};
		int w = 2; //1;
		
		System.out.println(solution(n, stations, w));
	}
	
	public static int solution(int n, int[] stations, int w){
		int cnt = 0;
	
		Queue<Integer> sq = new LinkedList<>();
		for (int s : stations) sq.offer(s);
		
		int position = 1;
		while(position <= n) {
			if(!sq.isEmpty() && sq.peek() - w  <= position) {
				position = sq.poll() + w + 1; // 오른 쪽 끝 다음 위치
			} else {
				cnt += 1; // 기지죽 추가
				position += w * 2 + 1; // 전파 범위 만큼 이동
			}
		}
		
		return cnt;
	}
	
	
	// 효율성 증가 Queue 를 사용하지 않고 품
	public static int soltion2 (int n, int[] stations, int w) {
		int cnt = 0;
		
		int stationIndex = 0;
		
		int position = 1;
		while(position <= n) {
			if(stationIndex < stations.length && stations[stationIndex] - w <= position) {
				position = stations[stationIndex] + w + 1; // 오른 쪽 끝 다음 위치
				stationIndex += 1;
			} else {
				cnt += 1; // 기지죽 추가
				position += w * 2 + 1; // 전파 범위 만큼 이동
			}
		}
		
		return cnt;
	}
}
