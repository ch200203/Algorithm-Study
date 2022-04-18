package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int [] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        

        // => 요렇게 출력했더니 시간초과가 떠버림.
        // for(int i =0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // => 해결책으로 StringBuilder 사용하여 출력함
        // BufferedReader 와 StringBuilde를 사용하여 시간을 단축시키는 것이 중요할듯.
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }
        
        System.out.println(sb);
    }

    public static void solution() throws IOException{
        // 이상적인 풀이방법 정리하기.
        // Arrays.sort 를 사용하지 않는 방법.
        
        // 주어진 수의 범위(0 ~ 10000)
        int[] cnt = new int[100001];

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 해당 Index의 값을 1증가 시키기.
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 제외 됨으로 1부터 시작
        for(int i = 1; i < 10001; i++) {
            // i 값이 개수가 0이 될 때 까지 출력하기(빈도수를 의미한다.)
            while(cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }

        System.out.println(sb);

        /*
            Arrays.sort 를 사용하지 않고 카운팅정렬을 사용하는 방법이다.

            참고로 시간복잡도는 O(N + K) 이다. 
            
            K는 자릿수를 의미하는데 입력데이터가 K 보다 훨 씬 큰경우. 
            
            즉 데이터가 많으면 많을 수록 O(N) 에 가깝기 때문에 이상적으로는 O(N) 이라고 보아도 무방하다. 

            참고 링크 : https://st-lab.tistory.com/107
        */
    }
}
