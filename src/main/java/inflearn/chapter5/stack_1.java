package inflearn.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class stack_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        solution(str);
    }
    public static void solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    System.exit(0);
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
