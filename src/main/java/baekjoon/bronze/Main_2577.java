package baekjoon.bronze;

import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        long sum = A * B * C;

        String str = String.valueOf(sum);
    
        for (int i = 0; i <= 9; i++) {
            int cnt= 0;
            for (int j = 0; j < str.length(); j++) {
                if(String.valueOf(str.charAt(j))
                        .equals(String.valueOf(i))){
                    cnt++;
                }
            }
            System.out.println( cnt);
        }
    }
}
