package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이것이 코딩테스트다 Greedy
// 1이 될때까지
// N에서 1을 뺀다
// N을 K로 나눈다
// 1이 될떄까지 두 과정 중 하나를 반복적으로 선택하여 수행한다.

public class Greedy_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		while(n != 1){
			
			if(n % k == 0){
				n /=  k;
			} else {
				n -= 1;
			}
			
			cnt ++;
		}
		System.out.println(n);
		System.out.println(cnt);
		
	}

}
