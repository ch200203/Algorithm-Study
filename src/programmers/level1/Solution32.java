package programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 숫자 짝궁
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 * 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
 * (단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). 
 * X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. 
 * X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
 */
public class Solution32 {
    public static void main(String[] args) {
        String X = "110000000000000000000";
        String Y = "0000000000000000001111100000";

        System.out.println(solution(X, Y));
        
    }

    public static String solution(String X, String Y) {
        List<Integer> numbers = new ArrayList<>();
        String answer = "-1";

        int[] x = new int[10];
        int[] y = new int[10];

        for (String strX : X.split("")) {
            x[Integer.parseInt(strX)]++;
        }

        for (String strY : Y.split("")) {
            y[Integer.parseInt(strY)]++;
        }
        
        for(int i = 0; i < 10; i++) {
            while(x[i] > 0 && y[i] > 0) {
                numbers.add(i);
                x[i]--;
                y[i]--;
            }
        }

        if(numbers.size() > 0) {
            StringBuilder sb = new StringBuilder();
            numbers.stream().sorted(Collections.reverseOrder()).forEach(num -> sb.append(num));
            if('0' == sb.toString().toCharArray()[0]) return "0";
            else return sb.toString();
        }
        
        return answer;
    }

    
}
