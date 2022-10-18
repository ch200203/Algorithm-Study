package baekjoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1940
// 2000ms, O(N^2) 완전 탐색
public class Main_1940 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        solution(n, m, arr);

        // 완전 탐색 풀이방법
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == m) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer / 2);        
    }

    // 투포인터 활용한 풀이방법
    public static void solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, rt = m - 1;


        // 투포인터 알고리즘을 사용하기 위하여 정렬을 함
        Arrays.sort(arr);

        // 포인터를 양끝에서 움직이면서 검색함
        while(lt < rt) {
            if(arr[lt] + arr[rt] < m) lt++;
            else if(arr[lt] + arr[rt] > m) rt--;
            else { // arr[lt] + arr[rt] == m
                answer++;
                lt ++;
                rt--;
            }
        }   


        System.out.println(answer);
    }

}
