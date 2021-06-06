package programmers.level1;

// 시저 암호
// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// https://programmers.co.kr/learn/courses/30/lessons/12926

public class Solution7 {
    public static void main(String[] args) {
    	System.out.println(solution("a B z", 4));
    	
        
    }

    public static String solution(String s, int n){
    	String answer = "";
    	
    	for (int i = 0; i < s.length(); i++) {
    		char ch =  s.charAt(i);
    		
    		if(ch >= 'a' && ch <= 'z'){
				ch = (char) (ch + n);
				if(ch > 'z') ch -= 26;
    		}
    		
    		if(ch >= 'A' && ch <= 'Z'){
    			ch = (char) (ch + n);
    			if(ch > 'Z') ch -= 26;
    		}
    		
    		answer += ch;
		}
    	


        return answer;
    }

}
