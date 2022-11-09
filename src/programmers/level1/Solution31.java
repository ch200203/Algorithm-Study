package programmers.level1;

/**
 * 콜라문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class Solution31 {
    public static void main(String[] args) {
        int a = 2, b = 1, n = 20;

        System.out.println(solution(a, b, n));
    }

    private static int solution(int a, int b, int n) {
        int answer = 0;

        
        while(true) {
            if(n <  a) break;

            answer += (n / a) * b;
            int remain = n % a;
            n = (n / a) * b + remain;
        }

        return answer;
    }
}
