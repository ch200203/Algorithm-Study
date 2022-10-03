package programmers.level2;

import java.util.*;;

// https://school.programmers.co.kr/learn/courses/30/lessons/12939
// 최대값과 최솟값
public class Solution14 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
        
    }

    public static String solution(String s) {
        String answer = "";
        int[] arr = new int[s.split(" ").length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }

        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length - 1];

        return answer;
    }


    // 다른 사람 풀이법
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }
}
