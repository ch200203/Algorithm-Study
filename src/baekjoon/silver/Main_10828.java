package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828 {
    public static void main(String[] args) throws Exception {
        // 스택
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st; 

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String commmand = st.nextToken();

            if(commmand.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(commmand.equals("top")) {
                System.out.println(stack.peek());
            } else if(commmand.equals("size")) {
                System.out.println(stack.size());
            } else if(commmand.equals("empty")) {
                if(stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(commmand.equals("pop")) {
                System.out.println(stack.pop());
            }
        }
    }
}
