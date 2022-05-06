package This_Is_Coding_Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class greedy_Q01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int rslt = 0; // 총 그룹의 수
        int count = 0; // 현재 그룹에 포함된 모험가의 수 

        for (int i : arr) { // 공포도가 낮은 것 부터 하나 씩 확인
            count += 1; // 현재 그룹에 해당 모험가 추가
            if(count >= i) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                rslt += 1; // 총 그룹의 수 증가시키기
                count = 0;
            }
        }
    }
}
