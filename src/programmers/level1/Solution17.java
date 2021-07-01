package programmers.level1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// 실패율
// 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
// N : 전체 스테이지 개수 (1 ~ 500)
// stage : 사용자가 현재 멈춰있는 스테이지의 번호 배열


public class Solution17 {
	public static void main(String[] args) {
		int [] stage = {2,1,2,6,2,4,3,3};
			
		System.out.println(Arrays.toString(solution(5, stage)));
		
	}
	
	public static double[] solution(int N, int [] stage){
		double [] answer = new double [N];
		
		Arrays.sort(stage);
		
		double chNum = stage.length; // 총 도전자의 수
		System.out.println( "::::::: " + 1 / chNum);
		
		for (int i = 0; i < N; i++) {
			int stay = 0;	
			
			for (int j = 0; j < stage.length; j++) {
				if(i + 1 == stage[j]){
					stay++;
					System.out.println(stay);
				}
				
			}
			System.out.println(stay + " / " + chNum + " = "+ stay / chNum);
			answer[i] = (stay / chNum) ;
			System.out.println("ans :: " + answer[i]);
			chNum -= stay;
		}
		
		
		return answer;
	}

}
