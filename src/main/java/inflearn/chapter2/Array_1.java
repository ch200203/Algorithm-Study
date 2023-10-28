package inflearn.chapter2;

import java.util.*;

public class Array_1 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
          arr[i] = in.nextInt();
        }
        System.out.println(solution(arr));
      }
      
    public static String solution(int[] arr) {
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer += arr[i] + " ";
            } else if(arr[i] > arr[i - 1]) {
                answer += arr[i] + " ";
            }
        }
        
        return answer;
    }
}
