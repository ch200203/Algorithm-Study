package programmers.level1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12919
// 서울에서 김서방 찾기
// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수


public class Solution10 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
		
	}
	
	public static String solution(String[] seoul){
		
		int cnt = Arrays.binarySearch(seoul, "Kim");
		
		return "김서방은 " + cnt + "에 있다.";
	}

}
