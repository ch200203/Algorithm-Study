package baekjoon.silver;

import java.util.Scanner;
import java.util.Stack;

// 스택문제
public class Main_1874 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scan.nextInt();

        Stack<Integer> stack = new Stack<>();
        
        int start = 0;

        while(N -- > 0) {
            int value = scan.nextInt();

            if(value > start) {
                //  start + 1부터 입력받은 value까지 수열을 push
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }

                start = value; // 다음 push 할때 오름차순을 위해서 변수를 초기화
            // top에 있는 원소가 입력받은 값과 같지 않은 경우
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return; // 프로그램 종료
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
