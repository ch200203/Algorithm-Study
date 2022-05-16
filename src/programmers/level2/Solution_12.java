package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 기능개발 / 스택 / 큐
// https://programmers.co.kr/learn/courses/30/lessons/42586
// 풀이참고 : https://techhan.github.io/algorithm/programmers-55/
public class Solution_12 {
    public static void main(String[] args) {
        int[] progresses =  {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(solution(progresses, speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> aList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i]; // 남은 작업
            int date = (int) Math.ceil(remain); // 남은 작업일수 

            if(!queue.isEmpty() && queue.peek() < date) {
                aList.add(queue.size());
                queue.clear();
            }

            queue.offer(date);
        }

        aList.add(queue.size());
        
        int[] answer = new int[aList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = aList.get(i);
        }

        return answer;
    }
}