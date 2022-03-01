package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 로또의 최고 순위와 최저 순위
// https://programmers.co.kr/learn/courses/30/lessons/77484

public class solution22 {
	public static void main(String[] args) {
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
		
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		
		int cnt = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				zeroCount ++;
				continue;
			} 
			
			for (int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]){
					cnt ++;
					break;
				}
			}
		}
		
		int ifLose = cnt;
		int ifWin = cnt + zeroCount;
		
		
		int [] answer = {rank(ifWin), rank(ifLose)};
		
		return answer; 
	}
	

	public static int rank(int num) {
		switch (num) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default: 
			return 6;
		}
	}
}
