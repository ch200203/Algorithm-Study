package programmers.level1;

// 이상한 문자 만들기
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
// https://programmers.co.kr/learn/courses/30/lessons/12930

public class Solution8 {
	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
		
	}
	
	public static  String solution(String s ){
/*		String [] arr = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			String tmp = ""; // 임시저장
			
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				System.out.println("before :: " + ch);
				if(j % 2 == 0) {
					ch = Character.toUpperCase(ch);
					System.out.println("after :: " + ch);
				} else {
					ch = Character.toLowerCase(ch);
					System.out.println("after :: " + ch);
					
				}
				
				tmp += ch;
			}
			arr[i] = tmp;
			if(i == arr.length - 1){
				sb.append(arr[i]);
				
			} else {
				sb.append(arr[i]);
				sb.append(" ");
			}
						
		}
		return sb.toString();*/
		
		String answer = "";
	      
	      String str[] = s.split("");
	      String space = " ";
	      int cnt = 0;
	      
	      for(int i = 0; i < str.length; i++){
	          if(str[i].equals(space)){
	             cnt = 0;
	          }else{
	             if(cnt % 2 == 0){
	                cnt++;
	                str[i] = str[i].toUpperCase();
	             }else{
	                 cnt++;
	                 str[i] = str[i].toLowerCase();
	             }
	          }
	          answer += str[i];
	      }
	      
	      System.out.println(answer);
	      
	      return answer;

	}
	
}
