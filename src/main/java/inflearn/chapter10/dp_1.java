package inflearn.chapter10;

import java.util.Scanner;

public class dp_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextInt()));
    }

    public static int solution(int n) {
        int[] fibo = new int[n];
        fibo[1] = 1;
        fibo[2] = 2;

        for (int i = 3; i < fibo.length; i++) {
            fibo[i] = fibo[i - 2] + fibo[i + 2];
        }

        return fibo[n];
    }
}
