package inflearn.chapter1;

import java.util.Scanner;


public class String_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "" ;
        
        for(char c : str.toCharArray()) {
            if(!answer.contains(String.valueOf(c))) answer += c;
        }
        return answer;
    }
}
