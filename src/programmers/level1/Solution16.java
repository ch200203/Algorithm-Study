package programmers.level1;


// 수박수박수박수박수박수?
// https://programmers.co.kr/learn/courses/30/lessons/12922
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.


public class Solution16 {
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	public static  String solution(int n) {
        String answer = "";
        
        for (int i = 1; i <= n; i++) {
        	if(i % 2 == 0) answer += "박";
            if(i % 2 != 0) answer += "수";
		} 
        
        return answer;
    }

}
