package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 브루트 포스
// 1476 백준
public class Main_1476 {
     public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         int E = Integer.parseInt(st.nextToken()); // 15
         int S = Integer.parseInt(st.nextToken()); // 28
         int M = Integer.parseInt(st.nextToken()); // 19

         // => 셋의 최소공배수를 완전탐색으로 1씩 증가시켜 찾음
         // 추정된 연도에서 지금 입력 받은 값을 뺀 다음, 각자 범위에 맞게 %연산을 한 것이 모두 0이 되면 정답이 된다. 
         int year = 0;
         while(true){
            year++;
            System.out.println((year-E) + " " + (year-S) + " " + (year-S));
            if((year-E)%15 == 0 && (year-S)%28 == 0 && (year-M)%19 == 0) break;
         }

         System.out.println(year);

     }
}
