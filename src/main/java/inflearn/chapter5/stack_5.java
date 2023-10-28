package inflearn.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class stack_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        
        System.out.println(solution(str));
        
    }
    
    public static int solution(String str) {
        int answer = 0;
        // 레이저의 기준 =>')' 앞의 원소가 '(' 일경우
        // 이 외는 모두 막대기
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }
    
        return answer;
    }

}
