package baekjoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1037 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int answer = arr[0] * arr[n-1];

        System.out.println(answer);

    }
    
}