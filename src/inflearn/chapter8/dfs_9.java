package inflearn.chapter8;

import java.util.Scanner;

public class dfs_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();

        
    }
}
