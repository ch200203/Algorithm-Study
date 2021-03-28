package programmers.level1.greedy;


// https://programmers.co.kr/learn/courses/30/lessons/42862
// 그리디 알고리즘
/*
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요
 * 
 */

public class Solution1 {
	
	public static void main(String[] args) {
		int n = 5; // 전체학생수
		int [] lost = {2, 4}; // 도난당한 학생 번호
		int [] reverse ={1, 3, 5}; // 여벌을 가지고있는 학생 번호
		
		System.out.println(Solution1.solution(n, lost, reverse));
	}
	
	
	public static int solution(int n, int [] lost, int [] reverse){
		int ans = 0;
		int all [] = new int [n];
		
		for(int i : reverse)
			all[i -1]++;
		
		for(int i : lost)
			all[i - 1]--;
		
		for (int i = 0; i < all.length; i++) {
			if (all[i] < 0) {
				if(i != all.length && all[i + 1] > 0){
					all[i]++;
					all[i + 1]--;
				} else if(i !=0 && all[i-1] > 0){
					all[i]++;
					all[i - 1]--;
				}
			}
		}
		
		for (int i = 0; i < all.length; i++) {
			if(!(all[i] < 0))
				ans++;
		}
		
		return ans;
	}

}
