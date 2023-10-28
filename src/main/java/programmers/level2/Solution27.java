package programmers.level2;

// N개의 최소 공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Solution27 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4};
        System.out.println(solution(arr));
    }
    
    private static int solution(int[] arr) {
        int answer = 0;

        // 원소가 한개인 경우
        if(arr.length == 1) return arr[0]; 

        int g = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / g;

        for (int i = 2; i < arr.length; i++) {
            g = gcd(answer, arr[i]);
            answer = (answer * arr[i]) / g;
        }

        return answer;
    }

    // 최대 공약수
    private static int gcd(int a, int b) {
        int r = a % b;
        if(r == 0) return b;
        else return gcd(b, r);
    }
}
