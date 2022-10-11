package inflearn.chapter3;

import java.util.Scanner;

// 연속 부분 수열
public class twopointer_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        solution(n, k, arr);

        scan.close();
    }

    // O(n^2) => 시간초과
    // N 값을 보고 너무 크다 싶으면 O(n^2) => O(n) 으로 풀어내야함 (보통)
    public static void solution(int n, int k, int[] arr) {
        // sum : lt~rt 까지의 합
        int lt = 0, rt = 0, sum = 0, answer = 0;

        // rt를 증가시키면서 k값과 계속 비교함.
        // sum이 k또는 k보다 큰 경우에는 lt의 포인터를 한칸 이동한다.
        for (rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while(sum > k) {
                sum -= arr[lt++];
            }
            if(sum == k) answer ++;
        }

        System.out.println(answer);
        
    }
}
