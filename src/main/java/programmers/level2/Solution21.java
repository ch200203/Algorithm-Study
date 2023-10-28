package programmers.level2;

/**
 * Programmers
 * 땅따먹기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12913
 * DFS -> 시간초과
 * DP로 풀어야함
 */
public class Solution21 {
    public static void main(String[] args) {
        int[][] land = {
            {1,2,3,5},
            {5,6,7,8},
            {4,3,2,1}
        };

        System.out.println(solution(land));
    }

    // DFS 로 풀었을 경우에 시간초과 =>  n이 최대 10만이기 때문
    // i - 1 행에서 열이 선택 되었을 때,
    // i - 1번째 행 중 선택된 열을 제외한 나머지들 중 최대값을 구해서 더하는 형태
    // 풀이 참고 https://latte-is-horse.tistory.com/229
    // https://ilmiodiario.tistory.com/88
    private static int solution(int[][] land) {
        int answer = 0;

        // 두번째 행부터 확인해야함
        for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }
        

        return answer;
    }

}


