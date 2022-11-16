package programmers.level2;

/**
 * 숫자의 표현
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class Solution22 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                } else if(sum > n) break;
            }
        }

        return answer;
    }
}
