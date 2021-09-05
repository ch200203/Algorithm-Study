package programmers.level2;

// https://programmers.co.kr/learn/courses/30/lessons/42586
// 스택 / 큐


public class Solution8 {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] progresses, int[] speeds) {
		 int[] temp = new int[100];
	        int day = -1;
	        for(int i = 0; i < progresses.length; i++){
	            while(progresses[i] + (speeds[i] * day) < 100){
	                day++;
	            }
	            temp[day]++;
	        }
	        int cnt = 0;
	        
	        for(int n : temp){
	            if(n != 0) cnt++;
	        }
	        
	        int[] answer = new int[cnt];
	        
	        cnt = 0;
	        for(int n : temp){
	            if(n != 0) answer[cnt++] = n;
	        }
	        return answer;
	}

}
