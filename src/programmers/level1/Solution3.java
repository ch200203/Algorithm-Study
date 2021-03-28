package programmers.level1;

// https://programmers.co.kr/learn/courses/30/lessons/12903
// str 의 가운데 문자를 반환 할것, 짝수인 경우에는 가운데 두글자를 반환
public class Solution3 {
	public static void main(String[] args) {
		
		String a = "abcde";
		String b = "qwer";
		
		System.out.println(Solution3.Solution(b));
		
	}
	
	public static String Solution(String s){
		String answer = "";
		String [] arr = s.split("");
		int cnt = (int) Math.floor(s.length() / 2);

		if(s.length() % 2 != 0){
			answer = arr[cnt];
		} else {
			answer += arr[cnt-1];
			answer += arr[cnt];
			
		}
		return answer;
		
	}

}
