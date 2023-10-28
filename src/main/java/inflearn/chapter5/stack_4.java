package inflearn.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class stack_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }
    public static int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) stack.push(Integer.parseInt(String.valueOf(c)));
            else {
                int rt = stack.pop();           
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                if(c == '-') stack.push(lt - rt);
                if(c == '*') stack.push(lt * rt);
                if(c == '/') stack.push(lt / rt);
            }
        }

        answer = stack.get(0);
        return answer;
    }
}

