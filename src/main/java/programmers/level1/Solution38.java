package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스
 * 숫자 문자열과 영단어 Lv 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
 */
public class Solution38 {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        String str = "one4seveneight";
        System.out.println(solution(str));
    }

    private static int solution(String s) {
        String answer = s;

        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        for (String key : map.keySet()) {
            if (answer.contains(key)) {
                answer = answer.replaceAll(key, map.get(key).toString());
            }
        }

        return Integer.parseInt(answer);
    }

    private int bestSolution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
