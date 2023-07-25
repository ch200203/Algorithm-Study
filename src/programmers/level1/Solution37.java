package programmers.level1;

/**
 * 옹알이(2)
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */
public class Solution37 {

    public static void main(String[] args) {

    }

    private static int solution(String[] babbling) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()  == 0) answer++;

        }
        return answer;
    }

}
