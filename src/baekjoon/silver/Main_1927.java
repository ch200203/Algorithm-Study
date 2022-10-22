package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

// 우선순위 큐(PriorityQueue)를 통한 최소 힙
// PriorityQueue => 일반적은 큐와 다르게 우선순위에 따라 Top이 정렬됨.
public class Main_1927 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if(x == 0) {
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            } 
            else if(x > 0) queue.add(x);
            System.out.println(queue.toString());
        }
        scan.close();


    }
    // bufferedReader 구현
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            } 
            else if(x > 0) queue.add(x);
        }
    }

    
}
