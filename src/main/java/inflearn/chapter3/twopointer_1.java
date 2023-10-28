package inflearn.chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class twopointer_1 {
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

        solution_twopointer(n, arr1, m, arr2);
    }


    // 효율적이지 못한 방법
    public static void solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }

        // 1. 오름차순 정렬
        // Collections.sort(list);
        list.sort(Comparator.naturalOrder());

        for (int i : list) {
            System.out.print(i + " ");
        }

        // 2. 내림차순 정렬
        // Collections.sort(list, Collections.reverseOrder());
    }

    public static void solution_twopointer(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer  = new ArrayList<>();

        // 두개의 포인터 생성
        int p1 = 0, p2 = 0;

        // 포인터의 검색 범위 설정
        while(p1 < n && p2 < m) {
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }


        // 남은 배열 넣어주기
        while(p1 < n) answer.add(arr1[p1++]);
        while(p2 < m) answer.add(arr2[p2++]);

        for (int x : answer) System.out.print(x + " ");
    }
}
