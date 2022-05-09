package baekjoon.Bronze;

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        // 1 => 1
        // 2~7 => 2
        // 8~19 => 3
        // 20~37 => 4

        int count = 1; // 최소루트
        int range = 2; // 범위

        if(N == 1) {
            System.out.print(1);
        } else {
            while(range <= N) {
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화 
                count++;	// count 1 증가 
            }
        }

        System.out.println(count);

    }
}
