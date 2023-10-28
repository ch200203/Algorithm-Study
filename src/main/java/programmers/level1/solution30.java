package programmers.level1;

import java.util.Arrays;


/** 
 *  프로그래머스 lv1
 * [1차] 비밀지도
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 * */
public class solution30 {
    public static void main(String[] args) {
        int[] arr1= {46, 33, 33, 22, 31, 50};
        int[] arr2= {27, 56, 19, 14, 14, 10};
        solution(6, arr1, arr2);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] arr1_toBinary = new String[n];
        String[] arr2_toBinary = new String[n];
        String [] answer = new String[n];

        Arrays.fill(answer, "");

        for (int i = 0; i < n; i++) {
            arr1_toBinary[i] = appendZero(Integer.toBinaryString(arr1[i]), n);
            arr2_toBinary[i] = appendZero(Integer.toBinaryString(arr2[i]), n);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1_toBinary[i].charAt(j) == arr2_toBinary[i].charAt(j)) {
                    if(arr1_toBinary[i].charAt(j) == '0') {
                        answer[i] += " ";   
                    }
                    if(arr1_toBinary[i].charAt(j) == '1') {
                        answer[i] += "#";
                    }
                } else {
                    answer[i] += "#";
                }
            }
        }
      
        return answer;
    }

    public static String appendZero(String str, int n) {
        while(str.length() < n) {
            str = "0" + str;
        }
        return str;
    }

    
}
