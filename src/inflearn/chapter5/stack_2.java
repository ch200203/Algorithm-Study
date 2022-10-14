package inflearn.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class stack_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(c == ')') {
                while(stack.pop() != '(');
            } else stack.push(c);
        }

        for (char x : stack) {
            answer += x;
        }

        return answer;
    }
}
