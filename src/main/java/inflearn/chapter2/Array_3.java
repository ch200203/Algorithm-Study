package inflearn.chapter2;

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        solution(n, arr, arr2);
    }

    // 1 : 가위 2 : 바위 3 :보
    public static void solution(int n, int[] arr, int[] arr2) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(arr[i] == arr2[i]) answer += "D";
            else if(arr[i]==1 && arr2[i]==3) answer+="A";
			else if(arr[i]==2 && arr2[i]==1) answer+="A";
			else if(arr[i]==3 && arr2[i]==2) answer+="A";
			else answer+="B";
        }

        System.out.println(answer);
    }
}
