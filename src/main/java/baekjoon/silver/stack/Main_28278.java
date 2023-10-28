package baekjoon.silver.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Thread.State;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * title : 스택 2
 * link : https://www.acmicpc.net/problem/28278
 */
public class Main_28278 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if(command == 1) {
                stack.push(number);
            } else if(command == 2) {
                if(stack.peek() > 0) {
                    System.out.println(stack.pop());
                } else {
                    System.out.println(-1);
                }    
            } else if(command == 3 ) {
                System.out.println(stack.size());
            } else if(command == 4 ) {
                if(stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(command == 5) {
                if(stack.peek() > 0) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
