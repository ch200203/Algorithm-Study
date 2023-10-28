package programmers.level1;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12915
// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
public class Solution4 {
	public static void main(String[] args) {
		String strings [] = {"sun", "bed", "car"};
		
		System.out.println(Solution4.Solution(strings, 1));
		
	}
	
	public static String[] Solution(String [] strings , int n){
		String [] answer = {};
		
	    Arrays.sort(strings, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if(o1.charAt(n) > o2.charAt(n))
						return 1;
					else if(o1.charAt(n) == o2.charAt(n))
						return o1.compareTo(o2);
					else
						return -1;
				}
			});
			return strings;
	 	
	}

}