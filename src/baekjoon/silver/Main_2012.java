package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());   
        long sum = 0; // 불만도 합 최소
        // =>  학생이 예상한 등수를 오름차순으로 정렬하고, 
        // 작은것부터 1등, 2등, 3등, ... 빼주면 된다.

        // 단,  만약 모든 학생이 자신의 등수를 1로 예상할경우,
        //|1-500,000| x 500,500 이 되어서 int의 범위를 벗어난다.
        // 따라서 불만도의 자료형을 long 으로 선언한다.

        // 예상등수
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i] - (i+1)); // 학생의 불만도
        }

        System.out.println(sum);

        br.close();

    }
}
