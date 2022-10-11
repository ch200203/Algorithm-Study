package inflearn.chapter3;

import java.util.Scanner;


// 연속된 자연수의 합
/*
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 * ----------------------------
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다
 * 첫 줄에 총 경우수를 출력합니다.
 */
public class twopointer_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        solution(n);
    }

    public static void solution(int n) {
        int[] arr = new int[n];
        int p1 = 0, p2 = 0, sum = 0, answer = 0;

        // 두개 이상의 연속된 자연수 => 범위를 n / 2 + 1 까지만 잡음 (자기 자신 제외)
        for (int i = 0; i < n / 2 + 1; i++) {
            arr[i] = i + 1;
            sum += arr[p2++];
            while (sum > n) {
                sum -= arr[p1++];
            }
            if(sum == n) answer ++;
        }
        System.out.println(answer);
    }

    public int solution_2(int n){
		int answer=0, cnt=1;
		n--;
		while(n > 0){
			cnt++;
			n = n - cnt;
			if(n % cnt == 0) answer++;
		}
		return answer;
	}
}
