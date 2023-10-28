package inflearn.chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }

        solution(n, arr);
    }

    public static void solution(int n , String[] arr) {               
        for (int i = 0; i < n; i++) {
            int reverseNum = Integer.parseInt(new StringBuffer(arr[i]).reverse().toString());
            if(isPrime(reverseNum)) System.out.print(reverseNum + " ");
        }        
    }

    public static boolean isPrime(int n) {
       int[] ch = new int[n + 1];
       for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                if(i == n) return true;
                for(int j = i; j <= n; j = j + i) ch[j] = 1;
            }
       }
       
       return false;
    }
}
