package programmers.level1.DFS;


/*
 * 프로그래머스
 * 삼총사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 * DFS => 백트래킹.
 */
public class Solution2 {
    static int arr[] = new int[3];
    static int numArr[];
    static int len;
    static int answer = 0;

    private static int solution(int[] number) {
        len = number.length;
        numArr = number;
        
        DFS(0, 0);
        
        return answer;
    }

    private static void DFS(int idx, int depth) {
        if(depth == 3) {
            int sum = 0;
            for(int i = 0; i < 3; i++) {
                sum += arr[i];
            }
            
            if(sum == 0) answer++;
            return;
        }
        
        for(int i = idx; i < len; i++) {
            arr[depth] = numArr[i];
            DFS(i + 1, depth + 1);
        }
    }
}
