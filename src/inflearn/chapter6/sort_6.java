package inflearn.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import javafx.scene.chart.AreaChart;

public class sort_6 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        solution_1(n, arr);
        solution(n, arr);
    }

    /**
     * 내풀이
     */
    private static void solution_1(int n, int[] arr) {
        int[] sort_arr = Arrays.copyOf(arr, n);
        Arrays.sort(sort_arr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(arr[i] != sort_arr[i]) sb.append(i+1).append(" ");     
        }

        System.out.println(sb.toString());
    }

    /**
     * 강사의 풀이
     */
    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone(); // 배열 복사.
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }
}
