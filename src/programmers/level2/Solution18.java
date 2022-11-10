package programmers.level2;

import java.util.Stack;

public class Solution18 {
    public static void main(String[] args) {
        int[] order = {4, 3, 1, 2, 5};
        System.out.print(solution(order));
    }

    public static int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        int box = 1;
        int orderIndex = 0;

        while(true) {
            if(!stack.isEmpty() && order[orderIndex] == stack.peek()) {
                answer++;
                orderIndex++;
                stack.pop();

                continue;
            }

            if(box > order.length ) break;

            if(order[orderIndex] == box) {
                answer++;
                box++;
                orderIndex++;
                
                continue;
            }

            stack.push(box);
            box++;
        }

        return answer;
    }
}
