package baekjoon.bronze;

import java.util.Scanner;

public class Main_10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i = 0; i < t; i++) {
            int h = scan.nextInt(); // 층
            int w = scan.nextInt(); //방의 갯수
            int n = scan.nextInt();

            System.out.println(solution(h, w, n));
        }
    }

    public static int solution(int h, int w, int n) {
        int[][] hotel = new int[h + 1][w + 1];
        
        for(int i = 1; i <= n; i++) {
            for(int x = 1; x <= h; x++) {
                
            }
        }

        return 0;
    }


}
