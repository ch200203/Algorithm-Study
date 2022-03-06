package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

// 가장 큰 수 
//https://programmers.co.kr/learn/courses/30/lessons/42746

public class solution10 {
	public static void main(String[] args) {
		
	}
	
	public static String solution(int [] numbers){
		String answer = "";
		
		String[] result = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return ((o2 + o1).compareTo(o1 + o2));
			}
		});
		
		if(result[0].equals("0")){
			return "0";
		}
		
		for (String str : result) {
			answer += str;
		}
		
		return answer;
	}

}
