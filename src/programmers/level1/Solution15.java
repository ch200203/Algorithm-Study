package programmers.level1;

// 문자열 내 p와 y의 개수
// https://programmers.co.kr/learn/courses/30/lessons/12916
// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성

public class Solution15 {
	public static void main(String[] args) {
		System.out.println(solution("Pyy"));
	}

	public static boolean solution(String s) {
		boolean answer = true;
		
		char [] arr = s.toLowerCase().toCharArray();
		int cnt = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'p') cnt ++;
			if(arr[i] == 'y') cnt --;
		}
		
		

		return answer = (cnt == 0) ? true : false;
	}

}
