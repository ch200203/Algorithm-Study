package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// DFS => 이어진 n개의 노드를 찾아야함
public class Main_13023 {
    static boolean vistit[];
    static int[][] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        // 친구의 수
        int n = Integer.parseInt(br.readLine());

        // 친구 관계의 수
        int m = Integer.parseInt(br.readLine());
        
        arr = new int[n][n];

        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        
    }
}
