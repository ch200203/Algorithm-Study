package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
        198 = 198 + 1 + 9 + 8 = 216
        예로들어 198 이라는 생성자가 주어졌을 때 198 의 분해합은 198 + 1 + 9 + 8 = 216 이다. 
        반대로 216 의 생성자는 여러가지가 있다.
        예로들어 앞선 예제처럼 198 이 될 수도 있고 207 이 될 수도 있다.
        즉, 생성자의 경우에는 1개 이상이기 때문에 최솟값을 찾기 위해서는 작은 수 부터 찾아야한다는 것을 알 수 있다.

        가장 기본적인 방법은 1 부터 입력받은 N 까지 한 개씩 모두 대입해보는 것이다.
        이게 가장 기본적인 브루트포스 방식이다.
        만약 탐색 도중 생성자를 찾으면 종료하고 해당 생성자를 출력하며, N 을 넘길 때 까지 생성자를 찾지 못하면 0을 출력하면 된다.

*/


public class Main_2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    
        int rslt = 0;
        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0; // 각자리의 합

            while(number != 0) {
                sum += number % 10; // 각 자릿수 더하기
                number /= 10;
            }
            // i 값과 각자릿수 누적합이 같을경우 = 생성자를 찾았을 경우
            if(sum + i == N) {
                rslt = i;
                break;
            }
        }
        
        System.out.println(rslt);
    }

    // 알고리즘 개선 방식
    // 참조 https://st-lab.tistory.com/98
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		// 자릿수의 길이를 알기위해 일단 문자열로 입력받는다.
		String str_N = br.readLine();
 
		// 해당 문자열의 길이 변수
		int N_len = str_N.length();
 
		// 문자열을 정수(int)로 변환 
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		
		// i 는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 변수 
			
			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
    }
}
