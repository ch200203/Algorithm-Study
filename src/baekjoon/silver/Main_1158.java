package baekjoon.silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main_1158 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 0;
        while(!queue.isEmpty()) {
            int tmp = queue.poll();
            count++;
            if(count == k) {
                list.add(tmp);
                count = 0;
            }
            else {
                queue.offer(tmp);
            }       
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
            if(i != list.size() - 1) sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb.toString());

        scan.close();
    }
}