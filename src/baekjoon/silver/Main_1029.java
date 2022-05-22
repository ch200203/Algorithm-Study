package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 기본 알고리즘 풀이 -1 (수학)
// 에라토스테네스의 체
public class Main_1029 {
    public static boolean[] prime;
    public static void main(String args[]) throws Exception{
        BufferedReader br 
            = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
		getPrime();
        
        for(int i = M; i <= N; i++){
            if(!prime[i]) System.out.println(i);
        }   
    }
    
    // 에라토스테네스의 체 알고리즘
    public static void getPrime(){
        // true = 소수아님 , false = 소수 
        prime[0] = prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
    }
}