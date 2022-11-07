package programmers.level2;

import java.util.Arrays;

/**
 * level2 피로도
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */
public class Solution17 {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{30,10},{50,40}};

        System.out.println(solution(k, dungeons));
    }

    private static boolean[] visited;
    private static int answer = 0;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);
        return answer;
    }
    
    private static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }
}
