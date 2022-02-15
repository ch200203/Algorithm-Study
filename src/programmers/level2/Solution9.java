package programmers.level2;

import java.util.*;

// 가장큰 수
// 정렬
// https://programmers.co.kr/learn/courses/30/lessons/42746
// 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return


public class Solution9 {
	public static void main(String[] args) {
		int [] numbers = {6, 10, 2 };
	}
	
	public static String solution(int [] numbers) {
		String answer = "";
        //문자열 리턴을 해줄 스트링배열 생성
        String[] str = new String[numbers.length];
        
        //int배열 String배열로 변환
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }     
        
//        //내림차순 정렬
//        Arrays.sort(str, new Comparator() {
//        	@Override
//            public int compare(String a, String b) {
//                return (b+a).compareTo(a+b);
//                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
//            }
//        });
        
        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (str[0].equals("0")) return "0";
        
        //0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;
 
        return answer;

	}


}
