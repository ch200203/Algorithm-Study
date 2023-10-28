package baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2606 {
    static int[][] arr;
    static boolean[] check; // 방문한 노드 확인
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        arr= new int[n + 1][n + 1];
        check = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            // 인접 행렬을 표기하기 위한 행렬 그래프
            arr[a][b] = arr[b][a] = 1;
        }
        
        dfs(1);

        System.out.println(count - 1);
        
        scan.close();
    }

    public static void dfs(int start) {
        // 방문한 노드 확인
        check[start] = true;
        count++;

        for (int i = 0; i < arr.length; i++) {
            if(arr[start][i] == 1 && !check[i]) dfs(i);
        }
    }
}
