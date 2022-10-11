package inflearn.chapter3;

import java.util.Scanner;


// 최대 길이 연속 부분 수열
/*
    0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.

    만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

    1 1 0 0 1 1 0 1 1 0 1 1 0 1

    여러분이 만들 수 있는 1이 연속된 연속부분수열은

    1 1 0 0 1 1 1 1 1 1 1 1

    이며 그 길이는 8입니다.

    ---------------------------
    첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
    두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.

    ----------------------------

    첫 줄에 최대 길이를 출력하세요.
 */
public class twopointer_6 {
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

    public static void solution(int n, int k, int[] arr) {
        // cnt : 0을 1로 바꾼 횟수
        int lt = 0, rt = 0, cnt = 0, answer = 0;

        // rt 가 증가하면서 => 0을 1로 변경
        // lt 가 증가하면서 => 바꾼 원소를 0으로 변경

        // 1을 연속적으로 가지고 있는 수열의 길의
        // length = rt - lt + 1;
        for(rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;

            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.println(answer);

    }
}
