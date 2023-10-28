package programmers.level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution28 {

    /**
     * 더 맵게
     * programmers : https://school.programmers.co.kr/learn/courses/30/lessons/42626
     * Algorithm : Heap(Priority Queue)
     */
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 2;

        System.out.println(solution(scoville, K));
    }

    private static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int hot : scoville) {
            priorityQueue.offer(hot);
        }

        int answer = 0;

        while(priorityQueue.peek() < K) {
            if(priorityQueue.size() == 1) {
                return -1;
            }
            priorityQueue.add(priorityQueue.poll() + (priorityQueue.poll() * 2));
            answer++;
        }

        return answer;
    }

}
