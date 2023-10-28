package inflearn.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String need = scan.next();
        String plan = scan.next();

        System.out.println(solution(need, plan));
    }

    public static String solution(String need, String plan) {
        String answer = "YES";

        // 필수과목
        Queue<Character> queue = new LinkedList<>();
        for (char c : need.toCharArray()) queue.offer(c);

        for (char x : plan.toCharArray()) {
            if(queue.contains(x)) {
                // 필수과목이 없는 경우
                if(x != queue.poll()) return "NO";
            }
        }

        if(!queue.isEmpty()) return "NO";

        return "YES";
    }
}
