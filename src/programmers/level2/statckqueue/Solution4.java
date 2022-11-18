package programmers.level2.statckqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 괄호 회전하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76502
 */
public class Solution4 {
    public static void main(String[] args) {
        String str = "[](){}";
        System.out.println(solution(str));
    }

    private static int solution(String str ) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '[') {
                stack.add('[');
            }
        }

        


        return answer;
    }
}
