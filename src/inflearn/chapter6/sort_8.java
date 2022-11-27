package inflearn.chapter6;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  마구간 정하기 
 *  결정 알고리즘(이분탐색)
 */
public class sort_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, m, arr));

        scan.close();
    }


    /**
     * 1, 2, 4, 8, 9 => 마구간의 좌표
     * 
     * m마리의 말을 배치한다.
     * 
     * 마구간에는 한마리의 말만 넣을 수 있음
     * 
     * 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치함
     * 
     * 두 말의 거리가 최대가 되는 값을 출력
     */
    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        // 1. 배열을 정렬
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n -1];
        
        // 2. 탐색
        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            // 3. 결정 알고리즘
            if(count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    /*
     * 검증
     */
    private static int count(int[] arr, int dist) {
        int cnt = 1; // 배치한 말의 수
        int ep = arr[0]; // 처음 배치한 마굿간의 위치

        for(int i = 0; i <arr.length; i++) {
            // 거리 확인
            if(arr[i] - ep >= dist)  {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;

    }
}
