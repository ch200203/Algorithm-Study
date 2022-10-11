package inflearn.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class twopointer_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }

        solution(n, arr1, m, arr2);
    }

    public static void solution(int n, int[] arr1, int m, int[] arr2) {
        // 비교하기 위해서 오름차순 정렬을 먼저 실행한다.
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> answer = new ArrayList<>();
        
        // 포인터 생성
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            // 값이 다르면 발견될 일이 없음
            if(arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
                // 포인터 값 동시 증가
            } else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
