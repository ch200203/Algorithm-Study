package inflearn.chapter2;

import java.util.*;

public class Array_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print(solution(n, arr)); 
    }

    public static int solution(int n , int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
}
