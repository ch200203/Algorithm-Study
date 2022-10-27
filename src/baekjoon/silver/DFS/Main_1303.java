package baekjoon.silver.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1303 {
    static int n ,m, count;
    static char[][] map;
    static boolean[][] visit;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 가로크기
        int m = Integer.parseInt(st.nextToken()); // 세로크기

        map = new char[m][n];
        visit = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int white = 0;
        int black = 0;

        // DFS 구현
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                // 최초 값 방문처리
                // visit[i][j] = true; 
                // 가장 처음의 값 등록
                char color = map[i][j];
                count = 0;
                DFS(j, i, color);

                if(color == 'W') white += Math.pow(count, 2);
                else black += Math.pow(count, 2);
            }
        }

        System.out.println(white + " " + black);
    }

    //  DFS 구현
    private static void DFS(int x, int y, char color) {
        // 방문처리
        visit[y][x] = true;
        // 모인 수 많큼 count 증가
        count += 1;
        
        for(int i = 0; i < 4; i++) {
            int now_x = x + dx[i];
            int now_y = y + dy[i];

            // 범위를 벗어나지 않고, 색이 같으며, 방문하지 않았던 병사일 경우
            if(chkRange(now_x, now_y) && map[now_y][now_x] == color && visit[now_y][now_x] == false) {
                // 계속해서 탐색을 진행한다.
                DFS(now_x, now_y, map[now_y][now_x]);
            }
        }
        
    }
    /**
     * 상하좌우 확인하여 결과값 리턴
     * @param x 현재 방문한 x 좌표
     * @param y 현재 방문한 y 좌표
     * @return {boolean}
     */
    private static boolean chkRange(int x, int y) {
        return (x >=0 && x < m && y >= 0 && y < n);
    }
}
