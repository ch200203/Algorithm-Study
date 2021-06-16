package programmers.level1;

import java.util.Arrays;


// https://programmers.co.kr/learn/courses/30/lessons/12954
// x만큼 간격이 있는 n개의 숫자
// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 

public class Solution14 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
	}
	
	public static long[]  solution(int x, int y) {
		long [] answer = new long [y];
		long temp = x;
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp * (i+1);
		}
		
		return answer;
	}

}
