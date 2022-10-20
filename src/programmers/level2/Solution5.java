package programmers.level2;

import java.util.PriorityQueue;

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
	
/*	public static int solution(int K, int [] scoville){
		Arrays.sort(scoville);
		
		for (int i = 0; i < scoville.length; i++) {
			if(scoville[i] < K){
				scoville[i] = scoville[i] + (scoville[i + 1] * 2);
				
				for (int j = 0; j < scoville.length; j++) {
					
				}
			}
		}
		int res = 0;
		
		return res;
	}*/
	
	public static int solution(int K, int [] scoville){
		int answer = 0;
		
		PriorityQueue<Integer> heap = new PriorityQueue();
		
		/*일반적으로 큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로 스택과는 다르게
		FIFO(First In First Out)의
		구조 즉 먼저 들어온 데이터가 먼저 나가는 구조를 가집니다*/

        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }
        
        while (heap.peek() < K) {
        	if(heap.size() == 1){
        		return -1;
        	}
        	
        	int a = heap.poll(); // // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
        	int b = heap.poll();
        	
        	int res = a + (b * 2);
        	
        	heap.offer(res);
        	answer++;
			
		}
        
        return answer;

	}
	

}
