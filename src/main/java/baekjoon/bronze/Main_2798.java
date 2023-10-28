package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr [] = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int rslt = serach(arr, n, m);

        System.out.println(rslt);
    }

    static int serach(int [] arr, int n, int m){
        int rslt = 0;
        
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int j2 = j + 1; j2 < arr.length ; j2++) {
                    int tmp = arr[i] + arr[j] + arr[j2];
                    if(tmp == m) {
                        return tmp;
                    }
                    if(rslt < tmp && tmp < m){
                        rslt = tmp;
                    }
                }
            }
        }
        return rslt;
    }
}
