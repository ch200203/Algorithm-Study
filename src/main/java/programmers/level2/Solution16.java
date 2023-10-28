package programmers.level2;

import java.util.Stack;

// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
// Stack 문제풀이
public class Solution16 {
    public static void main(String[] args) {
        String str = "(())()"; // "()()" = true , "(())()" = true , ")()(" = false
        System.out.println(solution(str));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();


        if(s.length() % 2 != 0) return false;
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}
