package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이것이 코딩테스트다 Greedy
// 큰수의 법칙
// 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙,
// 단, 배열의 특정한 인덱에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.

public class Greedy_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken()); // 배열의 크기
		int m = Integer.parseInt(st.nextToken()); // 더하는 횟수
		int k = Integer.parseInt(st.nextToken()); // 제한 횟수
		
		int [] arr = new int[n];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		System.out.println(solution(arr, m, k));
		
	}
	
	public static int solution(int [] arr, int m, int k){
		int max = 0;
		int max2 = 0;
		int answer = 0;
		
		// 1. 수를 정리하기
		Arrays.sort(arr);
		
		max = arr[4];
		max2 = arr[3];
		
		int cnt = 0;
		
		for (int i = 0; i < m; i++) {
			if(cnt == k) {
				System.out.println("max2 : " + max2);
				answer += max2;
				cnt = 0;
			} else {
				System.out.println("max : " + max);
				answer += max;
				cnt ++;
			}
			
			System.out.println(answer);
		}
		
		// 풀이보고 수정
		//  int sum = (((m / (k+1))) * (max * k + max2))  + ((m % (k + 1)) * max);
		
		return answer;
	}

}
