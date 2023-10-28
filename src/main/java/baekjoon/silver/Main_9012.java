package baekjoon.silver;

import java.util.Scanner;
import java.util.Stack;

public class Main_9012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            String str = scan.next();
            System.out.println(solution(str));
        }

        scan.close();
    }

    public static String solution(String str) {
        if(str.length() % 2 != 0) return "NO";

        Stack<Character> stack = new Stack<>();
        stack.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if(!stack.isEmpty() && str.charAt(i) == ')') {
                if(stack.peek() == '(') stack.pop();
            } else {
                stack.add(str.charAt(i));
            }
        }
        if(stack.isEmpty()) return "YES";

        return "NO";
    }


}