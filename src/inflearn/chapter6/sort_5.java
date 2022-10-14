package inflearn.chapter6;

import java.util.Arrays;
import java.util.Scanner;

// O(nlogn)
public class sort_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    public static String solution(int n, int[] arr) {
        String answer = "U";

        Arrays.sort(arr);

        for (int i = 0; i < n -1; i++) {
            if(arr[i] == arr[i + 1]) return "D";
        }

        return answer;
    }
}
