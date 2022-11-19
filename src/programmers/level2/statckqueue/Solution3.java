package programmers.level2.statckqueue;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 프린터
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Solution3 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        // int[] priorities = {1, 1, 9, 1, 1, 1};

        int location = 2;
        // int location = 0;

        System.out.println(solution(priorities, location));
        // 1, 5
    }

    // 우선순위 큐 이용
    private static int solution(int[] priorities, int location) {
        int answer = 0;
    
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i : priorities) priorityQueue.add(i);

        while(!priorityQueue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == priorityQueue.peek()) {
                    if(i == location) {
                        answer++;
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        
        return -1;
    }

    // Queue 이용
    private static int solution_2(int[] priorities, int location) {
        Queue<Print> queue = new LinkedList<>();
        int answer = 0;
        for (int i : priorities) queue.offer(new Print(location, priorities[i]));

        while(!queue.isEmpty()) {
            int tmp = queue.peek().value;

            boolean flag = false;

            for(Print print : queue) {
                if(print.value > tmp) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                Print temp = queue.poll();
                queue.offer(temp);
            } else {
                answer++;
                Print print = queue.poll();

                if(print.index == location)  return answer;
            }
        }

        return answer;
    }

}

class Print {
    int index;
    int value;

    public Print(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
