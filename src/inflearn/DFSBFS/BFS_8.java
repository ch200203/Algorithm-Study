package inflearn.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_8 {
    static int answer = 0;
    static int[] dis = {1, -1, 5};
    static boolean [] visit;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println(solution(n, m));

        scan.close();
    }

    public static int solution(int n, int m) {
        visit = new boolean[10001];
        visit[n] = true;
        queue.offer(n);
        int L = 0; // 레벨 = 횟수
        while(!queue.isEmpty()) {
            int len = queue.size(); // 레벨마다 들어가 있는 노드의 갯수
            for (int i = 0; i < len; i++) {
                int x = queue.poll();            
                for (int j : dis) {
                    int nx = x + j;
                    if(nx == m) return L + 1;
                    if(nx >= 1 && nx <= 10000 && visit[nx] == false) {
                        visit[nx] = true;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }

        return answer;
    }
}
