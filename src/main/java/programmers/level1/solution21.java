package programmers.level1;


// 키패드 누르기
// https://programmers.co.kr/learn/courses/30/lessons/67256
// 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.

public class solution21 {
	public static void main(String[] args) {
		int numbers [] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		solution(numbers, hand);
	}
	
	public static String solution(int [] numbers, String hand) {
		int left = 10; int right  = 12;
		String answer = "";
		
		for(int num : numbers){
			if( num == 0 ) num = 11;   //0 을 11로 치환
			
			if(num == 1 || num == 4 || num == 7 || num == 10){ // left
				answer += "L";
			} else if(num == 3 || num == 6 || num == 9 || num == 12){
				answer += "R"; 
			} else {
				
			}
			
			
			
			
			System.out.println(answer);
			
		}
		
		return null;
	}

}
