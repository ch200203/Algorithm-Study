package programmers.level1;

// https://programmers.co.kr/learn/courses/30/lessons/12977
// Prime Number 소수 만들기

public class Solution18 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		System.out.println("ans ::"  + solution(arr)); 
		
	}
	
	public static int solution(int [] nums){
		int arr [] = nums;
		int ans = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					System.out.println("sum :: " + sum);
					
					if(isPrime(sum)) ans++;
				}
			}
		}
				
		return ans;
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) { 
			// num 이하의 자연수로 모두 나눠보면 됨
			if(num % i == 0) return false;
		}
		return num > 1;
	}

}
