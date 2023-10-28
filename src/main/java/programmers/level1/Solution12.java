package programmers.level1;

// https://programmers.co.kr/learn/courses/30/lessons/12943
// 콜라츠 추측
// 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

public class Solution12 {
	public static void main(String[] args) {
		long [] arr = {16, 8, 626331 };
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(solution(arr[i]));
		}
		
		
	}
	
	public static int solution(long num) {
		int cnt = 0;
		
		while (num != 1){
			if(num % 2 == 0){
				num /= 2;
			} else {
				num = 3 * num + 1;
			}
			
			cnt ++;
			
			if(cnt == 500){
				cnt = -1; break;
			}
		}
				
		return cnt;
	}

}
