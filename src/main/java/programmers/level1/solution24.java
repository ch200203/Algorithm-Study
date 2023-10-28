package programmers.level1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 신고결과 받기
// https://programmers.co.kr/learn/courses/30/lessons/92334

public class solution24 {
	public static void main(String[] args) {
		String [] id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int  k = 2;
		
		solution(id_list, report, k);
	}
	
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		Map<String, Integer> index = new HashMap<>(); // 신고당한사람 횟수 저장
		Map<String,List<Integer>> list = new HashMap<>(); // 자신을 신고한 사람의 리스트 
		
		for(String i : id_list){
			index.put(i, 0);
		}
		
	
        return answer;
	}

}
