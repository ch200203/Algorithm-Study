package programmers.level1;

// 번호 가리기
//전화번호가 문자열 phone_number로 주어졌을 때, 
// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
// https://programmers.co.kr/learn/courses/30/lessons/12948


public class Solution9 {
	public static void main(String[] args) {
		System.out.println(solution("01099072792"));
	}
	
	public static String solution(String phNum){
		String answer = "";
		
		for (int i = 0; i < phNum.length(); i++) {
			if(phNum.length() - 4 > i){
				answer += "*";
			} else {
				answer += phNum.charAt(i);
			}
		}
		
		return answer;
	}

}
