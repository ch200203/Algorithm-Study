package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.IntStream;

// 가장 큰 수 
//https://programmers.co.kr/learn/courses/30/lessons/42746

public class solution10 {
	public static void main(String[] args) {
		
	}
	
	public static String solution(int [] numbers){
		// 숫자 -> 문자 -> 내림차순정렬-> 조합
		String answer = "";
		/*
		answer = (String) IntStream.of(numbers)
			//.mapToObj(n -> String.valueOf(n))
			.mapToObj(String::valueOf)
			.sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
			.collect(Collectorsjoining());
		==> 이런 방식으로 축약 가능.
		*/ 
		
		String[] result = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}
		
		/*
			자리 수 비교는 너무 시간이 오래걸림 
			-> 문자열로 변환 후 내림차순 정리 이용
			Comparator 사용하여 문자열을 붙여준 후 내림차순 판별
			o1.compareTo(o2)
			- 앞에서부터 비교하다 다른 문자열이 나오면 'o1-o2' 순서로 해당 문자의
			아스키 코드값을 뺀 결과를 리턴
			
			내림차순 : (o2+o1).compareTo(o1+o2)
			오름차순 : (o1+o2).compareTo.(o2+o1)
		*/
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
