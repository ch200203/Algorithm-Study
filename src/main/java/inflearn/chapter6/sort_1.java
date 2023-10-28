package inflearn.chapter6;

import java.util.Scanner;

// 선택정렬 알고리즘
public class sort_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        solution(n, arr);
    }

    /*
     * 선택정렬
     * 시간 복잡도 O(n^2)
     * 간단하고 단순하지만 비효율 적인 방법(=> 삽입, 선택, 버블)
     */
    private static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            // 데이터 스왑
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
