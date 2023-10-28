package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_10845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int last = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "pop" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.poll()); 
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;   
                case "empty" :
                    if(queue.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.peek());
                    break;
                case "back" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(last);
                    break;
            }
        }
    }
}
