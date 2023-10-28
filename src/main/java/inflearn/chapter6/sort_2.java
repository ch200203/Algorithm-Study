package inflearn.chapter6;

import java.util.Scanner;

// 버블 정렬
public class sort_2 {
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
     * 버블정렬
     * 시간복잡도(O(n^2))
     * 자료가 미리 정렬되어 있는 최상의 경우 => 자료의 이동이 발생하지 않음
     */
    private static void solution(int n, int[] arr) {
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // 자료 swap
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for(int i : arr) 
            System.out.print(i + " ");
    }
}
