package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12932
// 자연수 뒤집어 배열로 만들기
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 

public class Solution13 {
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
	
	public static int [] solution(long n) {
		char[] numArr = Long.toString(n).toCharArray();
		
		Integer [] arr = new Integer [numArr.length];
		
		for (int i = 0; i < numArr.length; i++) {
			arr[i] = Integer.parseInt(String.valueOf(numArr[i]));
		}
		
		// 배열을 List 로 변환
		List<Integer> list = Arrays.asList(arr);
		
		// Collections.reverse() 메소드를 사용하여 list를 거꾸로 변환
		Collections.reverse(list); 
		
		// 리스트를 배열로  변환
		Integer [] arr2 = list.toArray(arr);
		
		System.out.println("res :: " + Arrays.toString(arr2));
		
		// int 배열에 삽입
		int [] answer = new int [arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			answer[i] = arr2[i];
		}
		
					
		return answer;
	}

}
