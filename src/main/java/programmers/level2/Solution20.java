package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스
 * 영어 끗말잇기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */
public class Solution20 {
    public static void main(String[] args) {
        int n = 2;
        // String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println(Arrays.toString(solution(n, words)));
    }

    private static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();

        set.add(words[0]);

        for(int i = 1; i < words.length; i++) {
            char lastWord = words[i - 1].charAt(words[i - 1].length() - 1);
            char fristWord = words[i].charAt(0);

            if(set.contains(words[i]) || lastWord != fristWord) {
                int num = (i % n) + 1;
                answer[0] = num;
                answer[1] = (i / n) + 1;
                return answer;
            } else {
                set.add(words[i]);
            }

            
        }

        return answer;
    }
}
