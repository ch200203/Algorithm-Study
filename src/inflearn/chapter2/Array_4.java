package inflearn.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_4 {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(solition(n)[i] + " ");
        }
    }

    public static int[] solition(int n) {
        int[] fibo = new int[n];

        for (int i = 0; i < n; i++) {
            if(i == 0 || i == 1)  fibo[i] = 1;
            else {
                fibo[i] = fibo[i -2] + fibo[i -1];
            }
        }

        return fibo;
    }
    
}
