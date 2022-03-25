package programmers.level2.sort;

import java.util.Arrays;

// H-index
// https://programmers.co.kr/learn/courses/30/lessons/42747

public class Solution1 {
    public static void main(String[] args) {
        int [] citations = {3,0,6,1,5};

        System.out.println(solution(citations));
    }    
    
    public static int solution(int[] citations) {
        int answer = 0;
        // citations => 논문의 인용횟수를 담은 배열

        Arrays.sort(citations);
    
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }
}
