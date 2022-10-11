package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 백트래킹 문제풀이 => DFS를 이용한 문제풀이

class Main_1459 {
    static int N; // 입력
    static int[][] map; // 조합 점수표
    static boolean[] visit = new boolean[N]; // 방문여부(해당 조합 확인 여부)
    static int Min = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0 ,0);
    }

    // idx는 인덱스, count는 조합 개수(= 재귀의 깊이)
    public static void solution(int idx, int count) {
        // Team 조합이 완성될 경우
        if(count == N / 2) {
            /*
             * 방문한 팀과 방문하지 않은 팀을 나누어
             * 각팀의 점수를 구한뒤 최솟값을 찾음.
             */
            diff();
            return;
        }
        
        // 방문 체크
        for (int i = idx; i < N; i++) {
            // 방문하지 않았다면?
            if(!visit[i]) {
                visit[i] = true; // 방문처리
                solution(i + 1, count + 1); // 1씩 증가시켜서 재귀 호출
                visit[i] = false; // 재귀가 끝나면 비방문으로 변경
            }
        }
        
    }

    //  팀의 능력치 차이를 계산하는 함수
    private static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // i 번째 사람과 j 번째 사람이 true 라면 => 스타트 팀으로 점수 플러스
                if(visit[i] ==  true && visit[j] == true) {
                    team_start += map[i][j];
                    team_start += map[j][i];
                } 
                // i 번째 사람과 j 번째 사람이  false 라면 => 링크 팀으로 점수 플러스
                else if(visit[i] == false && visit[j] == false) {
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }


        // 두 팀의 점수 차이(절댓값으로 계산)
        int val = Math.abs(team_start - team_link);

        /**
         * 두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에 더이상의 탐색 필요없이
         * 0을 출력하고 함수 종료
         */
        if(val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);
    }

}