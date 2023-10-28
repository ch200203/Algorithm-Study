package inflearn.chapter1;

import java.util.Scanner;

public class String_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(solution(str));
        
      }
      
      public static String solution(String str) {
        String answer;
        char[] s = str.toCharArray();

        int lt = 0, rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                // 알파벳이 아닐 때 lt의 위치를 증가
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                // swap
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        // String 으로 바꿔주는 메소드
        answer = String.valueOf(s); 

        return answer;
      }
}