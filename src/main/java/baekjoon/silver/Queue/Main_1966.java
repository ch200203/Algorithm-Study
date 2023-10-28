package baekjoon.silver.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1966 {

    /*
        내가 풀어서 틀린 코드
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int numSize = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            PriorityQueue<Printer> queue = new PriorityQueue<>(
                Comparator.comparingInt(p -> -p.prior));

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numSize; j++) {
                int prior = Integer.parseInt(st.nextToken());

                Printer printer = new Printer(j, prior);
                queue.add(printer);
            }

            int cnt = 1;

            while (!queue.isEmpty()) {
                Printer printer = queue.poll();
                if (printer.index == target) {
                    break;
                }
                cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }


    /*
        정답 코드
     */
    private void solution() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                int importance = sc.nextInt();
                queue.offer(new int[]{i, importance});
                maxHeap.offer(importance);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                if (current[1] == maxHeap.peek()) {
                    count++;
                    maxHeap.poll();
                    if (current[0] == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }
        sc.close();
    }
}

class Printer {

    int index;
    int prior;

    public Printer(int index, int prior) {
        this.index = index;
        this.prior = prior;
    }
}
