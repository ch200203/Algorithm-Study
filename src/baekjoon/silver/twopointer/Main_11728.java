package baekjoon.silver.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_11728 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++) arr1[i] = scan.nextInt();
        for(int i = 0; i < m; i++) arr2[i] = scan.nextInt();

        solution(arr1, arr2);
       
        scan.close();
    }

    private static void solution(int[] arr1, int[] arr2) {
        StringBuilder sb =  new StringBuilder();
        // 포인터 설정
        int p1 = 0, p2 = 0;

        while(p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] < arr2[p2]) sb.append(arr1[p1++]).append(" ");
            else sb.append(arr2[p2++]).append(" ");
        }

        while(p1 < arr1.length) sb.append(arr1[p1++]).append(" ");
        while(p2 < arr2.length) sb.append(arr2[p2++]).append(" ");

        System.out.println(sb.toString());
        
    }

}
