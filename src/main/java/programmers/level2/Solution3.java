package programmers.level2;

// N개의 최소공배수 (LCM)
// 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 
// 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 
// 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
// https://programmers.co.kr/learn/courses/30/lessons/12953


public class Solution3 {
	public static void main(String[] args) {
		int [] arr = {2, 6 ,8 ,14};
		
		System.out.println("answer :: " + solution(arr));
	}
	
	public static int solution(int[] arr){
		int answer = 0;
		
		if(arr.length == 1) return arr[0]; // 원소가 한개인 경우는 바로 출력
		int g = gcd(arr[0], arr[1]); // 처음 두 원소의 최대 공약수
		answer = (arr[0] * arr[1]) / g; // 처음 두 원소의 최소 공배수

		/*
		 * 원소의 갯수가 3개 이상인 경우
		 * 앞의 두 원소의 최소 공배수와 다음 원소의 최소 공배수를 반복해서 구함
		 */
		
		 if(arr.length > 2) {
			for(int i = 2; i < arr.length; i++) {
				g = gcd(answer, arr[i]);
				answer = (answer * arr[i]) / g;
			}
		 }
		
		return answer;
	}

	// 유클리드 호제법 이용
	private static int gcd(int a, int b){
		int result = a % b;
		if(result == 0) return b;
		else return gcd(a, b);
	}

}
