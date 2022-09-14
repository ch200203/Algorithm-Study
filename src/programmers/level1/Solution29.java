package programmers.level1;


/**
 *  숫자문자열과 영단어
 *  https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
 *  level 1
 */
public class Solution29 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
    
    public static int solution(String s) {
        String [] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
