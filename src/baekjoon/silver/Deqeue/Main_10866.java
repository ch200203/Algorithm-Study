package baekjoon.silver.Deqeue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_10866 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = 0;
            if(st.countTokens() > 0) x = Integer.parseInt(st.nextToken());

            if(command.equals("push_front")) {
                deque.addFirst(x);
            } else if(command.equals("push_back")) {
                deque.addLast(x);
            } else if(command.equals("pop_front")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.pollFirst());
            } else if(command.equals("pop_back")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.pollLast());
            } else if(command.equals("size")) {
                System.out.println(deque.size());
            } else if(command.equals("empty")) {
                if(deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if(command.equals("front")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.peekFirst());
            } else if(command.equals("back")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.peekLast());
            }
        }
    }
}
