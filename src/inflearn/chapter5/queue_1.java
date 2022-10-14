package inflearn.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println(solution(n, m));
    }

    public static int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) queue.offer(i);

        while(!queue.isEmpty()) {
            for (int i = 1; i < m; i++)  queue.offer(queue.poll());
            // m을 외친 사람 제외
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }


        return answer;
    }
}
