package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 프로그래머스
 * Leve2 
 * 귤고르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */
public class Solution26 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k, tangerine));
    }

    private static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap();
        
        // 사이즈별로 귤을 정리
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // value를 기준으로 내림차순 정렬
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2) - map.get(o1));
        /*
        위와 같은 코드
        keyList.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int x = map.get(o1);
                int y = map.get(o2);
                if(x == y) return 0;
                else if(x < y) return 1;
                else return -1;
            }
            
        });
        */
        // k의 개의 갯수만큼 상자에 담음
        int index = 0;
        int answer = 0;
        while(k > 0 ) {
            k -= map.get(keyList.get(index));
            answer++;
            index++;
        }
    
        return answer;
    }
}
