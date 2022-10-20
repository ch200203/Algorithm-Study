package baekjoon.silver;

import java.util.Scanner;

public class Main_18312 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;

        // 3중 for문 => 효율성 X
        /*
        for (int i = 0; i <= n; i++) {
            String clock = "";
            for (int j = 0; j < min; j++) {
                for (int j2 = 0; j2 < sec; j2++) {
                    clock = String.valueOf(i) + String.valueOf(j) + String.valueOf(j2);
                    if(clock.contains(String.valueOf(k))) count++;
                }
            }
        }
        */

        // 효율성 고려 => 가지치기
        // 메모리 17568KB, 시간 204ms
        for (int i = 0; i <= n; i++) {
            if(i % 10 == k || i / 10 == k) count += 3600;
            else {  
                for (int j = 0; j < 60; j++) {
                    if(j % 10 == k || j / 10 == k) count += 60;
                    else {
                        for (int j2 = 0; j2 < 60; j2++) 
                            if(j2 % 10 == k || j2 / 10 == k)count++;
                    }
                }
            }
        }
        

        System.out.println(count);
    }
}
