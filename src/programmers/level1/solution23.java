package programmers.level1;

import java.util.TreeSet;

// 폰켓몬
// https://programmers.co.kr/learn/courses/30/lessons/1845

public class solution23 {
	public static void main(String[] args) {
		int nums [] = {3,1,2,3};
		int cnt = solution(nums);
		System.out.println(cnt);
	} 
	
	public static int solution(int[] nums){
		TreeSet<Integer> set = new TreeSet<>();
		int cnt = nums.length / 2;
		
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		if(cnt <= set.size()) {
			return cnt;
		}
		
		return set.size();
	}
	

}
