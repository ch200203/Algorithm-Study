package inflearn.chapter3;

import java.util.Scanner;

// 최대 매출(Sliding Window)
/*
    현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

    만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

    12 15 11 20 25 10 20 19 13 15

    연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

    여러분이 현수를 도와주세요.
    -----------------------------------

    첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

    두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

    ------------------------------------
    첫 줄에 최대 매출액을 출력합니다.
 */
public class twopointer_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        solution_SlidingWindow(n, k, arr);
    }

    // 시간초과....
    public static void solution(int n, int k, int[] arr) {
        // 포인터 설정
        int p = 0;
        // 최대값 비교
        int max = Integer.MIN_VALUE;
        while(p <= n - k - 1) {
            int count = 0;

            for (int i = 0; i < k; i++) {
                count += arr[p + i];
            }
        
            if(count > max) max = count;

            p++;
        }

        System.out.println(max);
    }

    // 시간 복잡도 O(n) 방식
    public static void solution_SlidingWindow(int n, int k, int[] arr) { 
        int answer = 0, sum = 0;
    
        // 초기값 할당
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        // k번째 까지의 합을 초기값으로 할당하여 k부터 idx 시작
        for (int i = k; i < n; i++) {
            // 슬라이딩 윈도우
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}
