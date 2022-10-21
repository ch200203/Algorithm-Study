package baekjoon.silver;

import java.util.Scanner;


/**
 * 완전탐색(BP)
 * Next Permutation 구현
 * => 
 * A[i -1] < A[i] 를 만족하는 가장 큰 i를 찾는다.
 * j >= i 이면서 A[j] > A[i - 1]을 만족하는 가장큰 j를 찾는다.
 * A[i - 1] 과 A[j]를 Swap
 * A[i] 부터 순열을 뒤집는다.
 * 
 * 위 과정을 한 번 수행하면 현재 수열에서 다음 수열을 찾을 수 있음.
 */
public class Main_10972 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        int n = scan.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();

        if(nextPermutation(arr)) {
            for(int i = 0; i < n; i++) System.out.println(arr[i] + " ");
        } else {
            System.out.println("-1");
        }

        scan.close();
    }

    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if(i <= 0) return false;

        int j = arr.length - 1;
        while(arr[j] <= arr[j-1]) j--;

        swap(arr, i-1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    
}
