package inflearn.chapter6;

import java.util.Scanner;

// 삽입 정렬
public class sort_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        for (int i : solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    // 삽입 정렬 알고리즘
    public static int[] solution(int n, int[] arr) {
        for(int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for(j = i -1; j >= 0; j--) {
                if(arr[j] > tmp) arr[j+ 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }

        return arr;
    }
}
