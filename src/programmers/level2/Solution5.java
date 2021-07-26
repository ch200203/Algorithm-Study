package programmers.level2;

import java.util.Arrays;

// 더 맵게
// https://programmers.co.kr/learn/courses/30/lessons/42626
//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
// Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때,
// 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수

public class Solution5 {
	public static void main(String[] args) {
		int [] scoville = {1,2,3,9,10,12};
		int K = 7;
		
		System.out.println(solution(K, scoville));
	
	}
	
	public static int solution(int K, int [] scoville){
		Arrays.sort(scoville);
		
		for (int i = 0; i < scoville.length; i++) {
			if(scoville[i] < K){
				scoville[i] = scoville[i] + (scoville[i + 1] * 2);
				
			}
		}
		return 0;
	}
	

}
