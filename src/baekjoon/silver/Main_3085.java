package baekjoon.silver;

import java.util.Scanner;

public class Main_3085 {
    public static char[][] board;
    public static int N;
    public static int max = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        board = new char[N][N];
    }
}
