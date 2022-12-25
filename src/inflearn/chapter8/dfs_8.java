package inflearn.chapter8;

import java.util.Scanner;

public class dfs_8 {
    static int n, f;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        f = scan.nextInt();
        
        DFS(0);
        
        System.out.println();
    }

    private static int DFS(int level) {
        if(level == n) return 1;
    }
}