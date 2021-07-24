package programmers.level2;

import java.util.Arrays;

// 최솟값 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12941


public class Solution4 {
	public static void main(String[] args) {
		int A [] =  {1,2};
		int B [] =  {3,4};
		
		System.out.println(solution(A, B));
	}
	
	public static int solution(int [] arr1, int [] arr2){
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++){
			sum += arr1[i] * arr2[arr1.length-i - 1];
		}
		
		
		return sum;
	}

}
