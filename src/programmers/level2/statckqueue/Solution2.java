package programmers.level2.statckqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack/Queue
 * 다리를 지나는 트럭
 * https://school.programmers.co.kr/learn/courses/30/lessons/42583
 */
public class Solution2 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        
        System.out.println(solution(bridge_length, weight, truck_weights));
        // return 8;
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0, sum = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int truck : truck_weights) {
            while(true) {
                if(queue.isEmpty()) { // 다리위에 트럭이 없는 경우
                    queue.add(truck);
                    sum += truck;
                    time++; // 다리에 진입 할때 시간 추가
                    break;
                } else if(queue.size() == bridge_length) {
                    // 다리에 트럭이 가득찬 경우
                    sum -= queue.poll();
                } else { // 다리위에 트럭이 있는 경우
                    if(sum + truck <=  weight) { 
                        // 다음 트럭이 올라가도 다리 무게에 여유가 있는 경우
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        // 다음 트럭이 올라왔을 때 여유가 없는 경우
                        queue.add(0);
                        time++;
                    }
                }    
            }
        }
        // 마지막 남은 트럭들이 지나가야 하기 떄문에 다리길이 만큼 추가.
        return time + bridge_length;
    }
    
}
