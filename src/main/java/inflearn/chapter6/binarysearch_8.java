package inflearn.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  scan.nextInt();
        }

        System.out.println(solution(n, m, arr));
        

    }

    // 이분 탐색 메소드 사용
    public static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, m) + 1;
    }


    // 직접 구현 방식
    public static int solution_2(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = 0, lt = 0, rt = n -1, mid = 0;

        while(lt <= rt) {
            mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer= mid + 1;
                break;
            }
            if(arr[mid] > m) rt = mid - 1;
            else lt = mid + 1; // arr[mid] < m
        }

        return answer;
    }

}
